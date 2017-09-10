package com.framework.kwater.websquare.biz.sample.service;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

/**
 * 코드 그룹 관련 처리를 위한 서비스 인터페이스
 * 
 * @author 김형준
 *
 */
public interface CodeService {

	/**
	 * 코드 그룹 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getCodeGrpList(Map param);
	
	/**
	 * 여러 건의 코드 그룹 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	public void saveCodeGrpList(Map param) throws Exception;
	
	/**
	 * 코드 그룹 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param sqlSession
	 * @param data 데이터 맵 객체
	 */
	public void saveCodeGrp(JSONObject data);
	
	/**
	 * 코드 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getCodeList(Map param);
	
	/**
	 * 여러 건의 코드 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	public void saveCodeList(Map param) throws Exception;
	
	/**
	 * 코드 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param sqlSession
	 * @param data 데이터 맵 객체
	 */
	public void saveCode(JSONObject data);
	
	/**
	 * 우편번호 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getZipCodeList(Map param);
}
