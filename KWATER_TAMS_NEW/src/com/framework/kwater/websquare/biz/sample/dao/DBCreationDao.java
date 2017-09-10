package com.framework.kwater.websquare.biz.sample.dao;


/**
 * 템플릿 테이블 및 데이터를 생성하는 DAO 인터페이스
 * 
 * @author 김형준
 *
 */
public interface DBCreationDao {

	public int executeSQL(String[] statements);
}
