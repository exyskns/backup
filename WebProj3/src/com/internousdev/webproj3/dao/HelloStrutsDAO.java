package com.internousdev.webproj3.dao;

import java.sql.Connection;

import com.internousdev.webproj3.dto.HelloStrutsDTO;
import com.internousdev.webproj3.util.DBConnector;

public class HelloStrutsDAO {

	public HelloStrutsDTO select() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		HelloStrutsDTO dto = new HelloStrutsDTO();

		String sql = "select * from users";
	}

}
