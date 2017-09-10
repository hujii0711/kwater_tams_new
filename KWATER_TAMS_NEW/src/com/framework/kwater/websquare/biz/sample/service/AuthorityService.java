package com.framework.kwater.websquare.biz.sample.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import com.framework.kwater.websquare.handler.RequestData;
import com.framework.kwater.websquare.biz.sample.bean.Login;
import com.framework.kwater.websquare.biz.sample.dao.AuthorityDao;

/**
 * 권한 관련 처리를 위한 서비스 인터페이스
 * 
 * @author 김형준
 *
 */
public interface AuthorityService {
	
	/**
	 * 권한 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getAuthorityList(Map param);

	/**
	 * 여러 건의 권한 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	public void saveAuthorityList(Map param) throws Exception;
	
	/**
	 * 권한 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param sqlSession
	 * @param data 데이터 맵 객체
	 */
	public void saveAuthority(JSONObject data);
	
	/**
	 * 메뉴별 권한 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getAuthorityMenuList(Map param);
	
	/**
	 * 여러 건의 메뉴 권한 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	public void saveAuthorityMenuList(Map param) throws Exception;
	
	/**
	 * 메뉴 권한 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param sqlSession
	 * @param data 데이터 맵 객체
	 */
	public void saveAuthorityMenu(JSONObject data);
	
	/**
	 * 권한별 사원 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonAuthorityList(Map param);

	/**
	 * 여러 건의 권한별 사원 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	@Transactional
	public void savePersonAuthorityList(Map param) throws Exception;
	
	/**
	 * 권한별 사원 데이터를 변경(등록, 수정, 삭제)한다.
	 * @param sqlSession
	 * @param data 데이터 맵 객체
	 */
	public void savePersonAuthority(JSONObject data);
}
