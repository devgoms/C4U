SELECT empno, SAL
FROM emp;

SELECT * --프로젝션
FROM emp; --셀렉션
------------------------
--컬럼별칭주기
SELECT empno 사번, ename, sal 급여
FROM emp;

SELECT empno AS "사원 번호", ename, sal AS 급여--띄어쓰기 공백도 문법으로 인식하므로 별칭줄때 띄어쓰기가 포함된다면 큰따옴표를 사용
FROM emp;
--------------------------
--컬럽값 결합연산자 ||(파이프 연산자 두개 사용)
SELECT empno || ename || sal "사번과 이름과 급여"--3개의 컬럼을 합쳐서 프로젝션
FROM emp;

--SQL에서의 문자열 리터럴, 날짜형 리터럴은 작은따옴표(')를 사용한다 ex)'hello', '21/05/07'
SELECT empno ||'-'|| ename || '-'|| sal "사번과 이름과 급여"
FROM emp;

----------------------------
--산술연산자 : + - * / 
--나머지값은 MOD함수를 이용해서 구한다 : MOD()
select empno, mod(empno, 2), ename, sal, sal*12
from emp;

-----------------------------
select deptno
from emp; --14건
-----------------------------
--중복값 제거 distinct
select distinct deptno
from emp;
-----------------------------
--정렬하기 order by(ASC는 생략가능)
select empno, ename, sal
from emp
order by sal desc, ename asc; -- 급여 같은 순서대로, 단 급여 같으면 이름을 사전순으로 출력
------------------------------
--select 구문 처리순서★ : selection[from->where->group by->having]-> projection[select->order by]
----------------------
select
from
[
where
group by 
having 
order by
]--생략 가능 
--order by에서 별칭 사용 가능
select empno, ename, sal "급여"
from emp
order by 급여 desc;
--order by에서 프로젝션에 참여하지 않은 컬럼사용 가능
select empno, ename
from emp
order by sal desc;
--order by에서 프로젝션에 참여한 컬럼 순번 사용 가능
select empno, ename, sal
from emp
order by 3 desc;--db에선 인덱스가 1부터 시작함 

-----------------------------
--where절: 조건에 만족하는 행을 selection
--비교연산자: >, >=, <, <=, =
--논리연산자: AND OR NOT

--급여가 1250인 사원의 사번 이름 급여를 출력
select empno, ename, sal
from emp
where sal=1250;
--급여가 1250보다 많은 사원의 사번 이름, 급여을 급여가 높은순으로 출력
select empno, ename, sal
from emp
where sal>1250
order by sal desc;
--급여가 1500이상 3000이하인 모든 사원의 사번, 이름, 급여를 출력
--단 급여가 많은 사원부터 출력
select empno, ename, sal
from emp
where sal>=1500 and sal<=3000
order by sal desc;

--급여가 1500미만 3000초과인 모든 사원의 사번, 이름, 급여를 출력
--단 급여가 많은 사원부터 출력
select empno, ename, sal
from emp
where sal>1500 or sal>3000
order by sal desc;
--or는 and연산의 반대 개념이므로 not으로 사용 가능
select empno, ename, sal
from emp
where not(sal>=1500 and sal<=3000)
order by sal desc;
--and 연산은 between으로 사용 가능 
select empno, ename, sal
from emp
where sal between 1500 and 3000 --between은 이상 이하일때만 사용 가능하다
order by sal desc;

select empno, ename, sal
from emp
where not sal between 1500 and 3000 --between은 이상 이하일때만 사용 가능하다
order by sal desc;
----------------------------
--부서번호가 10번이거나 30번인 사원의 사번, 이름, 급여, 부서번호를 출력
select empno, ename, sal, deptno
from emp
where deptno in (10,30);

----------------------------
--부서번호가 10번, 30번이고 급여가 1500이상, 3000이하인 사원의 사번, 이름, 급여, 부서번호를 출력
select empno, ename, sal, deptno
from emp
where deptno in(10,30) 
    and sal between 1500 and 3000;
--연산순서 1)in 2)between 3)and

----------------------------
--사원의 사번과 직무를 출력하시오
select empno,job
from emp;
--직무중 'MAN' 단어를 포함한 직무를 갖는 사원의 사번, 직무 출력
select empno, job
from emp
where job Like '%MAN%'; -- %:0개 이상의 단어

select empno, job
from emp
where job Like 'MAN%';
-- 1)%man: man으로 끝나는 단어, 2)man%: man으로 시작하는 단어, 3)%man%: man을 포함하는 모든 단어

--직무가 sales로 시작하고 8단어로 구성된 사원의 사번, 직무를 출력하시오
select empno, job
from emp
where job like 'SALES___';

--사번과 입사일자 출력
SELECT empno, hiredate
FROM emp;

--입사일자가 81년인 사원의 사번과 입사일자 출력
select empno, hiredate
from emp
where hiredate like '81%';
--like연산자는 처리속도가 떨어지므로 가능한한 사용 지양 아래와 같이 처리 가능
select empno, hiredate
from emp
where hiredate>='81/01/01'and hiredate<='81/12/31';

select empno, hiredate
from emp
where hiredate between '81/01/01' and '81/12/31';

-------------------------
-- NULL 관련 연산자 : IS NULL, IS NOT NULL
-- NULL: 아무값도 아니다, 값이 아니기때문에 equal연산자로 비교하지 않음
SELECT empno, sal, comm
from emp;

--수당이 없는 사원의 사번, 급여 , 수당을 출력
select empno, sal, comm
from emp
where comm is null;

-------------------------
--집합연산자
--10번 부서사원과 30번 부서사원의 사번, 부서번호 출력
select empno, deptno
from emp
where deptno=10;
union
select empno, deptno
from emp
where deptno=30;

