//Ryan Staffen
//CSE 002 Section 111
//hw03 Bicycle

//Program prompts user to enter number of counts on a cyclometer and the number of seconds 
//over which counts occured.  Distance traveled is then printed along with average miles per
//hour. 

//  Import Java Scanner
    import java.util.Scanner;

        //Define a class
         public class Bicycle{

            //Add Main Method
            public static void main(String[] args) {
            
                //Declare Scanner
                Scanner myScanner;
                //Initiate Scanner input
                myScanner = new Scanner(System.in);
            
                //Print user input prompt for seconds
                System.out.print("Enter the number of seconds: ");
                //Accept user input
                int nSeconds = myScanner.nextInt();
                //Print user input prompt for cyclometer counts
                System.out.print("Enter the number of counts: ");
                int nCounts = myScanner.nextInt();
            
                    //Create constant variables
                    double wheelDiameter=27.0; // Wheel Diameter
                    double PI=3.14159; //Decimal equivalent for pi
                    double feetPerMile=5280; //Distance in feet per mile
                    double inchesPerFoot=12; //Distance in inches per foot
                    double secondsPerMinute=60; //Seconds per minute
                
                    //Calculate and Store Distance and Duration results
                    double TripDistance= ((nCounts*wheelDiameter*PI)/(inchesPerFoot*feetPerMile));
                    double TripTime= nSeconds/60;
                    double TripTimeHR= TripTime/60;
                    double AverageMPH= TripDistance/TripTimeHR;
                    
                    //Format Decimals
                    String result1 = String.format("%.2f", TripDistance);
                    String result2 = String.format("%.2f", TripTime);
                    String result3 = String.format("%.2f", AverageMPH);
                
                    
                    //Print Results
                    System.out.println("The distance was "+result1+" miles and took "+result2+" minutes");
                    System.out.println("The average mph was "+result3+"");
                
            
                //end main method
             }
        }