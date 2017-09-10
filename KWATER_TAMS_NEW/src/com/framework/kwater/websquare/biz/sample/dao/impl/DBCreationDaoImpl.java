package com.framework.kwater.websquare.biz.sample.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.framework.kwater.websquare.biz.sample.dao.DBCreationDao;

/**
 * 템플릿 테이블 및 데이터를 생성하는 DAO 클래스
 * 
 * @author 김형준
 *
 */
@Repository
public class DBCreationDaoImpl implements DBCreationDao {
	
	protected final static Logger logger = Logger.getLogger(DBCreationDaoImpl.class);

	@Autowired
	private SqlSession sqlSession;
	
	public int executeSQL(String[] statements) {
		int count = 0;
		
		for (int i = 0, iCnt = statements.length; i < iCnt; i++) {
			Map sqlMap = new HashMap();
			sqlMap.put("sql", statements[i]);
			count += this.sqlSession.update("custom.update", sqlMap);
			logger.info(statements[i]);
		}
		
		return count;
	}
}
