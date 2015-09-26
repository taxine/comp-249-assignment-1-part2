//---------------------------------------------
//Assignment 1
//Part 1
//Written by: Louis-Olivier Guérin, 23054691
//
//DESCRIPTION:
//This program creates objects from various classes. Descriptions of each object are printed to the console.
//Objects are then placed in an array. A sorting algorithm is then performed on the array to sort the ojects by price,
//from lowest to highest.
//
//---------------------------------------------
package driverprogram;

import booktypes.*;
import dailypublication.*;
import monthlypublication.*;
import paperpublication.*;

public class Comp249Assignment1 {

    public static void main(String[] args) {
        //Welcome message
        System.out.println("Welcome to the COMP 249 Assignemt 1 Part 1 program. My name is Louis-Olivier Guérin. Let's get started!");
    
        //Creating PaperPublication instances
        PaperPublication myPaperPublication = new PaperPublication();
        PaperPublication myParameterizedPaperPublication  = new PaperPublication(14.99, 254);
        PaperPublication myParameterizedPaperPublication2  = new PaperPublication(14.99, 254);
        System.out.println(myPaperPublication);
        System.out.println(myParameterizedPaperPublication);
        System.out.println(myParameterizedPaperPublication.equals(myParameterizedPaperPublication2));
        System.out.println(myParameterizedPaperPublication.equals(myParameterizedPaperPublication));
        System.out.println(myPaperPublication.equals(myParameterizedPaperPublication));
        
        //Creating Book instances
        Book myBook = new Book();
        Book myParameterizedBook = new Book(2009, 7342867754835L, "Bob Chanty", 34.99, 784, "My life: Revisited");
        System.out.println(myBook);
        System.out.println(myParameterizedBook);
        System.out.println(myBook.equals(myParameterizedBook));
        System.out.println(myBook.equals(myBook));
        
        //Check equality of two objects from two different classes
        System.out.println(myBook.equals(myPaperPublication));
        
        
        //Creating Journal instances
        Journal myJournal = new Journal();
        Journal myParameterizedJournal = new Journal(135, "Engineering", 45.99, 432);
        System.out.println(myJournal);
        System.out.println(myParameterizedJournal);
        
        //Creating Magazine instances
        Magazine myMagazine = new Magazine();
        Magazine myParameterizedMagazine = new Magazine(Magazine.PaperQuality.HIGH, Magazine.IssuingFrequency.WEEKLY, 67.99, 67);
        System.out.println(myMagazine);
        System.out.println(myParameterizedMagazine);
        
        //Creating EducationalBook instances
        EducationalBook myEducationalBook = new EducationalBook();
        EducationalBook myParameterizedEducationalBook = new EducationalBook(4, "Economics", "Introduction to Microeconomics", 3865873964865L, 2015, "Adam Smith", 164.95, 877);
        System.out.println(myEducationalBook);
        System.out.println(myParameterizedEducationalBook);
        
        //Creating ChildrenBook instances
        ChildrenBook myChildrenBook = new ChildrenBook();
        ChildrenBook myParameterizedChildrenBook = new ChildrenBook(3, 4768825466586L, 1987, "Buck Joe", 21.68, 32, "The purple tree");
        System.out.println(myChildrenBook);
        System.out.println(myParameterizedChildrenBook);
        
        //Create an array and fill it with various objects
        PaperPublication[] myPaperPublicationArray = 
                                                    {myParameterizedPaperPublication,
                                                     myParameterizedBook,
                                                     myJournal,
                                                     myParameterizedJournal,
                                                     myMagazine,
                                                     myParameterizedMagazine,
                                                     myEducationalBook,
                                                     myParameterizedEducationalBook,
                                                     myChildrenBook,
                                                     myParameterizedChildrenBook};
        
        double smallest = myPaperPublicationArray[0].getPrice();
        double largest = myPaperPublicationArray[0].getPrice();
        
        //Trace the PaperPublication array to find the cheapest pricest
        for (PaperPublication object : myPaperPublicationArray) {
            if (object.getPrice() > largest) {
                largest = object.getPrice();
            } else if (object.getPrice() < smallest) {
                smallest = object.getPrice();
            }  
        }
        //Print cheapest price
        System.out.println("Cheapest price in the array is: " + smallest + "$.");

    };
    
    
    
}
