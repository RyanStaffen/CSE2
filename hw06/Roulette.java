//Ryan Staffen
//CSE 002 Section 111
//hw06 Roulette

//This program uses a random number generator to simulate 100 roulette
//games with a one dollar bet on each spin.  It simulates this scenario
//1000 times to create data on how effective betting a dollar every game
//for 100 games would be for having positive winnings at the casino

//import java scanner
    import java.util.Scanner;
    
    //Create a class
    public class Roulette{
        
        //Create main method
        public static void main(String[] args){
            //Declare Scanner
            Scanner myScanner;
            //initiate scanner
            myScanner = new Scanner(System.in);
            //Prompt user to select a number between 0 and 37
            System.out.print("Enter an integer between 0 and 38: ");
            int betNum = myScanner.nextInt();
            //initiate counter
            int counter1 = 0;
            int counter2 = 0;
            //Create random integer 
            
            //Create winings variable
            int wins = 0;
            int positiveWinnings = 0;
            int totalWinnings = 0;
            double winnings = 0;
            double avgWinnings = 0;
            
            
            while (counter2 < 1000){
                counter2++;
                while (counter1 < 100){
                    int winNum = (int) (Math.random()*38);
                    counter1++;
                        if (betNum == winNum){
                            wins++;
                    
                        }
                        winnings = ((wins * 36)-100);
                        if (winnings >= 0){
                            positiveWinnings++;
                            }
                        totalWinnings = ((wins * 36)-10000);
                        }
                       
                avgWinnings = (totalWinnings / 1000);
                
            }
            System.out.println("You had the following amt of positive nights: " +positiveWinnings);    
            System.out.println("Your average winnings are: " +avgWinnings);
            }
            
        }    
                     
      
    