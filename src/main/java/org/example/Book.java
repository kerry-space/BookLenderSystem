package org.example;

public class Book {
    //field
    private String title;
    private String author;
    private boolean available;
    private Person lender;


    //constructor
    public Book(){
        this.available =true;
    }
    public Book(String title, String author){
        this();
        this.title = title;
        this.author = author;
    }
    // getter


    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("title param was null");
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        if (author == null) throw new IllegalArgumentException("author param was null");
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getIsAvailable() {
        return available;
    }

    public void setIsAvailable(boolean available){
        this.available = available;
    }

    public void setLender(Person lender){
       // if (lender == null) throw new IllegalArgumentException("lastName param was null");
        this.lender = lender;
        this.setIsAvailable(false);
    }

    public Person getLender() {

        return lender;
    }

    public String bookInformation(){
        return this.title+" "+this.available;
    }

    // method
    public  Person showPerson(){
        return lender;
    }
}
