package com.unip.aps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.unip.aps.factory.HikariCP3ConnectionFactory;
import com.unip.aps.entity.ItemEntity;


public class ValoresDAO {
	
	public void insertValores(ItemEntity itemEntity) {
		try (Connection connection = HikariCP3ConnectionFactory.getInstance().getConnection()){
			PreparedStatement pstmt = null;
			
			final String transaction = "INSERT INTO valores VALUES (?,?,?,?,?,?,?,?)";

			try {
				pstmt = connection.prepareStatement(transaction);
	
				pstmt.setString(1, itemEntity.getUUID());
				pstmt.setInt(2,itemEntity.getPapel());
				pstmt.setInt(3,itemEntity.getPlastico());
				pstmt.setInt(4,itemEntity.getVidro());
				pstmt.setInt(5,itemEntity.getMetal());
				pstmt.setInt(6,itemEntity.getOrganico());
				pstmt.setInt(7,itemEntity.getOutros());
				pstmt.setInt(8,itemEntity.getTotal());
				pstmt.executeUpdate();
				pstmt.getConnection().commit();
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				if (connection != null) {
					connection.close();
					pstmt.close();
				}
			}
		} catch (SQLException e1) {
		e1.printStackTrace();
		}
	}

}
