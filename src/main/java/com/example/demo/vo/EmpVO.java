package com.example.demo.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpVO extends BaseVO {
	private int empno;
	private String ename;
	private String job;
	private int sal;
	private String hiredate;
}
