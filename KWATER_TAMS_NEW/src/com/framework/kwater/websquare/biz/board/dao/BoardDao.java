package com.framework.kwater.websquare.biz.board.dao;

import java.util.List;
import java.util.Map;

/**
 * 조직 관련 테이블의 데이터를 조작하는 DAO 인터페이스
 * 
 * @author 김형준
 *
 */
public interface BoardDao {
	
	/**
	 * 조직 데이터 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getBoardList(Map param);
	
	/**
	 * 조직 데이터를 추가한다.
	 * @param param
	 */
	public void insertBoard(Map param);
	
	/**
	 * 조직 데이터를 업데이트한다.
	 * @param param
	 */
	public void updateBoard(Map param);
	
	/**
	 * 조직 데이터를 삭제한다.
	 * @param param
	 */
	public void deleteBoard(Map param);
}
