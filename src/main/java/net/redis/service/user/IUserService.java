package net.redis.service.user;

import net.redis.dto.user.User;
import framework.web.ReqBo;

public interface IUserService {


	User selectUser(ReqBo reqBo);

}
