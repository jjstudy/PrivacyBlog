package ex.pb.blog.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ex.pb.blog.service.BlogService;
import ex.pb.blog.vo.BlogVO;
import ex.pb.user.vo.UserVO;

@Controller
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	@RequestMapping(value="blogInsert", method= RequestMethod.GET)
	public @ResponseBody List<BlogVO> blogInsert(HttpSession session,BlogVO blogVO) {
		UserVO uservo= (UserVO)session.getAttribute("userVO");
		blogVO.setUser_no(uservo.getNo());
		int result = blogService.blogInsert(blogVO);
		List<BlogVO> blogList = blogService.blogSelect(blogVO);
		return blogList;
	}
	
	@RequestMapping(value="blogSelect", method= RequestMethod.GET)
	public @ResponseBody List<BlogVO> blogSelect(HttpSession session,BlogVO blogVO) {
		UserVO uservo= (UserVO)session.getAttribute("userVO");
		blogVO.setUser_no(uservo.getNo());
		List<BlogVO> blogList = blogService.blogSelect(blogVO);
		return blogList;
	}

}
