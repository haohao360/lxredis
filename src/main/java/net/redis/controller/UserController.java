package net.redis.controller;

import javax.servlet.http.HttpServletRequest;

import net.redis.dto.user.User;
import net.redis.service.user.IUserService;

import net.redis.service.user.impl.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import framework.web.ReqBo;
import framework.web.ResBo;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private IUserService ius;
	/**
	 * 
	 * 根据条件，分页查找cms用户信息
	 * 
	 * */
	@RequestMapping(value = "infos.htm")
	@ResponseBody
	public ResBo<User> getCmsUserInfos(
			HttpServletRequest request) {
		ReqBo reqBo = new ReqBo(request);
		reqBo.setParam("mobile", "15090195882");
		User u = ius.selectUser(reqBo);
		System.out.println(u.getUserName());
		return null;
	}
}
