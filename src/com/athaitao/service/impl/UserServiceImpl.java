package com.athaitao.service.impl;

import com.athaitao.bean.User;
import com.athaitao.dao.UserDao;
import com.athaitao.dao.impl.UserDaoImpl;
import com.athaitao.service.UserService;

public class UserServiceImpl implements UserService{

	
	private UserDao userDao = new UserDaoImpl();
	/**
	 * 用户登录
	 */
	@Override
	public User getUser(User user) {
		return userDao.getUser(user);
	}
	@Override
	public User checkUser(String username) {
		
		return userDao.checkUser(username);
	}
	@Override
	public void registUser(User user) {
		userDao.regisUser(user);
		
	}

}
