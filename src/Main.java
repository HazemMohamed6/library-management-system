/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import repository.BookRepository;
import repository.UserRepository;
import service.BorrowService;
/**
 *
 * @author METRO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BookRepository bookRepo = new BookRepository();
        UserRepository userRepo = new UserRepository();
        BorrowService borrowService = new BorrowService();
        
        bookRepo.addBook("Clean Code", "Robert Martin", 10);
        userRepo.addUser("Hazem", "hazemmohameddeshesha@gmail.com", "Student");
        borrowService.borrowBook(1, 1);
        bookRepo.searchBooks("clean Code", 10, 0);
        System.out.println("Done");
    }
    
}
