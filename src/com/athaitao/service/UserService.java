package com.athaitao.service;

import com.athaitao.bean.User;

public interface UserService {
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	User getUser(User user);

	User checkUser(String username);

	void registUser(User user);
	
}
