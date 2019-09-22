package ex.pb.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ex.pb.user.dao.UserDao;
import ex.pb.user.vo.UserVO;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public int signUp(UserVO user) {
		return userDao.signUp(user);
	}

	@Override
	public UserVO login(UserVO user) {
		return userDao.login(user);
	}

}
