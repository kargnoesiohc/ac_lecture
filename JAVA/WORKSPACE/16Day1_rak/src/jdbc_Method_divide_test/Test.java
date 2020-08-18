package jdbc_Method_divide_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection conn= null;
		ResultSet rs= null;
		PreparedStatement pstmt= null;
		
		public Test() {
				// TODO Auto-generated constructor stub
				try {
						Class.forName(driver);
						System.out.println("Driver loading");
				} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
				
		}
		public int insertDept(DeptDTO dept) {
				int num = 0;
				try {
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("DB Connect \n");
						String insertQuery = "insert into dept(deptno, dname, loc) values(?,?,?)";
						pstmt = conn.prepareStatement(insertQuery);
						pstmt.setInt(1, dept.getDeptno());
						pstmt.setString(2, dept.getDname());
						pstmt.setString(3,dept.getLoc());
						num = pstmt.executeUpdate();
						
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				} finally {
						try {
								if(pstmt!=null)pstmt.close();
								if(conn!=null)conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
				return num;
				
		}
		
		
		public int updateDept(DeptDTO dept) {
				int num = 0;
				try {
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("DB Connect \n");
						String updateQuery = "update dept set dname = ?, loc = ? where deptno = ?";
						pstmt = conn.prepareStatement(updateQuery);
						pstmt.setString(1, dept.getDname());
						pstmt.setString(2,dept.getLoc());
						pstmt.setInt(3, dept.getDeptno());
						num = pstmt.executeUpdate();
						
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				} finally {
						try {
								if(pstmt!=null)pstmt.close();
								if(conn!=null)conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
				return num;
		}
		//테이블 전체 검색
		public ArrayList<DeptDTO> getAllDept() {
				ArrayList<DeptDTO> list = new ArrayList<>();
				try {
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("DB Connect \n");
						String allSelectQuery = "select * from dept order by deptno";
						pstmt = conn.prepareStatement(allSelectQuery);
						rs = pstmt.executeQuery();
						while(rs.next()) {
								DeptDTO deptDto = new DeptDTO();
								deptDto.setDeptno(rs.getInt(1));
								deptDto.setDname(rs.getString(2));
								deptDto.setLoc(rs.getString(3));
								list.add(deptDto);
						}
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}finally {
						try {
								if(rs!=null)rs.close();
								if(pstmt!=null)pstmt.close();
								if(conn!=null)conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
				return list; 
		}
		//부서 번호로 검색
		public DeptDTO searchDeptByDeptno(int deptno) {
				DeptDTO dept = null;
				try {
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("DB Connect \n");
						String searchQuery = "select * from dept where deptno = ?";
						pstmt = conn.prepareStatement(searchQuery);
						pstmt.setInt(1,deptno);
						rs = pstmt.executeQuery();
						while(rs.next()) {
								dept = new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3));
						}
				} catch (Exception e) {
						e.printStackTrace();
				}finally {
						try {
								if(rs!=null)rs.close();
								if(pstmt!=null)pstmt.close();
								if(conn!=null)conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
				return dept;
				
		}
		//부서이름으로 검색
		public ArrayList<DeptDTO> searchDeptByName(String dname) {
				ArrayList<DeptDTO> list = new ArrayList<>();
				try {
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("DB Connect \n");
						String searchQuery = "select * from dept where dname = ?";
						pstmt = conn.prepareStatement(searchQuery);
						pstmt.setString(1,dname);
						rs = pstmt.executeQuery();
						while(rs.next()) {
								DeptDTO deptDto = new DeptDTO();
								deptDto.setDeptno(rs.getInt(1));
								deptDto.setDname(rs.getString(2));
								deptDto.setLoc(rs.getString(3));
								list.add(deptDto);
						}
				} catch (Exception e) {
						e.printStackTrace();
						
				}finally {
						try {
								if(rs!=null)rs.close();
								if(pstmt!=null)pstmt.close();
								if(conn!=null)conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
				return list;
				
		}
	//주소로 검색
			public ArrayList<DeptDTO> searchDeptByLoc(String loc) {
					ArrayList<DeptDTO> list = new ArrayList<>();
					try {
							conn = DriverManager.getConnection(url,userid,passwd);
							System.out.println("DB Connect \n");
							String searchQuery = "select * from dept where loc = ?";
							pstmt = conn.prepareStatement(searchQuery);
							pstmt.setString(1,loc);
							rs = pstmt.executeQuery();
							while(rs.next()) {
									DeptDTO deptDto = new DeptDTO();
									deptDto.setDeptno(rs.getInt(1));
									deptDto.setDname(rs.getString(2));
									deptDto.setLoc(rs.getString(3));
									list.add(deptDto);
							}
					} catch (Exception e) {
							e.printStackTrace();
					}finally {
							try {
									if(rs!=null)rs.close();
									if(pstmt!=null)pstmt.close();
									if(conn!=null)conn.close();
							} catch (Exception e2) {
									// TODO: handle exception
									e2.printStackTrace();
							}
					}
					return list;
					
			}
			//지역만 넘어오면 지역 일치 검색 후 결과 리턴, 이름만 넘어오면 이름 일치  검색 후 결과 리턴, 둘다 넘어오면 둘다 검색 후 리턴
			public ArrayList<DeptDTO> search(String dname, String loc) {
					ArrayList<DeptDTO> list = new ArrayList<>();
					String searchQuery = "";
					String data1 = null;
					String data2 = null;
					try {
						conn = DriverManager.getConnection(url,userid,passwd);
						System.out.println("DB Connect \n");
						if(loc == null) {
								searchQuery = "select * from dept where dname = ?";
								data1 = dname;
								
						} else if(dname == null) {
								searchQuery = "select * from dept where loc = ?";
								data1 = loc;
							
						} else {
								searchQuery = "select * from dept where dname =? and loc = ?";
								data1 = dname;
								data2 = loc;
						}
						
						pstmt = conn.prepareStatement(searchQuery);
						pstmt.setString(1,data1);
						if(data2 != null) {
								pstmt.setString(2,data2);
						}
						
						rs = pstmt.executeQuery();
						while(rs.next()) {
								DeptDTO deptDto = new DeptDTO();
								deptDto.setDeptno(rs.getInt(1));
								deptDto.setDname(rs.getString(2));
								deptDto.setLoc(rs.getString(3));
								list.add(deptDto);
						}
						
				} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
				}finally {
						try {
								if(rs!=null)rs.close();
								if(pstmt!=null)pstmt.close();
								if(conn!=null)conn.close();
						} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
						}
				}
				return list;
					
			}
}
