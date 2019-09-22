package ex.pb.user.dao;

import ex.pb.user.vo.UserVO;

public interface UserDao {

	int signUp(UserVO user);

	UserVO login(UserVO user);

}
