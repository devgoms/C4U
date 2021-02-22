SELECT empno, SAL
FROM emp;

SELECT * --��������
FROM emp; --������
------------------------
--�÷���Ī�ֱ�
SELECT empno ���, ename, sal �޿�
FROM emp;

SELECT empno AS "��� ��ȣ", ename, sal AS �޿�--���� ���鵵 �������� �ν��ϹǷ� ��Ī�ٶ� ���Ⱑ ���Եȴٸ� ū����ǥ�� ���
FROM emp;
--------------------------
--�÷��� ���տ����� ||(������ ������ �ΰ� ���)
SELECT empno || ename || sal "����� �̸��� �޿�"--3���� �÷��� ���ļ� ��������
FROM emp;

--SQL������ ���ڿ� ���ͷ�, ��¥�� ���ͷ��� ��������ǥ(')�� ����Ѵ� ex)'hello', '21/05/07'
SELECT empno ||'-'|| ename || '-'|| sal "����� �̸��� �޿�"
FROM emp;

----------------------------
--��������� : + - * / 
--���������� MOD�Լ��� �̿��ؼ� ���Ѵ� : MOD()
select empno, mod(empno, 2), ename, sal, sal*12
from emp;

-----------------------------
select deptno
from emp; --14��
-----------------------------
--�ߺ��� ���� distinct
select distinct deptno
from emp;
-----------------------------
--�����ϱ� order by(ASC�� ��������)
select empno, ename, sal
from emp
order by sal desc, ename asc; -- �޿� ���� �������, �� �޿� ������ �̸��� ���������� ���
------------------------------
--select ���� ó�������� : selection[from->where->group by->having]-> projection[select->order by]
----------------------
select
from
[
where
group by 
having 
order by
]--���� ���� 
--order by���� ��Ī ��� ����
select empno, ename, sal "�޿�"
from emp
order by �޿� desc;
--order by���� �������ǿ� �������� ���� �÷���� ����
select empno, ename
from emp
order by sal desc;
--order by���� �������ǿ� ������ �÷� ���� ��� ����
select empno, ename, sal
from emp
order by 3 desc;--db���� �ε����� 1���� ������ 

-----------------------------
--where��: ���ǿ� �����ϴ� ���� selection
--�񱳿�����: >, >=, <, <=, =
--��������: AND OR NOT

--�޿��� 1250�� ����� ��� �̸� �޿��� ���
select empno, ename, sal
from emp
where sal=1250;
--�޿��� 1250���� ���� ����� ��� �̸�, �޿��� �޿��� ���������� ���
select empno, ename, sal
from emp
where sal>1250
order by sal desc;
--�޿��� 1500�̻� 3000������ ��� ����� ���, �̸�, �޿��� ���
--�� �޿��� ���� ������� ���
select empno, ename, sal
from emp
where sal>=1500 and sal<=3000
order by sal desc;

--�޿��� 1500�̸� 3000�ʰ��� ��� ����� ���, �̸�, �޿��� ���
--�� �޿��� ���� ������� ���
select empno, ename, sal
from emp
where sal>1500 or sal>3000
order by sal desc;
--or�� and������ �ݴ� �����̹Ƿ� not���� ��� ����
select empno, ename, sal
from emp
where not(sal>=1500 and sal<=3000)
order by sal desc;
--and ������ between���� ��� ���� 
select empno, ename, sal
from emp
where sal between 1500 and 3000 --between�� �̻� �����϶��� ��� �����ϴ�
order by sal desc;

select empno, ename, sal
from emp
where not sal between 1500 and 3000 --between�� �̻� �����϶��� ��� �����ϴ�
order by sal desc;
----------------------------
--�μ���ȣ�� 10���̰ų� 30���� ����� ���, �̸�, �޿�, �μ���ȣ�� ���
select empno, ename, sal, deptno
from emp
where deptno in (10,30);

----------------------------
--�μ���ȣ�� 10��, 30���̰� �޿��� 1500�̻�, 3000������ ����� ���, �̸�, �޿�, �μ���ȣ�� ���
select empno, ename, sal, deptno
from emp
where deptno in(10,30) 
    and sal between 1500 and 3000;
--������� 1)in 2)between 3)and

----------------------------
--����� ����� ������ ����Ͻÿ�
select empno,job
from emp;
--������ 'MAN' �ܾ ������ ������ ���� ����� ���, ���� ���
select empno, job
from emp
where job Like '%MAN%'; -- %:0�� �̻��� �ܾ�

select empno, job
from emp
where job Like 'MAN%';
-- 1)%man: man���� ������ �ܾ�, 2)man%: man���� �����ϴ� �ܾ�, 3)%man%: man�� �����ϴ� ��� �ܾ�

--������ sales�� �����ϰ� 8�ܾ�� ������ ����� ���, ������ ����Ͻÿ�
select empno, job
from emp
where job like 'SALES___';

--����� �Ի����� ���
SELECT empno, hiredate
FROM emp;

--�Ի����ڰ� 81���� ����� ����� �Ի����� ���
select empno, hiredate
from emp
where hiredate like '81%';
--like�����ڴ� ó���ӵ��� �������Ƿ� �������� ��� ���� �Ʒ��� ���� ó�� ����
select empno, hiredate
from emp
where hiredate>='81/01/01'and hiredate<='81/12/31';

select empno, hiredate
from emp
where hiredate between '81/01/01' and '81/12/31';

-------------------------
-- NULL ���� ������ : IS NULL, IS NOT NULL
-- NULL: �ƹ����� �ƴϴ�, ���� �ƴϱ⶧���� equal�����ڷ� ������ ����
SELECT empno, sal, comm
from emp;

--������ ���� ����� ���, �޿� , ������ ���
select empno, sal, comm
from emp
where comm is null;

-------------------------
--���տ�����
--10�� �μ������ 30�� �μ������ ���, �μ���ȣ ���
select empno, deptno
from emp
where deptno=10;
union
select empno, deptno
from emp
where deptno=30;

