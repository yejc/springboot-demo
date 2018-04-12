package cn.yejc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@RequestMapping("/login")
	public String login(String username,String password,HttpSession session) {
		if("yejc".equals(username) && "123".equals(password)) {
			session.setAttribute("username", username);
			return "登录成功";
		}
		return "密码错误";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		return "注销成功";
	}
}
