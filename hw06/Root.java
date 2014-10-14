//Ryan Staffen
//CSE 002 Section 111
//hw06 Root

//This program uses a random number generator to simulate 100 roulette
//games with a one dollar bet on each spin.  It simulates this scenario
//1000 times to create data on how effective betting a dollar every game
//for 100 games would be for having positive winnings at the casino

//import java scanner
    import java.util.Scanner;
    
    //Create a class
    public class Root{
        
        //Create main method
        public static void main(String[] args){
            //Declare Scanner
            Scanner myScanner;
            //initiate scanner
            myScanner = new Scanner(System.in);
            
            double low = 0;
            double high = 0;
            double middle = 0;
            double in;
            
            System.out.println("Enter a double to find the square root of: ");
            in = myScanner.nextDouble();
            
            high = in + 1;
            middle = (low + high)/2;
            
            double dif = high - low;
            double prec = 0.0000001*high;
            
            while(dif > prec){
                
                if(middle * middle > in){
                    high = middle;
                }
                else{
                    low = middle;
                }
                middle = (low + high)/2;
                dif = high - low;
                
            }
            
            System.out.printf("The square root of %.2f is: %.10f\n", in, high);
            
            
        } 
    }
                     
      
    