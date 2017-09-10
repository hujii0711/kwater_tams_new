package com.framework.kwater.websquare.biz.sample.service;

import java.io.IOException;

/**
 * 템플릿 테이블 및 데이터를 생성하는 서비스 인터페이스
 * 
 * @author 김형준
 *
 */
public interface DBCreationService {

	/**
	 * 템플릿 TYPE1 프로젝트에 사용하는 테이블 및 데이터를 생성하고 삭제하는 작업을 제어한다.
	 * @param serviceId 서비스 아이디
	 * @param action	액션
	 * @param param	 파라미터(데이터)
	 * @return 처리결과(처리결과 코드, 처리결과 메세지, 데이터)
	 * @throws Exception
	 */

	/**
	 * 전체 테이블을 생성하는 SQL을 실행한다.
	 * @throws Exception
	 */
	public void createAllTable() throws Exception;

	/**
	 * 초기 데이터를 Insert하는 SQL을 실행한다.
	 * @throws Exception
	 */
	public void insertBasicData() throws Exception;
	
	/**
	 * 우편번호 데이터를 Insert하는 SQL을 실행한다.
	 * @throws Exception
	 */
	public void insertZipCodeData() throws Exception;
	
	/**
	 * 전체 테이블을 Drop하는 SQL을 실행한다.
	 * @throws Exception
	 */
	public void dropAllTable() throws Exception;
	
	/**
	 * DB Script 파일을 읽어서 실행 SQL 문장 단위로 잘라서 문자열 배열에 저장해서 반환한다.
	 * @param filePath DB Script 파일명
	 * @return
	 * @throws IOException
	 */
	public String[] getSQLStatementsFromFile(String filePath) throws IOException;
}
