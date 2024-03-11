package classes;
/*
 * Author: Chez'lene Cornwall
 * Date last updated: 3/10/2024
 * Description: Application to simulate a library system that allows users 
 * to check books in and out
 */

// import libraries
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.application.Application;
import com.libraryapp.App;

public class Main {

    public static Library library = new Library(); // Create a new Library instance
    public static void main(String[] args) {
        System.out.println("Hello World");

        library.addBook(new YoungAdult(
        "Matched", 
        1001, 
        "Cassia has always trusted their choices. Its hardly any price to pay for a long life," +
            "the perfect job, the ideal mate. So when her best friend appears on the Matching screen," + 
            "Cassia knows with complete certainty that he is the one…until she sees another face flash" + 
            "for an instant before the screen fades to black. Now Cassia is faced with impossible" + 
            "choices: between Xander and Ky, between the only life shes known and a path no one else" + 
            "has ever dared follow—between perfection and passion." ,
        "Ally Condie",
        LocalDate.of(2010, 11, 30),
        false,
        true,
        "Dystopia"
        ));

        library.addBook(new Children (
            "May Bird and the Ever After",
            1002,
            "Most people aren't very comfortable in the woods, but the woods of Briery Swamp fit May Bird like a fuzzy mitten."+
                "There, she is safe from school and the taunts and teases of kids who don't understand her. Hidden in the trees, May" +
                "is a warrior princess, and her cat, Somber Kitty, is her brave guardian." + 
                "Then May falls into the lake." + 
                "When she crawls out, May finds herself in a world that most certainly does not feel like a fuzzy mitten. "+
                "In fact it is a place few living people have ever seen. Here, towns glow blue beneath zipping stars and the"+
                "people -- people? -- walk through walls. Here the Book of the Dead holds the answers to everything in the universe."+ 
                "And here, if May is discovered, the horrifyingly evil Bo Cleevil will turn her into nothing." + 
                "May Bird must get out." + 
                "Fast.",
            "Jodi Lynn Anderson",
            LocalDate.of(2005, 8, 30),
            true,
            "10 to 14 years",
            "NONE"
        ));

        library.addBook(new Adult(
            "Gone Girl",
            1003, 
            "Who are you?" +
                "What have we done to each other?" +
                "These are the questions Nick Dunne finds himself asking on the morning of his fifth wedding anniversary"+ 
                "when his wife Amy suddenly disappears. The police suspect Nick. Amy's friends reveal that she was afraid of him,"+ 
                "that she kept secrets from him. He swears it isn't true. A police examination of his computer shows strange searches."+ 
                "He says they weren't made by him. And then there are the persistent calls on his mobile phone." + 
                "So what did happen to Nick's beautiful wife?", 
            "Gillian Flynn", 
            LocalDate.of(2012, 5, 14), 
            true, 
            "Thriller"
        ));

        library.addBook(new Nonfiction(
        "Python For Dummies", 
        1004, 
        "Python is one of the most powerful, easy-to-read programming languages around, but it does have its limitations." +
        "This general purpose, high-level language that can be extended and embedded is a smart option for many programming problems,"+ 
        "but a poor solution to others.\"Python For Dummies\" is the quick-and-easy guide to getting the most out of this robust program."+ 
        "This hands-on book will show you everything you need to know about building programs, debugging code, and simplifying"+
        "development, as well as defining what actions it can perform. You'll wrap yourself around all of its advanced features"+
        "and become an expert Python user in no time. This guide gives you the tools you need to: Master basic elements and" +
        "syntaxDocument, design, and debug programsWork with strings like a proDirect a program with control structuresIntegrate"+ 
        "integers, complex numbers, and modulesBuild lists, stacks, and queuesCreate an organized dictionaryHandle functions, data,"+ 
        "and namespaceConstruct applications with modules and packagesCall, create, extend, and override classesAccess the Internet to"+ 
        "enhance your libraryUnderstand the new features of Python 2.5\n" + 
        "Packed with critical idioms and great resources to maximize your productivity, \"Python For Dummies\" is the ultimate"+
        "one-stop information guide. In a matter of minutes you'll be familiar with Python's building blocks, strings, dictionaries,"+
        "and sets; and be on your way to writing the program that you've dreamed about", 
        "Stef Maruch, Aahz Maruch", 
        LocalDate.of(2011, 5, 9), 
        true, 
        "Python"
        ));

        Application.launch(App.class, args); // launch application

    }

}
