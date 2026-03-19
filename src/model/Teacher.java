/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author METRO
 */
public class Teacher extends User {
    public Teacher(int id , String name , String email){
        super(id,name,email);
    }
    
    @Override
    public int getMaxBooksAllowed(){
        return 5;
    }
}
