package com.myshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
import com.myshop.dto.CustomerDTO;



public class CustomerDAO extends DBHelper {
	private static CustomerDAO instance = new CustomerDAO();

	public static CustomerDAO getInstance() {
		return instance;
	}

	private CustomerDAO() {
	}

	public void insertCustomer(CustomerDTO dto) {

		try {
			//CustomerDTO customerDTO = new CustomerDTO();
			// 3단계
			conn = getConnection();
			// 4단계
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, dto.getCustId());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getHp());
			psmt.setString(4, dto.getAddr());
			psmt.executeUpdate();
			// 5단계
			// 6단계
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public CustomerDTO selectCustomer(String custId) {
		CustomerDTO cust = null;
		try {
			
			conn = getConnection();
			// 3단계
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);

			// 4단계
			rs = psmt.executeQuery();
			// 5단계
			if (rs.next()) {
				cust = new CustomerDTO();
				cust.setCustId(rs.getString(1));
				cust.setName(rs.getString(2));
				cust.setHp(rs.getString(3));
				cust.setAddr(rs.getString(4));
				cust.setRdate(rs.getString(5));
			}
			// 6단계
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cust;
	}

	public List<CustomerDTO> selectCustomers() {
		try {
			// 1단계
			// 2단계
			// 3단계
			// 4단계
			// 5단계
			// 6단계
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateCustomer(CustomerDTO dto) {
		try {
			// 1단계
			// 2단계
			// 3단계
			// 4단계
			// 5단계
			// 6단계
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteCustomer(String custId) {
		try {
			// 1단계
			// 2단계
			// 3단계
			// 4단계
			// 5단계
			// 6단계
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
