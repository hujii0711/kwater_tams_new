package com.framework.kwater.websquare.handler;

import java.util.Map;

import com.framework.kwater.websquare.biz.sample.bean.Login;
import com.framework.kwater.websquare.util.DateUtil;

/**
 * Client에 받은 Request 데이터 관련 처리를 위한 클래스
 * 
 * @author Park, Sang Kyu
 */
public class RequestData {

	public static void setAccessInfo(Map data, Login login) {
		data.put("CREATED_DATE", DateUtil.getCurrentDate());
		data.put("UPDATED_DATE", DateUtil.getCurrentDate());
		data.put("UPDATED_ID", login.getUserId());
		data.put("UPDATED_IP", login.getRemoteAddr());
	}
}
