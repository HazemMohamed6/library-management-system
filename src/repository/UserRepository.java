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
public class UserRepository {
    public void addUser(String name , String email , String type){
        String sql="insert into users( name , email , type ) VALUES ( ?,?,? )";
        try(Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, type);
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
