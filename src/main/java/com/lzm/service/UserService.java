package com.lzm.service;

import com.lzm.domain.User;

public interface UserService {
		public User getUserByUserName(String userName);
		/**
		 * 是否有匹配的用户
		 * @param userName
		 * @param password
		 * @return 没有匹配的返回null，有则返回一个User实例
		 */
		public User hasMatchUser(String userName, String password);
}
