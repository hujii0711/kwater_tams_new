package com.framework.kwater.websquare.biz.sample.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.framework.kwater.websquare.biz.sample.dao.AuthorityDao;

/**
 * 권한 관련 테이블의 데이터를 조작하는 DAO 클래스
 * 
 * @author 김형준
 *
 */
@Repository
public class AuthorityDaoImpl implements AuthorityDao {
	
	protected final static Logger logger = Logger.getLogger(AuthorityDaoImpl.class);

	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * 권한 데이터 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getAuthorityList(Map param) {
		return this.sqlSession.selectList("authority.getAuthorityList", param);
	}
	
	/**
	 * 권한 데이터를 추가한다.
	 * @param param
	 */
	public void insertAuthority(Map param) {
		this.sqlSession.insert("authority.insertAuthority", param);
	}
	
	/**
	 * 권한 데이터를 업데이트한다.
	 * @param param
	 */
	public void updateAuthority(Map param) {
		this.sqlSession.update("authority.updateAuthority", param);
	}
	
	/**
	 * 권한 데이터를 삭제한다.
	 * @param param
	 */
	public void deleteAuthority(Map param) {
		this.sqlSession.delete("authority.deleteAuthority", param);
	}
	
	/**
	 * 권한별 메뉴 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getAuthorityMenuList(Map param) {
		return this.sqlSession.selectList("authority.getAuthorityMenuList", param);
	}
	
	/**
	 * 권한별 메뉴 데이터를 추가한다.
	 * @param param
	 */
	public void insertAuthorityMenu(Map param) {
		this.sqlSession.insert("authority.insertAuthorityMenu", param);
	}
	
	/**
	 * 권한별 메뉴 데이터를 삭제한다.
	 * @param param
	 */
	public void deleteAuthorityMenu(Map param) {
		this.sqlSession.delete("authority.deleteAuthorityMenu", param);
	}
	
	/**
	 * 권한별 사원 데이터를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonAuthorityList(Map param) {
		return this.sqlSession.selectList("authority.getPersonAuthorityList", param);
	}
	
	/**
	 * 권한별 사원 데이터를 추가한다.
	 * @param param
	 */
	public void insertPersonAuthority(Map param) {
		this.sqlSession.insert("authority.insertPersonAuthority", param);
	}
	
	/**
	 * 권한별 사원 데이터를 삭제한다.
	 * @param param
	 */
	public void deletePersonAuthority(Map param) {
		this.sqlSession.delete("authority.deletePersonAuthority", param);
	}
}
