//Ryan Staffen
//CSE 002 Section 111
//hw04 Time Padding

//This program has user input number of seconds that have passed 
//during day and then prints a result as current digital time

    //Import java Scanner
       //Import java Scanner
      import java.util.Scanner;
      
      //Create a class
        public class TimePadding{
            
            //Add main method
            public static void main(String[] args){
                
                //Declare scanner
                  Scanner myScanner;
                //Initiate scanner
                  myScanner = new Scanner(System.in);
                 
                //Prompt user for input
                  System.out.print("Enter the time in seconds: ");
                  
                //Accept user input
                  int nSeconds= myScanner.nextInt();
                  
                  //Convert Seconds into time
                  System.out.println("("+nSeconds+/60"):("+nSeconds+/3600"):("+nSeconds+ % 3600")");
                  
                  //In this program I could not get it to compile, I could not figure out how to get it to print
                  //or calculate separately the hours minutes and seconds
                  //end main method
            }
        }