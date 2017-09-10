package com.framework.kwater.websquare.biz.sample.service;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.springframework.transaction.annotation.Transactional;

/**
 * 조직 관련 처리를 위한 서비스 인터페이스
 * 
 * @author 김형준
 *
 */
public interface OrganService {
	
	/**
	 * 조직 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getOrganBasicList(Map param);
	
	/**
	 * 여러 건의 조직 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	@Transactional
	public void saveOrganBasicList(Map param) throws Exception;
	
	/**
	 * 조직 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param sqlSession
	 * @param data 데이터 맵 객체
	 */
	public void saveOrganBasic(JSONObject data);
}
