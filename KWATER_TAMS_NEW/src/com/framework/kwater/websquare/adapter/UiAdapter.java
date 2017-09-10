package com.framework.kwater.websquare.adapter;

import javax.servlet.http.HttpServletRequest;

public interface UiAdapter {

	public Object convert(HttpServletRequest request) throws Exception;
	public Object convert(HttpServletRequest request, Object beanDef) throws Exception;
	
	public Class getModelName();
}
