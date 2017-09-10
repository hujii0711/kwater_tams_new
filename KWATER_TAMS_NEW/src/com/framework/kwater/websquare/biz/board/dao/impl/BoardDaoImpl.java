package com.framework.kwater.websquare.biz.board.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.framework.kwater.websquare.biz.board.dao.BoardDao;

/**
 * 게시판 관련 테이블의 데이터를 조작하는 DAO 클래스
 * 
 * @author 김형준
 *
 */
@Repository
public class BoardDaoImpl implements BoardDao{
	
	protected final static Logger logger = Logger.getLogger(BoardDaoImpl.class);

	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * 게시판 데이터 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getBoardList(Map param) {
		return this.sqlSession.selectList("board.getBoardList", param);
	}
	
	/**
	 * 게시판 데이터를 추가한다.
	 * @param param
	 */
	public void insertBoard(Map param) {
		this.sqlSession.insert("board.insertBoard", param);
	}
	
	/**
	 * 게시판 데이터를 업데이트한다.
	 * @param param
	 */
	public void updateBoard(Map param) {
		this.sqlSession.update("board.updateBoard", param);
	}
	
	/**
	 * 게시판 데이터를 삭제한다.
	 * @param param
	 */
	public void deleteBoard(Map param) {
		this.sqlSession.delete("board.deleteBoard", param);
	}
}
