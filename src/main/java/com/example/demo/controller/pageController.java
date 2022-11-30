package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {
	
	@GetMapping("/")
	public String callIndexPage(HttpServletRequest request) {
		String ip = request.getRemoteAddr();
		System.out.println("요청받은 IP : " + ip);
		return "index";
	}
	
	@GetMapping("/home")
	public String callHomePage(HttpServletRequest request) {
		String ip = request.getRemoteAddr();
		System.out.println("요청받은 IP : " + ip);
		return "home";
	}
	
	@GetMapping("/tanmak2")
	public String callMyPage() {
		return "tanmak";
	}
	
	@GetMapping("/movie")
	public String callMoviePage() {
		return "movie";
	}
	@GetMapping("/login")
	public String callLoginPage() {
		return "login";
	}
	@GetMapping("/login2")
	public String callLogin2Page() {
		return "login2";
	}
	@GetMapping("/emp")
	public String callEmpPage() {
		return "emp";
	}
	@GetMapping("/dept")
	public String callDeptPage() {
		return "dept";
	}
}
