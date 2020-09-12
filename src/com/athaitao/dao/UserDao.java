package com.athaitao.dao;

import com.athaitao.bean.User;

public interface UserDao {
	/**
	 * 查询一个用户
	 * @param user
	 * @return
	 */
	User getUser(User user);

	User checkUser(String username);

	void regisUser(User user);
	
}
