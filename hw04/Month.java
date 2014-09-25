//Ryan Staffen
//CSE 002 Section 111
//hw04 Month

//This program prompts the user to enter and integer 
//representing a month and then prints the number of days
//in that month

 //Import java Scanner
   import java.util.Scanner;

    //Define a class
      public class Month{
          
        //Add main method
          public static void main(String[] args){
              
              //Declare scanner
              Scanner myScanner;
              //Initiate Scanner
              myScanner = new Scanner(System.in);
              
              //Print user prompt for month number
              System.out.print("Enter number correlating to month(1-12): ");
              //Accept user input
              int nMonth = myScanner.nextInt();
              
              //Create if statements for program logic
              if (nMonth==1 || nMonth== 3 || nMonth==5 || nMonth==7 || nMonth==8 || nMonth==10 || nMonth==12){
                  System.out.println("The month has 31 days");
              }
                  else if (nMonth==9 || nMonth==4 || nMonth== 6 || nMonth== 11)
                  System.out.println("The month has 30 days");
                  else if (nMonth==2)
                  System.out.print("Enter the year: ");
                  int nYear = myScanner.nextInt();
                  
                    
                    if (nYear % 4 == 0 && nYear % 100 != 0 || nYear % 400 == 0){
                    System.out.println("The month has 29 days");
                    }
                      else if (nYear % 4 != 0)
                      System.out.println("The month has 28 days");
                      
                      //end main method
             
              
          }
      }