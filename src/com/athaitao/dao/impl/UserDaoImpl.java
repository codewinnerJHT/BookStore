package com.athaitao.dao.impl;

import com.athaitao.bean.User;
import com.athaitao.dao.BaseDao;
import com.athaitao.dao.UserDao;

public class UserDaoImpl extends BaseDao<User> implements UserDao{

	@Override
	public User getUser(User user) {
		String sql ="select id,username,`password`,email from user where username = ? and `password` = ?";
		return this.getBean(sql,user.getUsername(),user.getPassword());
	}

	@Override
	public User checkUser(String username) {
		String sql="select id,username,`password`,email from user where username = ? ";
		return this.getBean(sql, username);
	}

	@Override
	public void regisUser(User user) {
		String sql ="insert into user(username,`password`,email) values(?,?,?)";
		this.update(sql, user.getUsername(),user.getPassword(),user.getEmail());
		
	}

}
