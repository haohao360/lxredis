package net.redis.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import framework.web.ReqBo;
import net.redis.component.user.IUserComponent;
import net.redis.dto.user.User;
import net.redis.service.user.IUserService;
@Service
public class UserService implements IUserService{
	@Autowired
	private IUserComponent iuc;
	
	public User selectUser(ReqBo reqBo) {
		return iuc.selectUser(reqBo.getParamStr("mobile"));
	}
	
}
