package ex.pb.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ex.pb.blog.dao.BlogDao;
import ex.pb.blog.vo.BlogVO;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	BlogDao blogDao;

	@Override
	public int blogInsert(BlogVO blogVO) {
		return blogDao.blogInsert(blogVO);
	}

	@Override
	public List<BlogVO> blogSelect(BlogVO blogVO) {
		return blogDao.blogSelect(blogVO);
	}

}
