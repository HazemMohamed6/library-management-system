/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
import util.DBConnection;
/**
 *
 * @author METRO
 */
public class BorrowService {
    public void borrowBook(int user_id , int book_id){
        String sql1 = " update books set quantity = quantity-1 where id = ? ";
        String sql2 = " insert into borrow ( user_id , book_id , borrow_date ) VALUES ( ?,?,? ) ";
        try{
            Connection conn = DBConnection.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setInt(1, book_id);
            ps1.executeUpdate();
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ps2.setInt(1, user_id);
            ps2.setInt(2, book_id);
            ps2.setTimestamp(3, new java.sql.Timestamp(System.currentTimeMillis()));
            ps2.executeUpdate();
            conn.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
