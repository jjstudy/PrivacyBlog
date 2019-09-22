package ex.pb.blog.dao;

import java.util.List;

import ex.pb.blog.vo.BlogVO;

public interface BlogDao {

	int blogInsert(BlogVO blogVO);

	List<BlogVO> blogSelect(BlogVO blogVO);
}
