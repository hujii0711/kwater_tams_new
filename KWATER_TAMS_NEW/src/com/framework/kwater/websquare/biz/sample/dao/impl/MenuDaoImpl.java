package com.framework.kwater.websquare.biz.sample.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.framework.kwater.websquare.biz.sample.dao.MenuDao;

/**
 * 메뉴 관련 테이블의 데이터를 조작하는 DAO 클래스
 * 
 * @author 김형준
 *
 */
@Repository
public class MenuDaoImpl implements MenuDao{
	
	protected final static Logger logger = Logger.getLogger(MenuDaoImpl.class);

	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * 메뉴 데이터 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getMenuList(Map param) {
		return this.sqlSession.selectList("menu.getMenuList", param);
	}
	
	/**
	 * 메뉴 데이터 정보를 조회한다.
	 * @param param
	 * @return
	 */
	public List<Map> getPersonMenuList(Map param) {
		return this.sqlSession.selectList("menu.getPersonMenuList", param);
	}
	
	/**
	 * 메뉴 데이터를 추가한다.
	 * @param param
	 */
	public void insertMenu(Map param) {
		this.sqlSession.insert("menu.insertMenu", param);
	}
	
	/**
	 * 메뉴 데이터를 업데이트한다.
	 * @param param
	 */
	public void updateMenu(Map param) {
		this.sqlSession.update("menu.updateMenu", param);
	}
	
	/**
	 * 메뉴 데이터를 삭제한다.
	 * @param param
	 */
	public void deleteMenu(Map param) {
		this.sqlSession.delete("menu.deleteMenu", param);
	}
}
