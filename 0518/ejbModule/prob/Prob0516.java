package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCuil;

public class Prob0516 {
		public static void main(String[] args) {
			
			String sql ="select 직속부하직원수 , 관리자사번 , 관리자이름" + 
					" from (" + 
					" select  m.employee_id 관리자사번 ,m.last_name 관리자이름,count(*) 직속부하직원수" + 
					" from employees e, employees m" + 
					" where e.manager_id = m.employee_id " + 
					" group by m.employee_id,m.last_name)" + 
					" where 직속부하직원수 > 7 " + 
					" order by 직속부하직원수 ";  
					
			
			Connection con = null;
			Statement st = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			int row = 0;
			
			try {
				con = JDBCuil.getConnection();
				
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				//? 세팅작업
				
				//실행
				while(rs.next()) {
					System.out.println(rs.getInt("직속부하직원수")+"    ");
					System.out.println(rs.getInt("관리자사번")+"    ");
					System.out.println(rs.getInt("관리자이름")+"    ");
					System.out.println();
				}
				// 결과값핸들링
				
			}catch (SQLException e) {
				e.printStackTrace();
			} catch(Exception e){
				e.printStackTrace();
			}finally {
				JDBCuil.close(con, ps, rs);
			}
			
	}
}
