package com.framework.kwater.websquare.biz.sample.dao;

import java.util.List;
import java.util.Map;

/**
 * 개인 관련 테이블의 데이터를 조작하는 DAO 인터페이스
 * 
 * @author 김형준
 *
 */
public interface PersonDao {
	
	/**
	 * 개인 기본 정보 데이터 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonBasic(Map param);
	
	/**
	 * 로그인 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getLoginInfo(Map param);
	
	/**
	 * 개인 및 조직 정보 데이터 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonOrg(Map param);
	
	/**
	 * 개인 기본 정보 데이터를 추가한다.
	 * @param param
	 */
	public void insertPersonBasic(Map param);
	
	/**
	 * 개인 기본 정보 데이터를 업데이트한다.
	 * @param param
	 */
	public void updatePersonBasic(Map param);
	
	/**
	 * 개인 기본 정보 데이터를 삭제한다.
	 * @param param
	 */
	public void deletePersonBasic(Map param);
	
	/**
	 * 개인별 가족 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonFamilyList(Map param);
	
	/**
	 * 개인별 가족 최대 순번을 조회한다.
	 * @param param
	 * @return
	 */
	public int getPersonFamilyMaxSeq(Map param);
	
	/**
	 * 개인별 가족 데이터를 추가한다.
	 * @param param
	 */
	public void insertPersonFamily(Map param);
	
	/**
	 * 개인별 가족 데이터를 업데이트한다.
	 * @param param
	 */
	public void updatePersonFamily(Map param);
	
	/**
	 * 개인별 가족 데이터를 삭제한다.
	 * @param param
	 */
	public void deletePersonFamily(Map param);
	
	/**
	 * 개인별 프로젝트 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonProjectList(Map param);
	
	/**
	 * 개인별 프로젝트 최대 순번을 조회한다.
	 * @param param
	 * @return
	 */
	public int getPersonProjectMaxSeq(Map param);
	
	/**
	 * 개인별 프로젝트 데이터를 추가한다.
	 * @param param
	 */
	public void insertPersonProject(Map param);
	
	/**
	 * 개인별 프로젝트 데이터를 업데이트한다.
	 * @param param
	 */
	public void updatePersonProject(Map param);
	
	/**
	 * 개인별 프로젝트 데이터를 삭제한다.
	 * @param param
	 */
	public void deletePersonProject(Map param);
}
