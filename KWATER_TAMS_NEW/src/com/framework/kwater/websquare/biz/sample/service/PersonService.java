package com.framework.kwater.websquare.biz.sample.service;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

/**
 * 개인 관련 처리를 위한 서비스 인터페이스
 * 
 * @author 김형준
 *
 */
public interface PersonService {
	
	/**
	 * 개인 기본 정보 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonBasic(Map param);
	
	/**
	 * 현재 로그인된 사용자의 개인 기본 정보 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getLoginPersonBasic();
	
	/**
	 * 개인 및 조직 정보 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonOrg(Map param);
	
	/**
	 * 여러 건의 개인 기본 정보 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	public void savePersonBasicList(Map param) throws Exception;
	
	/**
	 * 개인 기본 정보 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param data 데이터 맵 객체
	 */
	public void savePersonBasic(JSONObject data);
	
	/**
	 * 개인별 가족 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonFamilyList(Map param);
	
	/**
	 * 여러 건의 개인별 가족 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	public void savePersonFamilyList(Map param) throws Exception;
	
	/**
	 * 개인별 가족 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param data 데이터 맵 객체
	 */
	public void savePersonFamily(JSONObject data);
	
	/**
	 * 개인별 프로젝트 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonProjectList(Map param);
	
	/**
	 * 여러 건의 개인별 프로젝트 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	public void savePersonProjectList(Map param) throws Exception;
	
	/**
	 * 사원별 프로젝트 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param data 데이터 맵 객체
	 */
	public void savePersonProject(JSONObject data);
	
	/**
	 * 한 개인 기본 정보와 가족, 프로젝트 정보를 모두 변경한다.
	 * @param data
	 */
	public void savePersonInfo(Map data) throws Exception;
}
