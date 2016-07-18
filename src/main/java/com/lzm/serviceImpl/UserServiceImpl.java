package com.lzm.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzm.domain.User;
import com.lzm.mapping.UserMapper;
import com.lzm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	public User getUserByUserName(String userName) {
		return userMapper.selectByPrimaryKey(userName);
	}

	public User hasMatchUser(String userName, String password) {
		
		User user = userMapper.selectByPrimaryKey(userName);
		//如果用户存在且密码相同。
		if ( user != null && user.getPassword().equals(password))
			return user;
		else
			return null;
	}

}
