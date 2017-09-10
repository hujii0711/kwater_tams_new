package com.framework.kwater.websquare.biz.board.service.impl;

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

import com.framework.kwater.websquare.biz.board.dao.BoardDao;
import com.framework.kwater.websquare.biz.board.service.BoardService;
import com.framework.kwater.websquare.handler.RequestData;
import com.framework.kwater.websquare.biz.sample.bean.Login;

/**
 * 게시판 관련 처리를 위한 서비스 클래스
 * 
 * @author 김형준
 *
 */
@Service
public class BoardServiceImpl implements BoardService{
	
	protected final static Logger logger = Logger.getLogger(BoardServiceImpl.class);

	@Autowired
	private PlatformTransactionManager transactionManager;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	private BoardDao BoardDao;
	
	@Autowired
	private Login login;
	
	/**
	 *게시판 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getBoardList(Map param) {
		return this.BoardDao.getBoardList((Map) param.get("param"));
	}

	/**
	 * 여러 건의 게시판 데이터를 변경 [등록] 한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	@Transactional
	public void insertBoard(Map param) throws Exception {
		if (param.get("data") instanceof org.json.simple.JSONArray) {
			JSONArray list = (JSONArray) param.get("data");
			for (int i=0; i < list.size(); i++) {
				JSONObject item = (JSONObject) list.get(i);
				RequestData.setAccessInfo(item, login);
				this.BoardDao.insertBoard(item);
			}
		} else if (param.get("data") instanceof JSONObject) {
			this.BoardDao.insertBoard((JSONObject) param.get("data"));
		}
	}
	
	/**
	 * 여러 건의 게시판 데이터를 변경 [수정] 한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	@Transactional
	public void updateBoard(Map param) throws Exception {
		if (param.get("data") instanceof org.json.simple.JSONArray) {
			JSONArray list = (JSONArray) param.get("data");
			for (int i=0; i < list.size(); i++) {
				JSONObject item = (JSONObject) list.get(i);
				RequestData.setAccessInfo(item, login);
				this.BoardDao.updateBoard(item);
			}
		} else if (param.get("data") instanceof JSONObject) {
			this.BoardDao.updateBoard((JSONObject) param.get("data"));
		}
	}
	
	/**
	 * 여러 건의 게시판 데이터를 변경 [삭제] 한다.
	 * @param param Client 전달한 데이터 맵 객체
	 */
	@Transactional
	public void deleteBoard(Map param) throws Exception {
		if (param.get("data") instanceof org.json.simple.JSONArray) {
			JSONArray list = (JSONArray) param.get("data");
			for (int i=0; i < list.size(); i++) {
				JSONObject item = (JSONObject) list.get(i);
				RequestData.setAccessInfo(item, login);
				this.BoardDao.deleteBoard(item);
			}
		} else if (param.get("data") instanceof JSONObject) {
			this.BoardDao.deleteBoard((JSONObject) param.get("data"));
		}
	}

}
