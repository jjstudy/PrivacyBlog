package ex.pb.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ex.pb.user.service.UserService;
import ex.pb.user.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	/*로그인 페이지 get*/
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String loginGet() {
		return "main";
	}
	
	/*로그인 페이지 post*/
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String loginPost(HttpSession session,Model model, UserVO user) {
		
		UserVO userVO = userService.login(user);
		System.out.println(userVO);
		session.setAttribute("userVO", userVO);
		return "main";
	}
	
	/*회원가입 입력페이지*/
	@RequestMapping(value="signUp",method=RequestMethod.GET)
	public String signUpGet() {
		
		return "user/signUp";
	}
	
	/*회원가입 입력페이지 insert*/
	@RequestMapping(value="signUp", method=RequestMethod.POST)
	public String signUpPost(Model model, UserVO user) {

		int result = userService.signUp(user);
		return "main";
	}
	
	
}
