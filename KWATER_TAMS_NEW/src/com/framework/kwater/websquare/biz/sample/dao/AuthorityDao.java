package com.framework.kwater.websquare.biz.sample.dao;

import java.util.List;
import java.util.Map;

/**
 * 권한 관련 테이블의 데이터를 조작하는 DAO 인터페이스
 * 
 * @author 김형준
 *
 */
public interface AuthorityDao {
	
	/**
	 * 권한 데이터 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getAuthorityList(Map param);
	
	/**
	 * 권한 데이터를 추가한다.
	 * @param param
	 */
	public void insertAuthority(Map param);
	
	/**
	 * 권한 데이터를 업데이트한다.
	 * @param param
	 */
	public void updateAuthority(Map param);
	
	/**
	 * 권한 데이터를 삭제한다.
	 * @param param
	 */
	public void deleteAuthority(Map param);
	
	/**
	 * 권한별 메뉴 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getAuthorityMenuList(Map param);
	
	/**
	 * 권한별 메뉴 데이터를 추가한다.
	 * @param param
	 */
	public void insertAuthorityMenu(Map param);
	
	/**
	 * 권한별 메뉴 데이터를 삭제한다.
	 * @param param
	 */
	public void deleteAuthorityMenu(Map param);
	
	/**
	 * 권한별 사원 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonAuthorityList(Map param);
	
	/**
	 * 권한별 사원 데이터를 추가한다.
	 * @param param
	 */
	public void insertPersonAuthority(Map param);
	
	/**
	 * 권한별 사원 데이터를 삭제한다.
	 * @param param
	 */
	public void deletePersonAuthority(Map param);
}
