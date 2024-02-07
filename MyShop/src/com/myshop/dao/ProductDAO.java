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
import com.myshop.dto.ProductDTO;

public class ProductDAO extends DBHelper {
	private static ProductDAO instance = new ProductDAO();

	public static ProductDAO getInstance() {
		return instance;
	}

	private ProductDAO() {
	}

	public void insertProduct(ProductDTO dto) {
		try {

			//3단계
			//4단계
			//5단계
			//6단계
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public ProductDTO selectProduct(int prodNo) {
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

	public List<ProductDTO> selectProducts() {
		List<ProductDTO> products = new ArrayList<>();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				ProductDTO prod = new ProductDTO();
				prod.setProdNo(rs.getInt(1));
				prod.setProdName(rs.getString(2));
				prod.setStock(rs.getInt(3));
				prod.setPrice(rs.getInt(4));
				prod.setCompany(rs.getString(5));
				
				products.add(prod);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	public void updateProduct(ProductDTO dto) {
		try {


		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteProduct(int prodNo) {
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
