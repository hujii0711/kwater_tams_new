package com.framework.kwater.websquare.biz.sample.service;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

/**
 * 메뉴 관련 처리를 위한 서비스 인터페이스
 * 
 * @author 김형준
 *
 */
public interface MenuService {
	
	/**
	 * 메뉴별 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getMenuList(Map param);
	
	/**
	 * 개인별 메뉴 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonMenuList(Map param);

	/**
	 * 여러 건의 메뉴 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	public void saveMenuList(Map param) throws Exception;
	
	/**
	 * 메뉴 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param sqlSession
	 * @param data 데이터 맵 객체
	 */
	public void saveMenu(JSONObject data);
}
