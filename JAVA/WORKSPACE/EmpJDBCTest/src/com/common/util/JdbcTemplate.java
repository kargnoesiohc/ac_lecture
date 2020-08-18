

package com.common.util;

import java.sql.*;


public class JdbcTemplate { //드라이버 로딩, db연결, conn리턴, con.close()

	public static String driver="oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	public static String userid = "scott";
	public static String passwd = "tiger";
	
	public JdbcTemplate() throws ClassNotFoundException { 
			//드라이버 로딩
			Class.forName(driver);
			System.out.println("Driver Loading");
			
	}
    public static Connection getConnection() throws SQLException {
       // connect연결 후 tx를 false로 설정 리턴 
    		Connection conn = DriverManager.getConnection(url,userid,passwd);
    		conn.setAutoCommit(false);
    		
        return conn;
    }

    /**
     * DB와 Connect되었는지 여부를 Return 한다.
     * 
     * @return DB와 Connect 되었는지 여부.
     * @throws SQLException 
     */
    public static boolean isConnected(Connection conn) throws SQLException {
//conn 이 null 이거나   conn.isClosed()가 참이면  validConnection을 false 로 설정 
//    		isClosed() false: 연결됨, true: 연결 해제

        boolean validConnection = true;
        if(conn == null || conn.isClosed() ) {
        		validConnection = false;
        }
        return validConnection;
    }

    /**
     * Connection 객체를 시스템에 반환한다.
     * @throws SQLException 
     */
    public static void close(Connection conn) throws SQLException{
//       isConnected()이용 검사후 close
    		if(isConnected(conn)) {
    				try {
								conn.close();
						} catch (Exception e) {
								// TODO: handle exception
								e.printStackTrace();
						}
    		}
    }

    /**
     * Statement를 Close 한다.
     * 
     * @param stmt
     *            Statement 객체.
     * @throws SQLException 
     */
    public static void close(PreparedStatement pstmt){
    		try {
    				pstmt.close();
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}
    }

    /**
     * ResultSet을 Close 한다.
     * 
     * @param result
     *            ResultSet 객체.
     */
    public static void close(ResultSet rs) {
    		try {
						rs.close();
						System.out.println("rs close");
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}
      //rset close
    }

    /**
     * 지금까지의 트랜잭션을 Commit 처리한다.
     */
    public static void commit(Connection conn) {
    		
        try {
            if (isConnected(conn)) {
                conn.commit();
                System.out.println("[JdbcTemplate.commit] : DB Successfully Committed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 지금까지의 트랜잭션을 Rollback 처한다.
     */
    public static void rollback(Connection conn) {

        try {
            if (isConnected(conn)) {
                conn.rollback();
                System.out.println("[JdbcTemplate.rollback] : DB Successfully Rollbacked!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
