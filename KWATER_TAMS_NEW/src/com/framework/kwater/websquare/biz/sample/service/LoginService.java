package com.framework.kwater.websquare.biz.sample.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

/**
 * 코드 그룹 관련 처리를 위한 서비스 인터페이스
 * 
 * @author 김형준
 *
 */
public interface LoginService {

	public ModelAndView login(Map param, HttpServletRequest request) throws Exception;
	
	public ModelAndView logout(HttpServletRequest request);
	
	public ModelAndView isLogin();
}
