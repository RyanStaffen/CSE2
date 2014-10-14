//Ryan Staffen
//CSE 002 Section 111
//hw06 Root

//this program computes the square root of a double entered by the user
//by using a while loop to compare a low, middle, and high value until
//the precision is wihtin .0000001

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
                     
      
    