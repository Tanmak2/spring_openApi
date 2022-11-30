package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.service.ApiService;
import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVO;
import com.example.demo.vo.Movie;
import com.example.demo.vo.login;
import com.example.demo.vo.login2;

@RestController
public class ApiController {
	
	//@Autowired : Spring에서 객체를 관리함 (IoC : Inversion of Control 제어 역전)
	@Autowired
	ApiService apiService;
	
	@Autowired
	EmpMapper empMapper;

	@GetMapping("/api/v1/sample")
	public List<String> callData(){
		List<String> list = new ArrayList<>();
		list.add("삼겹살");
		list.add("항정살");
		list.add("목살");
		return list;
	}
	
	@GetMapping("/api/v1/movie")
	public Movie callMovie() {
		Movie movie = new Movie();
		movie.setTitle("Just Friends");
		movie.setYear("2005");
		movie.setRuntime("96 min");
		movie.setGanre("Comedy, Romance");
		return movie;
	}
	
	@GetMapping("/api/v1/movies")
	public List<Movie> callMovies(){
		
		return apiService.makeMovies();
	}
	
	@GetMapping("/api/v1/sports/qatar2022/article/{articleNumber}")
	public int callAtricle(@PathVariable int articleNumber) {
		return articleNumber;
	}
	
//	@GetMapping("/api/v1/webtoon/list")
//	public Map<String, Object> callWebtoon(@RequestParam int titleId, String weekday){
//		Map<String, Object> map = new HashMap<>();
//		map.put("titleId", titleId);
//		map.put("weekday", weekday);
//		
//		
//		return map;
//	}
	@GetMapping("/api/v1/webtoon/list/titleId/{titleId}/weekday/{weekday}")
	public Map<String, Object> callWebtoon(@PathVariable int titleId, @PathVariable String weekday){
		Map<String, Object> map = new HashMap<>();
		map.put("titleId", titleId);
		map.put("weekday", weekday);
		return map;
	}
	
	@PostMapping("api/v1/join")
	public boolean callJoin(@RequestBody login login) {
		System.out.println("HTML에서 서버로 받아온 데이터입니다.");
		System.out.println("아이디 : "+login.getId());
		System.out.println("비밀번호 : "+login.getPw());
		System.out.println("이메일 : "+login.getEmail());
		return true;
	}
	@PostMapping("api/v1/join2")
	public boolean callJoin(@RequestBody login2 login2) {
		System.out.println("HTML에서 서버로 받아온 데이터입니다.");
		System.out.println("회사 이름 : "+login2.getCompanyName());
		System.out.println("사용자 이름 : "+login2.getUserName());
		System.out.println("연락처 : "+login2.getPhone());
		return true;
	}
	
	@GetMapping("api/v1/emp")
	public List<EmpVO> callEmp(){
		return empMapper.selectEmp();
	}
	
	@GetMapping("api/v1/dept")
	public List<DeptVO> callDept(){
		return empMapper.selectDept();
	}
	
	@PostMapping("api/v1/emp/join")
	public int callEmpJoin(@RequestBody EmpVO emp) {
		return empMapper.insertEmp(emp);
	}
	
}
