package net.redis.component.user;

import net.redis.dto.user.User;

public interface IUserComponent {

	User selectUser(String mobile);

}
