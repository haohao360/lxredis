package net.redis.dao.user;

import net.redis.dto.user.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectUserByMobile(@Param("mobile") String mobile);

}