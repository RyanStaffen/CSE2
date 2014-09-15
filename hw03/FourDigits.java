//Ryan Staffen
//CSE 002 Section 111
//hw03 FourDigits

//Program prompts user to enter a double and then prints out
//the first four digits to the right of the decimal point. 

    //Import Java Scanner
    import java.util.Scanner;
    
        //Define a class
        public class FourDigits{
        
            //Add main method
            public static void main(String[] args){
            
                //Declare Scanner
                Scanner myScanner;
                //Initiate Scanner input
                myScanner = new Scanner(System.in);
                
                //Print user input promp for number
                System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
                //Accept user input
                double myValue1 = myScanner.nextDouble();
                //Convert input to correct output format
                double myValue = (myValue1*10000);      //Creates value that can be casted into an intger
                int myValueInt = (int) myValue;         //Casts value into an integer
                int printVal1 =(myValueInt/1000 %10);   //Isolates and stores first digit
                int printVal2 =(myValueInt/100 %10);    //Isolates and stores second digit
                int printVal3 =(myValueInt/10 %10);     //Isolates and stores third digit
                int printVal4 =(myValueInt %10);        //Isolates and stores fourth digit
                
                //Print output
                System.out.println("The four digits are: "+printVal1+""+printVal2+""+printVal3+""+printVal4+"");
                
                //End main method
                
                }
                
            }    