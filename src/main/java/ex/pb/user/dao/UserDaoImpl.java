package ex.pb.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ex.pb.user.vo.UserVO;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SqlSession sqlsession;
	
	@Override
	public int signUp(UserVO user) {
		// TODO Auto-generated method stub
		return sqlsession.insert("UserMpr.signUp",user);
	}
	@Override
	public UserVO login(UserVO user) {
		// TODO Auto-generated method stub
		return sqlsession.selectOne("UserMpr.login",user);
	}

	
}
