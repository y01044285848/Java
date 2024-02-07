package com.myshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
import com.myshop.dto.OrderDTO;

public class OrderDAO extends DBHelper {
	private static OrderDAO instance = new OrderDAO();

	public static OrderDAO getInstance() {
		return instance;
	}

	private OrderDAO() {
	}

	public void insertOrder(OrderDTO dto) {
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setString(1, dto.getOrderId());
			psmt.setInt(2, dto.getOrderProduct());
			psmt.setInt(3, dto.getOrderCount());
			
			
			psmtEtc = conn.prepareStatement(SQL.UPDATE_PRODUCT_STOCK_COUNT);
			psmtEtc.setInt(1, dto.getOrderCount());
			psmtEtc.setInt(2, dto.getOrderProduct());
			
			
			psmt.executeUpdate();
			psmtEtc.executeUpdate();
			conn.commit();
			close();

		}catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	public OrderDTO selectOrder(int orderNo) {
		try {

			//3단계
			//4단계
			//5단계
			//6단계
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<OrderDTO> selectOrders(String custId) {
		
		List<OrderDTO> orders = new ArrayList<>();
		
		try {
			conn = getConnection();
			//3단계
			psmt = conn.prepareStatement(SQL.SELECT_ORDERS);
			psmt.setString(1, custId);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				OrderDTO order = new OrderDTO();
				order.setOrderNo(rs.getInt(1));
				order.setOrderId(rs.getString(2));
				order.setOrderProduct(rs.getInt(3));
				order.setOrderCount(rs.getInt(4));
				order.setOrderDate(rs.getString(5));
				order.setProdName(rs.getString(6));
				order.setPrice(rs.getInt(7));
				order.setCompany(rs.getString(8));
				
				orders.add(order);
			}
			
			close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return orders;
	}

	public void updateOrder(OrderDTO dto) {
		try {

			//3단계
			//4단계
			//5단계
			//6단계
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteOrder(int orderNo) {
		try {

			//3단계
			//4단계
			//5단계
			//6단계
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
