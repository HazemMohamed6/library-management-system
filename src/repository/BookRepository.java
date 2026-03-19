/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import util.DBConnection;
import java.sql.*;
/**
 *
 * @author METRO
 */
public class BookRepository {
    public void addBook(String title, String author , int quantity){
        String sql="insert into books( title , author , quantity ) VALUES ( ?,?,? )";
        try(Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setInt(3, quantity);
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void getBookById(int id){
        String sql="select * from books where id=? ";
        try(Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("title"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void updateBook(int id , String title , String author , int quantity){
        String sql = "update books set title= ? , set author = ? , set quantity = ? ";
        try(Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setInt(3, quantity);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteBook(int id ){
        String sql = "delete from books where id ? ";
        try(Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void searchBooks(String keyword , int limit , int offset ){
        String sql = " select * from books where title like ? limit ? offset ? ";
        try(Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, "%"+keyword+"%");
            ps.setInt(2, limit);
            ps.setInt(3, offset);
            ResultSet rs=ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
}