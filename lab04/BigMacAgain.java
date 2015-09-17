//Ryan Staffen
//CSE 002 Section 111
//Lab 04
//Big Mac Again
//      This program uses the Scanner class to obtain
//  from users how many Big macs they want and whether 
//  or not they want an order of fries. 

    //Import java scanner
    import java.util.Scanner;
    
        //define public class
        public class BigMacAgain{
            
            //initiate main method
            public static void main(String[] args) {
                
                //Declare instance of scanner
                Scanner myScanner;
                myScanner = new Scanner( System.in );
                
                int nBigMacs;
                
                //Prompt user for number of Big Macs
                System.out.print("Please enter number of Big Macs: ");
                //Accept User input or print error message 
                if(myScanner.hasNextInt()){
                    nBigMacs=myScanner.nextInt();
                    double totalBigmacs = nBigMacs*2.22;
                    System.out.println("You ordered "+nBigMacs+" for a cost of "+nBigMacs+"x2.22 = "+totalBigmacs);
                    if (nBigMacs<0){
                        System.out.println("Amount of Big Macs is < 0");
                    }
                }
                else{System.out.println("You did not enter an int");
                //Leaves program, program terminates
                return;
                }
                double mealTotal = nBigMacs*2.22;
                //Promp user whether or not to include fries
                System.out.print("Would you like to include fries, Enter 1 for yes or 0 for no: ");
                //Accept user input or print error message 
                int answer= myScanner.nextInt();
                if (answer == 1){
                    System.out.println("You ordered fries at a cost of $2.15" );
                    double fries = 2.15;
                    mealTotal+=2.15;
                    System.out.println("The total cost of your meal is "+mealTotal);
                }
                
                if (answer == 0){
                    System.out.println("The total cost of your meal is "+mealTotal);
                }
             
                if (answer != 1 && answer != 0){
                    System.out.println("You did not enter a valid reply");
                }   
                
            }
        }

