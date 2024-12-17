package com.awnish.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

//ALT+SHIFT+S+V TO IMPLEMENT METHOD
public final class EmployeeDaoImpl implements IEmployeeDao {
	private final String INSERT_QUERY = "Insert into springEmp values(?,?,?,?,?,?,?)";
	private final String DELETE_QUERY="Delete from springEmp where empno=?";
	
	private DataSource ds;

	public EmployeeDaoImpl(DataSource ds) {
		// TODO Auto-generated constructor stub
		this.ds = ds;
	}

	@Override
	public int insertEmployee(EmployeeBo empBo) throws Exception {
		int count=0;
		try (Connection con = ds.getConnection()) {
			if(con!=null){
				PreparedStatement stmt=con.prepareStatement(INSERT_QUERY);
//				PreparedStatement stmt=con.prepareStatement(DELETE_QUERY);
				if(stmt!=null) {
					//insert operation
					stmt.setInt(1, empBo.getEmpNo());
					stmt.setInt(2,empBo.getAge());
					stmt.setString(3, empBo.getName());
					stmt.setString(4,empBo.getAddr());
					stmt.setDouble(5, empBo.getSalary());
					stmt.setDouble(6, empBo.getGrossSalary());
					stmt.setDouble(7, empBo.getNetSalary());
					//DELETE OPERATION
//					stmt.setInt(1, 1);
					
					count=stmt.executeUpdate();
				}else {
					System.out.println("Data not inserted");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Internal Error");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}
