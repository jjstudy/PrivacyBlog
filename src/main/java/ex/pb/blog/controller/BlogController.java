package ex.pb.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ex.pb.blog.service.BlogService;
import ex.pb.blog.vo.BlogVO;

@Controller
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	@RequestMapping(value="blogInsert", method= RequestMethod.GET)
	public @ResponseBody List<BlogVO> blogInsert(BlogVO blogVO) {
		
		int result = blogService.blogInsert(blogVO);
		List<BlogVO> blogList = blogService.blogSelect();
		return blogList;
	}
	
	@RequestMapping(value="blogSelect", method= RequestMethod.GET)
	public @ResponseBody List<BlogVO> blogSelect() {
		
		List<BlogVO> blogList = blogService.blogSelect();
		return blogList;
	}

}
