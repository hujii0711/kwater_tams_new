package com.framework.kwater.websquare.biz.board.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.framework.kwater.websquare.biz.board.service.BoardService;
import com.framework.kwater.websquare.handler.ResponseData;
import com.framework.kwater.websquare.biz.common.AbstractController;

/**
 * 게시판 컨트롤러 클래스
 * @author 김형준
 *
 */
@Controller
@RequestMapping("/board")
public class BoardController extends AbstractController {

	protected final static Logger logger = Logger.getLogger(BoardController.class);

	@Autowired
	private BoardService boardService;
	
	/**
	 * 게시판 데이터를 [조회] 한다.
	 * @param param 클라이언트에서 전달한 데이터 맵 객체
	 * @return
	 */
	@RequestMapping(value = "/getBoardList")
	public ModelAndView getBoardList(Map param) {
		return ResponseData.getResponseData(boardService.getBoardList(param));
	}
	
	/**
	 * 한 건 또는 다 건의 게시판 데이터를 [등록] 한다.
	 * @param param 클라이언트에서 전달한 데이터 맵 객체
	 * @return
	 */
	@RequestMapping(value = "/insertBoard")
	public ModelAndView insertBoard(Map param) throws Exception {
		boardService.insertBoard(param);
		return ResponseData.getResponseData(ResponseData.STATUS_SUCESS);
	}
	
	/**
	 * 한 건 또는 다 건의 게시판 데이터를 [수정] 한다.
	 * @param param 클라이언트에서 전달한 데이터 맵 객체
	 * @return
	 */
	@RequestMapping(value = "/updateBoard")
	public ModelAndView updateBoard(Map param) throws Exception {
		boardService.updateBoard(param);
		return ResponseData.getResponseData(ResponseData.STATUS_SUCESS);
	}
	
	/**
	 * 한 건 또는 다 건의 게시판 데이터를 [삭제] 한다.
	 * @param param 클라이언트에서 전달한 데이터 맵 객체
	 * @return
	 */
	@RequestMapping(value = "/deleteBoard")
	public ModelAndView deleteBoard(Map param) throws Exception {
		boardService.deleteBoard(param);
		return ResponseData.getResponseData(ResponseData.STATUS_SUCESS);
	}
	
}
