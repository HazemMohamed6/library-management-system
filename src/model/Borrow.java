/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Date;
/**
 *
 * @author METRO
 */
public class Borrow {
    private int id ;
    private int user_id;
    private int book_id;
    private Date borrow_date;
    
    public Borrow(){
        
    }
    
    public Borrow(int id , int user_id , int book_id , Date borrow_date){
        this.id=id;
        this.user_id=user_id;
        this.book_id=book_id;
        this.borrow_date=borrow_date;
    }
}
