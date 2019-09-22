package ex.pb.user.service;


import ex.pb.user.vo.UserVO;

public interface UserService {

	int signUp(UserVO user);

	UserVO login(UserVO user);
}
