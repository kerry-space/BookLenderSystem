package org.example;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {






        Person registerPerson = new Person();

        System.out.println("****************************************************");
        System.out.println("Welcome to the book lending system");
        Print.registerPerson();
        System.out.println("****************************************************");

        int selectOption=0;
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        while(true){

            registerPerson =  Print.persons[selectOption];

            System.out.println("Choose on of the options");
            System.out.println("-------------------------------------------------");
            System.out.println("CURRENT PERSON:"+registerPerson.getFirstName()+" "+registerPerson.getLastName());
            System.out.println("1:Lend books");
            System.out.println("2:DisplayBooks");
            System.out.println("3:Show Person Lender the books");
            System.out.println("4:Register another person");
            System.out.println("5:Change registered Person");
            System.out.println("-------------------------------------------------");

            System.out.print("Enter select menu: ");
            Scanner sc = new Scanner(System.in);
            int selectBook =0;
            int menuSelc = sc.nextInt();
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            switch(menuSelc){
                case 1:
                    Print.lendingBooks();
                    System.out.print("Enter book number to lend: ");
                    selectBook = Print.userInput();
                    registerPerson.loanBook(Print.books[selectBook]);
                    System.out.println("*************************************\n\n");

                    break;
                case 2:

                    System.out.println("List of all books you borrowed");
                    System.out.println("*******************************************************************\n\n");
                    registerPerson.displayBooks();
                    System.out.println("*******************************************************************\n\n");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("*********************************************************************************************\n\n");
                    Print.PersonLendingBook();
                    System.out.println("*********************************************************************************************\n\n");
                    break;
                case 4:
                    Print.registerPersonmenu();
                    Print.printRegistedPerson();
                    System.out.println("select the register person");
                    System.out.println("------------------------------------------");
                    System.out.print("Choose user by number: ");
                    selectOption =  Print.userInput();
                    break;
                case 5:
                    System.out.println("select the register person");
                    Print.printRegistedPerson();
                    System.out.println("------------------------------------------");
                    System.out.print("Choose user by number: ");
                    selectOption =  Print.userInput();
                    break;
                default:
                    System.out.println("******************************************************************\n\n");
                    System.out.println("Choose right menu options");
                    System.out.println("******************************************************************\n\n");
            }
        }


    }
}
