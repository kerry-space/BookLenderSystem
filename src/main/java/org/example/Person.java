package org.example;

import java.util.Arrays;

public class Person {
    //feilds
    private  int personId;
    private String firstName;
    private  String lastName;
    private int sequence =100;



    private Book[] books;

    //constructor
    public Person(){
        this.personId = ++sequence;
        books = new Book[0];
    }

    public Person( String firstName, String lastName){
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //getter and setter


    public int getPersonId() {
        return personId;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("firstName param was null");
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("lastName param was null");
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    //methods
     public void loanBook(Book bookLend){


            if(bookLend.getIsAvailable() == false ){
                books = Arrays.copyOf(books, books.length + 1);
                books[books.length - 1] = bookLend;
                System.out.println("You borrow "+bookLend.getTitle());
            }else {
                System.out.println("Book is already borrowed by "+bookLend.getLender().firstName+" "+bookLend.getLender().lastName);
            }
     }

     public  void displayBooks(){
         System.out.println("Book Title\t\t\t\t\t\t\t Person borrowed book");
         System.out.println("--------------------\t\t\t\t--------------------");
        for(Book book : books){
            if(book.getIsAvailable() == true){
                System.out.println(book.getTitle()+" "+book.getLender().firstName+" "+book.getLender().lastName);
            }
        }
     }
}
