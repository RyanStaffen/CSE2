//Ryan Staffen
//CSE 002 Section 111
//hw04 Income Tax

//This program prompts user to enter amount of thousands of dollars of income
//and then prints out a tax amount based on a tax scale

    //Import java scanner
      import java.util.Scanner;
      
        //Define a class
          public class IncomeTax{
              
              //Initiate main method
                public static void main(String[] args){
                    double finalNet;
                    
                    //Declare Scanner
                      Scanner myScanner;
                      
                    //Initiate Scanner for input
                      myScanner = new Scanner(System.in);
                      
                    //Print user prompt for income in thousands
                      System.out.print("Enter income in number of thousands: ");
                    //Accept User Input
                      int nIncome = myScanner.nextInt();
                    
                    //Create if statements for tax brackets
                        if (nIncome<=20){
                            finalNet = (nIncome*0.05)*1000;
                            System.out.println("The tax rate on $"+nIncome+"000 is 5%, and the tax is: "+finalNet);
                        }
                        else if  (20<nIncome && nIncome<40){
                            finalNet = (nIncome*0.07)*1000;
                            System.out.println("The tax rate on $"+nIncome+"000 is 7%, and the tax is: "+finalNet);
                        }
                        else if (40<nIncome && nIncome<78){
                            finalNet = (nIncome*0.12)*1000;
                            System.out.println("The tax rate on $"+nIncome+"000 is 12%, and the tax is: "+finalNet);
                        }
                        else if (78<=nIncome){
                            finalNet = (nIncome*0.14)*1000;
                            System.out.println("The tax rate on $"+nIncome+"000 is 14%, and the tax is: "+finalNet);
                        }
    
                    }//end main method
                }
          
      