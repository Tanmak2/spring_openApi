package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.vo.Movie;

@Service
public class ApiService {
	
	
	/**
	 * @Since : 2022. 11. 23.
	 * @Author : mr.Yun
	 * @Return : List<Movie>
	 * @Comment : 영화 만들기
	 */
	public List<Movie> makeMovies(){
		
		List<Movie> list = new ArrayList<>();
		Movie movie = new Movie();
		movie.setTitle("데시벨");
		movie.setYear("2022");
		movie.setRuntime("110분");
		movie.setGanre("액션");
		
		Movie movie2 = new Movie();
		movie2.setTitle("동감");
		movie2.setYear("2022");
		movie2.setRuntime("114분");
		movie2.setGanre("멜로/로맨스");
		
		Movie movie3 = new Movie();
		movie3.setTitle("자백");
		movie3.setYear("2022");
		movie3.setRuntime("105분");
		movie3.setGanre("범죄");
		
		Movie movie4 = new Movie();
		movie4.setTitle("올빼미");
		movie4.setYear("2022");
		movie4.setRuntime("118분");
		movie4.setGanre("스릴러");
		
		Movie movie5 = new Movie();
		movie5.setTitle("블랙 팬서: 와칸다 포에버");
		movie5.setYear("2022");
		movie5.setRuntime("161분");
		movie5.setGanre("액션");
		
		list.add(movie);
		list.add(movie2);
		list.add(movie3);
		list.add(movie4);
		list.add(movie5);
		
		return list;
	}
}
