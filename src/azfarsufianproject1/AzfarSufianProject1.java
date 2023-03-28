/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package azfarsufianproject1;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author sufia
 */
public class AzfarSufianProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        //Initialize books, CDs, DVDs and Customer here
        //Test comment
        Customer aCustomer = new Customer();
        ArrayList<Customer> memberList = new ArrayList();
        Book catInHat = new Book("The Cat in The Hat", 6.50, "Dr. Seuss", "Fiction");
        Book percyJackson = new Book("Percy Jackson & the Olympians: The Lightning Thief", 15.75, "Rick Riordan", "Fantasy");
        Book mockingBird = new Book("To Kill a Mockingbird", 10.00, "Harper Lee", "Historical Fiction");
        Book frankenstein = new Book("Frankenstein", 20.00, "Mary Shelley", "Science Fiction");
        CD beethoven = new CD("Symphony 9 in D Minor", 10.00, "Ludwig von Beethoven", "Classical");
        CD afterHours = new CD("After Hours", 8.00, "The Weeknd", "Hip-Hop");
        CD channelOrange = new CD("Channel Orange", 12.00, "Frank Ocean", "R&B");
        CD tpab = new CD("To Pimp a Butterfly", 9.00, "Kendrick Lamar", "Rap");
        DVD avengers = new DVD("Avengers", 6.00, "Joe & Anthony Russo", "Superhero");
        DVD homeAlone = new DVD("Home Alone 2: Lost in New York", 5.00, "Chris Columbus", "Christmas");
        DVD whiplash = new DVD("Whiplash", 8.00, "Damien Chazelle", "Indie");
        DVD interstellar = new DVD("Interstellar", 9.00, "Christopher Nolan", "Science Fiction");
        Stock todaysStock = new Stock();
        todaysStock.bookStock.add(catInHat);
        todaysStock.bookStock.add(percyJackson);
        todaysStock.bookStock.add(mockingBird);
        todaysStock.bookStock.add(frankenstein);
        todaysStock.cdStock.add(beethoven);
        todaysStock.cdStock.add(afterHours);
        todaysStock.cdStock.add(channelOrange);
        todaysStock.cdStock.add(tpab);
        todaysStock.dvdStock.add(avengers);
        todaysStock.dvdStock.add(homeAlone);
        todaysStock.dvdStock.add(whiplash);
        todaysStock.dvdStock.add(interstellar);
        //Below this is the "display" the customer will see.
        System.out.println("************************************************************************");
        System.out.println("Welcome to the book store system! Please pick from one of the below options, by typing 1 or 2.");
        Thread.sleep(1000);
        System.out.println("1. Make a purchase");
        Thread.sleep(1000);
        System.out.println("2. Sign up a member");
        Thread.sleep(1000);
        Scanner scnr = new Scanner(System.in);
        

        int userChoice = scnr.nextInt();
        while (userChoice == 1 || userChoice == 2) {
        while (userChoice < 1 || userChoice > 3) {      //While loop to ensure proper input
            System.out.println("Please select a valid number.");
            userChoice = scnr.nextInt();
        }
        int purchaseContinueDecision = 1; //If this variable = 1, user wants to continue browsing stock
        while (purchaseContinueDecision == 1) {
        if (userChoice == 1) {
            System.out.println("\nWould you like to browse our books, CDs, or DVDS?"); 
            Thread.sleep(600);
            System.out.println("1. Books");
            Thread.sleep(600);
            System.out.println("2. CDs");
            Thread.sleep(600);
            System.out.println("3. DVDs");
            
        int inventoryChoice = scnr.nextInt();
        //While loop to ensure user inputs an acceptable input.
        while (inventoryChoice < 1 || inventoryChoice > 3) {
            System.out.println("Please select a valid number.");
            inventoryChoice = scnr.nextInt();
        }
        if (inventoryChoice == 1) {   //User wants to browse books
            System.out.println("\nThese are the books we have in stock: \n");
            for (int i = 0; i < todaysStock.bookStock.size(); i++) {
            System.out.println((i + 1) + ". " + todaysStock.bookStock.get(i).getName() + " by " + todaysStock.bookStock.get(i).getAuthor() + " | " + todaysStock.bookStock.get(i).getGenre() + " |$" + todaysStock.bookStock.get(i).getPrice() + "\n");
            }
            System.out.println("Please type the number that corresponds with the book you'd like to purchase: ");
            int bookChoice = scnr.nextInt();
            bookChoice--; //use decrement because the numbering system the user sees, and index of array is off by 1.
            System.out.println("\nGood choice! \n");
            aCustomer.booksPurchased.add(todaysStock.bookStock.get(bookChoice)); //Adds this to customer's receipt
            aCustomer.incrementMoneySpent(todaysStock.bookStock.get(bookChoice).getPrice()); //Increases total money spent by cost of item
            todaysStock.bookStock.remove(bookChoice); //Removes selected item from display
            Thread.sleep(1000);
            System.out.println("\nWould you like to make any more purchases? Input 1 for yes, and 2 for no. \n");
            purchaseContinueDecision = scnr.nextInt();
            if (todaysStock.bookStock.isEmpty()) { //Display this in case there are no books left in stock
                System.out.println("\nSorry, we're all out of books! \n");
                purchaseContinueDecision = 1;
            }
        
            }
        if (inventoryChoice == 2) { //The mechanics of this section are identical to book section
            System.out.println("\nThese are the CDs we have in stock: \n");
            for (int i = 0; i < todaysStock.cdStock.size(); i++) {
            System.out.println((i + 1) + ". " + todaysStock.cdStock.get(i).getName() + " by " + todaysStock.cdStock.get(i).getArtist() + " | " + todaysStock.cdStock.get(i).getGenre() + " |$" + todaysStock.cdStock.get(i).getPrice() + "\n");
            }
            System.out.println("Please type the number that corresponds with the CD you'd like to purchase: ");
            int cdChoice = scnr.nextInt();
            cdChoice--; //use decrement because our numbering system the user sees, and index of array is off by 1.
            System.out.println("\nGood choice! \n");
            aCustomer.cdsPurchased.add(todaysStock.cdStock.get(cdChoice));
            aCustomer.incrementMoneySpent(todaysStock.cdStock.get(cdChoice).getPrice());
            todaysStock.cdStock.remove(cdChoice);
            Thread.sleep(1000);
            System.out.println("\nWould you like to make any more purchases? Input 1 for yes, and 2 for no. \n");
            purchaseContinueDecision = scnr.nextInt();
            if (todaysStock.cdStock.isEmpty()) {
                System.out.println("\nSorry, we're all out of CDs! \n");
                purchaseContinueDecision = 1;
            }
        
        }
        if (inventoryChoice == 3) { //Mechanics of this section are identical to the book section.
            System.out.println("\nThese are the DVDs we have in stock: \n");
            for (int i = 0; i < todaysStock.dvdStock.size(); i++) {
            System.out.println((i + 1) + ". " + todaysStock.dvdStock.get(i).getName() + " | " + todaysStock.dvdStock.get(i).getDirector() + " | " + todaysStock.dvdStock.get(i).getGenre() + " |$" + todaysStock.dvdStock.get(i).getPrice() + "\n");
            }
            System.out.println("Please type the number that corresponds with the DVD you'd like to purchase: ");
            int dvdChoice = scnr.nextInt();
            dvdChoice--; //use decrement because our numbering system the user sees, and index of array is off by 1.
            System.out.println("\nGood choice! \n");
            aCustomer.dvdsPurchased.add(todaysStock.dvdStock.get(dvdChoice));
            aCustomer.incrementMoneySpent(todaysStock.dvdStock.get(dvdChoice).getPrice());
            todaysStock.dvdStock.remove(dvdChoice);
            Thread.sleep(1000);
            System.out.println("\nWould you like to make any more purchases? Input 1 for yes, and 2 for no. \n");
            purchaseContinueDecision = scnr.nextInt();
            if (todaysStock.dvdStock.isEmpty()) {
                System.out.println("\nSorry, we're all out of DVDs! \n");
                purchaseContinueDecision = 1;
            }
        
        }
        if (purchaseContinueDecision == 2) { //User no longer wants to browse items
            System.out.println("\nThanks for shopping with us today!");
            Thread.sleep(1000);
            System.out.println("\nAre you a part of our membership program? Input 1 for yes, and 2 for no.");
            Thread.sleep(1000);
            int membershipDecision = scnr.nextInt();
            
            if (membershipDecision == 1) { //Assuming user signed up a member earlier
                String custName;
                System.out.println("\nPlease enter your name: ");
                Scanner nameInput = new Scanner(System.in);
                custName = nameInput.nextLine();
                boolean found = false;
                while (!found) {
                for (int i = 0; i < memberList.size(); i++) {
                    if (memberList.get(i).getCustomerName().equals(custName)) {
                        found = true;
                    } else if (!memberList.get(i).getCustomerName().equals(custName)) {
                        System.out.println("\nPlease enter a valid member name.");
                        custName = nameInput.nextLine();
                    }
                }
            }
                System.out.println("\nGood to see you, " + custName + "!");
                Thread.sleep(600);
                System.out.println("\nBelow is a summary of your visit today. Thanks for shopping with us!");
                Thread.sleep(400);
                System.out.println("\n*************************************");
                if (!aCustomer.booksPurchased.isEmpty()) {
                System.out.println("\nBooks purchased: ");
                for (int i = 0; i < aCustomer.booksPurchased.size(); i++) {
                    System.out.println("\n" + aCustomer.booksPurchased.get(i).getName() + " by " + aCustomer.booksPurchased.get(i).getAuthor() + " | " + aCustomer.booksPurchased.get(i).getGenre() + " | $" + aCustomer.booksPurchased.get(i).getPrice() );
                }
                }
                if (!aCustomer.cdsPurchased.isEmpty()) {
                System.out.println("\nCDs purchased: ");
                for (int i = 0; i < aCustomer.cdsPurchased.size(); i++) {
                    System.out.println("\n" + aCustomer.cdsPurchased.get(i).getName() + " by " + aCustomer.cdsPurchased.get(i).getArtist() + " | " + aCustomer.cdsPurchased.get(i).getGenre() + " | $" + aCustomer.cdsPurchased.get(i).getPrice() );
                }
                }
                if (!aCustomer.dvdsPurchased.isEmpty()) {
                System.out.println("\nDVDs purchased: ");
                for (int i = 0; i < aCustomer.dvdsPurchased.size(); i++) {
                    System.out.println("\n" + aCustomer.dvdsPurchased.get(i).getName() + " by " + aCustomer.dvdsPurchased.get(i).getDirector() + " | " + aCustomer.dvdsPurchased.get(i).getGenre() + " | $" + aCustomer.dvdsPurchased.get(i).getPrice() );
                }
                }
                Thread.sleep(650);
                System.out.println("\nMembership: Premium");
                Thread.sleep(400);
                System.out.println("\nTotal: $" + aCustomer.getMoneySpent());
                Thread.sleep(450);
                System.out.println("\nHave a great day!");
                System.out.println("\n*************************************");
                userChoice = 4;
            }
            if (membershipDecision == 2) { //User did not sign up earlier, and is continuing as a guest
                Thread.sleep(1000);
                System.out.println("\nBelow is a summary of your visit today. Thanks for shopping with us!");
                Thread.sleep(700);
                System.out.println("\n*************************************");
                if (!aCustomer.booksPurchased.isEmpty()) {
                System.out.println("\nBooks purchased: ");
                for (int i = 0; i < aCustomer.booksPurchased.size(); i++) {
                    System.out.println("\n" + aCustomer.booksPurchased.get(i).getName() + " by " + aCustomer.booksPurchased.get(i).getAuthor() + " | " + aCustomer.booksPurchased.get(i).getGenre() + " | $" + aCustomer.booksPurchased.get(i).getPrice() );
                }
                }
                if (!aCustomer.cdsPurchased.isEmpty()) {
                System.out.println("\nCDs purchased: ");
                for (int i = 0; i < aCustomer.cdsPurchased.size(); i++) {
                    System.out.println("\n" + aCustomer.cdsPurchased.get(i).getName() + " by " + aCustomer.cdsPurchased.get(i).getArtist() + " | " + aCustomer.cdsPurchased.get(i).getGenre() + " | $" + aCustomer.cdsPurchased.get(i).getPrice() );
                }
                }
                if (!aCustomer.dvdsPurchased.isEmpty()) {
                System.out.println("\nDVDs purchased: ");
                for (int i = 0; i < aCustomer.dvdsPurchased.size(); i++) {
                    System.out.println("\n" + aCustomer.dvdsPurchased.get(i).getName() + " by " + aCustomer.dvdsPurchased.get(i).getDirector() + " | " + aCustomer.dvdsPurchased.get(i).getGenre() + " | $" + aCustomer.dvdsPurchased.get(i).getPrice() );
                }
                }
                Thread.sleep(600);
                System.out.println("\nMembership: N/A");
                Thread.sleep(700);
                System.out.println("\nTotal: $" + aCustomer.getMoneySpent());
                Thread.sleep(400);
                System.out.println("\nHave a nice day!");
                System.out.println("\n*************************************");
                userChoice = 4;
            }
        }
        } else {
         break;
        }
        }
        if (userChoice == 2) { //User wants to sign up a new member
            Thread.sleep(700);
            System.out.println("\nWelcome to our member sign-up menu!");
            Thread.sleep(600);
            System.out.println("\nPlease input the name of the member you'd like to sign up.");
            Scanner signUpInput = new Scanner(System.in);
            String cName = signUpInput.nextLine();
            Thread.sleep(800);
            System.out.println("\nThank you. Now, would you like to sign up for the premium membership or the standard membership?");
            Thread.sleep(800);
            System.out.println("\nThrough our premium membership, you gain access to exclusive deals, our premium lounge, and many more fun benefits.");
            Thread.sleep(600);
            System.out.println("\nAlso, as a premium member, you're able to keep a running tab going, and at checkout we can just bill the card on file.");
            Thread.sleep(1100);
            System.out.println("\nAs a standard member, we'll keep track of your name and remember you for future transactions.");
            Thread.sleep(700);
            System.out.println("\nThe premium membership is $20 per month, and the standard is free. Which would you like to register for? (1 for premium, 2 for standard)");
            int memberChoice = signUpInput.nextInt();
            if (memberChoice == 1) {
                Thread.sleep(800);
                System.out.println("\nYou've officially signed up " + cName + " as a premium member.");
                Thread.sleep(500);
                System.out.println("\nYour total will be $20. Thank you.");
                Customer newPremiumMember = new Customer(cName);
                newPremiumMember.purchasePremiumMembership();
                memberList.add(newPremiumMember);
            }
            if (memberChoice == 2) {
                Thread.sleep(800);
                System.out.println("\nThank you, you've officially signed up " + cName + " as a standard member.");
                Thread.sleep(500);
                Customer newStandardMember = new Customer(cName);
                memberList.add(newStandardMember);
            }
            System.out.println("\nWould you like to browse our shop? Input 1 for yes, and 2 for no.");
            int browseDecision = signUpInput.nextInt();
            if (browseDecision == 1) {
                userChoice = 1;
            }
            if (browseDecision == 2) {
                System.out.println("\nThank you, have a nice day!");
                userChoice = 4;
            }
        }
        }

    }
}
