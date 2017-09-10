package com.framework.kwater.websquare.biz.sample.dao;

import java.util.List;
import java.util.Map;

/**
 * 코드 관련 테이블의 데이터를 조작하는 DAO 인터페이스
 * 
 * @author 김형준
 *
 */
public interface CodeDao {
	
	/**
	 * 코드 그룹 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getCodeGrpList(Map param);
	
	/**
	 * 코드 그룹 데이터를 추가한다.
	 * @param param
	 */
	public void insertCodeGrp(Map param);
	
	/**
	 * 코드 그룹 데이터를 업데이트한다.
	 * @param param
	 */
	public void updateCodeGrp(Map param);
	
	/**
	 * 코드 그룹 데이터를 삭제한다.
	 * @param param
	 */
	public void deleteCodeGrp(Map param);
	
	/**
	 * 코드 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getCodeList(Map param);
	
	/**
	 * 코드 데이터를 추가한다.
	 * @param param
	 */
	public void insertCode(Map param);

	
	/**
	 * 코드 데이터를 업데이트한다.
	 * @param param
	 */
	public void updateCode(Map param);
	
	/**
	 * 코드 데이터를 삭제한다.
	 * @param param
	 */
	public void deleteCode(Map param);
	
	/**
	 * 우편번호 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getZipCodeList(Map param);
}
