package com.framework.kwater.websquare.biz.sample.dao;

import java.util.List;
import java.util.Map;

/**
 * 조직 관련 테이블의 데이터를 조작하는 DAO 인터페이스
 * 
 * @author 김형준
 *
 */
public interface OrganDao {
	
	/**
	 * 조직 데이터 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getOrganBasicList(Map param);
	
	/**
	 * 조직 데이터를 추가한다.
	 * @param param
	 */
	public void insertOrganBasic(Map param);
	
	/**
	 * 조직 데이터를 업데이트한다.
	 * @param param
	 */
	public void updateOrganBasic(Map param);
	
	/**
	 * 조직 데이터를 삭제한다.
	 * @param param
	 */
	public void deleteOrganBasic(Map param);
}
