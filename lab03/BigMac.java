//Ryan Staffen
//CSE 002 Section 111
//Lab 03 

//  This program uses a scanner class to obtain the information of how
// many Big Macs, the cost of each, and the tax percentage for the
// sandwich to generate a total price.  

//  Import Java Scanner
    import java.util.Scanner;
    
//      Declare a class
        public class BigMac {
            //Add main method
                public static void main(String[] args) {
                    //Declare scanner
                    Scanner myScanner;
                    //Initiate Scanner input
                    myScanner = new Scanner(System.in);
                    //Create command for user input
                    System.out.print("Enter the number of Big Macs (an integer > 0):");
                    //Accept User Input
                    int nBigMacs = myScanner.nextInt();
                    //Prompt User for Big Mac Cost and Sales Tax
                    System.out.print("Enter the Cost per Big Mac as"+" a double (in the form xx.xx):");
                    double bigMac$ = myScanner.nextDouble();
                    System.out.print("Enter the percent tax as a whole number (xx): "); 
                    double taxRate = myScanner.nextDouble();
                    taxRate/=100; //Users enters percentage, proportion desired
                    //Print Output
                    double cost$;
                        int dollars, dimes, pennies; //whole dollar amount of cost dimes, pennies
                        cost$ = nBigMacs*bigMac$*(1+taxRate);
                        dollars=(int)cost$;
                        dimes=(int)(cost$*10)%10;
                        pennies=(int)(cost$*100)%10;
                        System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$+" per bigMac, with a "+" sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies);
                    
                } //end main method
                
        }