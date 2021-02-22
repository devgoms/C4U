package com.my.service;

import java.util.List;

import com.my.exception.AddException;
import com.my.exception.DeleteException;
import com.my.exception.FindException;
import com.my.vo.Cart;
import com.my.vo.Lesson;

public interface ICartService {
	
	List<Lesson> findById(int studentId) throws FindException;
	
	
	void add(Cart cart) throws AddException;
	
	
	Cart remove(int cartId) throws DeleteException;

}
