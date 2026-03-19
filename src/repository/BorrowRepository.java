/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.*;
import util.DBConnection;

/**
 *
 * @author METRO
 */
public class BorrowRepository {
    public void borrowBook(int user_id , int book_id ){
        String sql="insert into borrow( user_id , book_id , borrow_date  ) VALUES ( ?,?,? )";
        try(Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, user_id);
            ps.setInt(2, book_id);
            ps.setTimestamp(3, new java.sql.Timestamp(System.currentTimeMillis()));
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
