package ex.pb.blog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ex.pb.blog.vo.BlogVO;

@Repository
public class BlogDaoImpl implements BlogDao {

	@Autowired
	SqlSession sqlsession;
	
	@Override
	public int blogInsert(BlogVO blogVO) {
		return sqlsession.insert("BlogMpr.blogInsert",blogVO);
	}

	@Override
	public List<BlogVO> blogSelect(BlogVO blogVO) {
		// TODO Auto-generated method stub
		return sqlsession.selectList("BlogMpr.blogSelect",blogVO);
	}

}
