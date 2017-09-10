package junit.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbTest {
    static String url;
    public static void main(String[] args) {
        url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; // url 형식
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver"); // JDBC 드라이버 로드
            conn = DriverManager.getConnection(url, "devTest", "devTest1234"); // 데이터베이스 연결(id/pw)
            if(conn==null){
                System.out.println("연결실패");
            }else{
                System.out.println("연결성공");
            }
        }catch(ClassNotFoundException ce){
            ce.printStackTrace();            
        }catch(SQLException se){
            se.printStackTrace();    
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{ // 연결 해제(한정돼 있으므로)
                if(rs!=null){        rs.close();            }
                if(pstmt!=null){    pstmt.close();        }
                if(stmt!=null){    stmt.close();        }
                if(conn!=null){    conn.close();        }
            }catch(SQLException se2){
                se2.printStackTrace();
            }            
        }
    }
}