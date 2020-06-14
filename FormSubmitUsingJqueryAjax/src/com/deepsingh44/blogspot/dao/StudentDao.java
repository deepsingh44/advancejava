package com.deepsingh44.blogspot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.deepsingh44.blogspot.model.Student;

public class StudentDao {

	public int insert(Student std) {
		int i=0;
		try (Connection con = Dao.getConnection();) {
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setString(1,std.getName());
			ps.setString(2,std.getEmail());
			ps.setString(3,std.getPass());
			ps.setString(4,std.getRole());
			i=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

}
