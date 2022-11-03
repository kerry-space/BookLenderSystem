package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class Print {


    public static Book[] books = {
            new Book("The power of your mind\t\t\t\t","Joseph Murphy\t\t\t"),
            new Book("Think and grow rich\t\t\t\t\t","Napoleon hill\t\t\t"),
            new Book("The Law of Success\t\t\t\t\t", "Napoleon Hill\t\t\t"),
            new Book("As a Man Thinketh\t\t\t\t\t", "James Allen\t\t\t"),
            new Book("Men are from Mars\t\t\t\t\t", "John Gray\t\t\t\t"),
            new Book("Crystal Bible 2\t\t\t\t\t\t", "Judy Hall\t\t\t\t"),
            new Book("Unacknowledged\t\t\t\t\t\t", "Steven M Greer\t\t\t"),
            new Book("Romeo and Juliet\t\t\t\t\t\t", "William shakespeare\t"),
            new Book("Loding my virginity\t\t\t\t\t", "Richard Brandson\t\t"),
            new Book("Autobiography of a Yogi\t\t\t\t", "Paramahansa yogananda\t"),
            new Book("Da vinci code\t\t\t\t\t\t", "Dan Brown\t\t\t\t"),
            new Book("The Code of the Extraordinary Mind\t","Vishen lakhiani\t\t")
    };

    public static Person[] persons = new Person[0];


    public static void lendingBooks(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Book Title\t\t\t\t\t\t\t\t book Author\t\t\tBorrowed");
        System.out.println("----------\t\t\t\t\t\t\t\t -----------\t\t\t---------");
        int index = 0;
        for (Book book : books){
            System.out.println(index+": "+book.getTitle()+" "+book.getAuthor()+""+book.getIsAvailable());
            index++;
        }

        System.out.println("-------------------------------------------------------------------");

    }

    public static  void PersonLendingBook(){
        System.out.println("Book Title\t\t\t\t\t\t\t\t book Author\t\t\tBorrowed\t\t\tPerson");
        System.out.println("----------\t\t\t\t\t\t\t\t -----------\t\t\t---------\t\t\t------------");
        int index = 0;
        for (Book book : books){
           if(!book.getIsAvailable()){
               System.out.println(index+": "+book.getTitle()+" "+book.getAuthor()+""+book.getIsAvailable()+"\t\t\t\t"+book.getLender().getFirstName()+" "+book.getLender().getLastName());
               index++;
           }
        }

        System.out.println("-------------------------------------------------------------------");
    }

    public static String registerInput(){
        Scanner sc = new Scanner(System.in);
        return sc.next();

    }

    public static Person[] registerPerson(){
        System.out.print("Enter first name:");
        String firstname = Print.registerInput();
        System.out.print("Enter Last name:");
        String lastName = Print.registerInput();

        persons = Arrays.copyOf(persons, persons.length + 1);
        persons[persons.length-1] = new Person(firstname, lastName);

       return persons;
    }

    public static void registerPersonmenu(){
        System.out.println("Register yourself to the bookLenderSystem to be able lend books");
        Person[] persons =  registerPerson();
        System.out.println("----------------------");
    }

    public static void printRegistedPerson(){
        int index= 0;

        for (Person person : persons){
            System.out.println(index+":"+person.getFirstName()+" "+person.getLastName());
            index++;
        }
    }

    public static int userInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();


    }
}
