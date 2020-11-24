package com.manthan.login.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.manthan.login.Validation.Validate;
import com.manthan.login.bean.User;

public class UserDAO {

	public User Login(String email, String password) throws SQLException,ClassNotFoundException {
	
		Connection connection=Validate.getConnection();
		
		String sql = "SELECT * FROM userdetails WHERE EMAIL = ? and password = ?";
		PreparedStatement preparedstatement = connection.prepareStatement(sql);
		preparedstatement.setString(1, email);
		preparedstatement.setString(2, password);
		
		ResultSet result = preparedstatement.executeQuery();

		User user = null;

		if (result.next()) {
			user = new User();
			user.setUsername(result.getString("username"));
			user.setEmail(email);
			connection.close();
			preparedstatement.close();
		}

		

		return user;

	}
	
}
