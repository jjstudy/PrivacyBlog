package ex.pb.blog.service;

import java.util.List;

import ex.pb.blog.vo.BlogVO;

public interface BlogService {

	int blogInsert(BlogVO blogVO);

	List<BlogVO> blogSelect();
}
