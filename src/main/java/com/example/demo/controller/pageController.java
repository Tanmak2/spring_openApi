package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	@GetMapping("/login3")
	public String callLogin3Page() {
		return "login3";
	}
	@GetMapping("/users")
	public String callUsersPage(HttpServletRequest req, ModelMap map) {
		//ModelMap HTML에 데이터를 전달함! HTML에 데이터를 전달하는 방법은 크게 2가지
		//1. AJAX를 이용한 데이터 처리
		//2. ModelMap을 활용한 데이터 처리
		//실무에서는 1번과 2번을 번갈아 가면서 쓰지만, 우리는 1번에 초점을 두고 공부해야 함.
		//2번은 쓰는 곳도 있고 안쓰는 곳도 있기 때문에
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");
		System.out.println("name ===> " + name);
		map.addAttribute("name", name);
		return "users";
	}
}
