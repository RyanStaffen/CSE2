//Ryan Staffen
//CSE 002 Section 111
//hw03 Root 

//Program prompts user to input a number and then calculates and prints the 
//given number's guessed cube root.  Through next series of steps the program
//improves the original guess through refining the calculations.

    //Import Java Scanner
    import java.util.Scanner;
    
        //Define a class
        public class Root{
            
            //Add Main Method
            public static void main(String[] args) {
                
                //Declare Scanner
                Scanner myScanner;
                //Initiate Scanner input
                myScanner = new Scanner(System.in);
                
                //Print user input promp for number
                System.out.print("Enter a double and I print its cube root:  ");
                //Accept User Input
                double x = myScanner.nextDouble();
                double guess = (x/3);
                double guess0 = ((guess*guess*guess+x)/(3*guess*guess)); //3.11 
                double guess1 = ((2*guess0*guess0*guess0+x)/(3*guess0*guess0));
                double guess2 = ((2*guess1*guess1*guess1+x)/(3*guess1*guess1));
                double guess3 = ((2*guess2*guess2*guess2+x)/(3*guess2*guess2));
                double total = (guess3*guess3*guess3);
                //Print first guess of cube root
                System.out.println("The cube root is: "+guess3+"");
                System.out.println(""+guess3+"*"+guess3+"*"+guess3+"="+total+"" );
            
                
                //end main method
            }
        }
        