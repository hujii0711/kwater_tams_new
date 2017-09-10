package com.framework.kwater.websquare.biz.board.service;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.springframework.transaction.annotation.Transactional;

/**
 * 게시판 관련 처리를 위한 서비스 인터페이스
 * 
 * @author 김형준
 *
 */
public interface BoardService {
	
	/**
	 * 게시판 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getBoardList(Map param);
	
	/**
	 * 여러 건의 게시판 데이터를 변경 [등록] 한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	public void insertBoard(Map param) throws Exception;
	
	/**
	 * 여러 건의 게시판 데이터를 변경 [수정] 한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	public void updateBoard(Map param) throws Exception;
	
	/**
	 * 여러 건의 게시판 데이터를 변경 [삭제] 한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	public void deleteBoard(Map param) throws Exception;
	
}
