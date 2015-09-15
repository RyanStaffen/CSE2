//Ryan Staffen
//CSE 002
//hw03 
//Timer Program

//This program accepts user input for a time of an event as well as the 
//current time and outputs the time remaining until the event

//import java Scanner utility
import java.util.Scanner;
    //Create Timer class and main method
    public class Timer{
        public static void main(String[] args){
            
        //Declare scanner
        Scanner scan1 = new Scanner(System.in);
        
        //prompt user for event time input and current time
        System.out.print("Please enter time of event in military time (eg. 2400): ");
        int eventTime = scan1.nextInt();
        
        System.out.print("Please enter current time in military time (eg. 2400): ");
        int currentTime = scan1.nextInt();
        //Arithmetic to determine time left until event
        int timeLeft = (eventTime - currentTime);
        int hours = timeLeft/100;
        int minutes = timeLeft-(timeLeft/100*100);
        
        //Print time remaining until event
        System.out.println("There are "+hours+" hour(s) and "+minutes+" minute(s) left until your event!");
        System.out.println();
        
        
            
            
            
        }
    }