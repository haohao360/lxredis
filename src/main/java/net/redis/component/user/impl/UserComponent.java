package net.redis.component.user.impl;

import net.redis.component.user.IUserComponent;
import net.redis.dao.user.UserMapper;
import net.redis.dto.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserComponent implements IUserComponent{
	@Autowired
	private UserMapper userMapper;
	public User selectUser(String mobile) {
		return userMapper.selectUserByMobile(mobile);
	}

}
