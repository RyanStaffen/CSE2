//Ryan Staffen
//CSE 002
//LAB 03
//9-10-2015


/*This program receives a total amount for a check and then calculates 
and displays the tip amount as well as the new total for the bill. */


//imports java Scanner utility
import java.util.Scanner;


//declare class and main method
    public class Check{
        public static void main(String[] args){
            
            Scanner scan1 = new Scanner (System.in);
            
            System.out.print("Enter the original cost of the check in the form xx.xx: ");
            
            double checkcost = scan1.nextDouble();
            
            System.out.print("Enter the % you want to tip in the form xx: ");
            
            double tip = scan1.nextDouble();
            
            double tipDecimal = tip / 100 ;
            
            System.out.print("Enter the number of people in the party: ");
            
            double partySize = scan1.nextDouble();
            
            double total = checkcost*tipDecimal + checkcost;
            
            double splitTotal = total/partySize;
            
            System.out.println("Your bill total was $"+checkcost+" with a tip of "+tip+"%, split "+partySize+" way(s) at a cost of $"+splitTotal+" per person");
            
            
        }
    }
