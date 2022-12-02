package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVO;
import com.example.demo.vo.UsersVO;


@Mapper
public interface EmpMapper {
	
	/**
	 * @Since : 2022. 11. 28.
	 * @Author : mr.Yun
	 * @Return : List<EmpVO>
	 * @Comment : EMP 테이블 전체 조회
	 */
	List<EmpVO> selectEmp();
	
	/**
	 * @Since : 2022. 11. 29.
	 * @Author : mr.Yun
	 * @Return : List<DeptVO>
	 * @Comment : Dept 테이블 전체 조회
	 */
	List<DeptVO> selectDept(); 
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : mr.Yun
	 * @Return : int
	 * @Comment : 사원 추가
	 */
	int insertEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : mr.Yun
	 * @Return : int
	 * @Comment : 부서 추가
	 */
	int insertDept(DeptVO vo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : mr.Yun
	 * @Return : int
	 * @Comment : 사원 삭제
	 */
	int deleteEmp(int empno);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : mr.Yun
	 * @Return : int
	 * @Comment : 부서 삭제
	 */
	int deleteDept(int deptno);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : mr.Yun
	 * @Return : int
	 * @Comment : 사원 정보 수정
	 */
	int updateEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : mr.Yun
	 * @Return : int
	 * @Comment : 부서 정보 수정
	 */
	int updateDept(DeptVO vo);
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : mr.Yun
	 * @Return : int
	 * @Comment : users 회원 가입
	 */
	int insertUsers(UsersVO vo);
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : mr.Yun
	 * @Return : int
	 * @Comment : 회원인지 아닌지 체크
	 */
	int selectUsersFindById(UsersVO vo);
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : mr.Yun
	 * @Return : List<UsersVO>
	 * @Comment : Users 테이블 전체 조회
	 */
	List<UsersVO> selectUsers();
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : mr.Yun
	 * @Return : int
	 * @Comment : 회원 삭제
	 */
	int deleteUsers(String id);
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : mr.Yun
	 * @Return : int
	 * @Comment : 회원 수정
	 */
	int updateUsers(UsersVO vo);
}
