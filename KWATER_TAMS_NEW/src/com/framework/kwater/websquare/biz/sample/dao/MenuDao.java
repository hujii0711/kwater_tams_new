package com.framework.kwater.websquare.biz.sample.dao;

import java.util.List;
import java.util.Map;

/**
 * 메뉴 관련 테이블의 데이터를 조작하는 인터페이스
 * 
 * @author 김형준
 *
 */
public interface MenuDao {

	/**
	 * 메뉴 데이터 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getMenuList(Map param);
	
	/**
	 * 메뉴 데이터 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonMenuList(Map param);
	
	/**
	 * 메뉴 데이터를 추가한다.
	 * @param param
	 */
	public void insertMenu(Map param);
	
	/**
	 * 메뉴 데이터를 업데이트한다.
	 * @param param
	 */
	public void updateMenu(Map param);
	
	/**
	 * 메뉴 데이터를 삭제한다.
	 * @param param
	 */
	public void deleteMenu(Map param);
}
