//Ryan Staffen
//CSE 002
//9.28.2015
//HW 05 averageGrade

//This program uses while loops and if-else statements to 
//take input from the user of exam scores and then average the 
//scores entered upon a user input of "999" to terminate the loop

import java.util.Scanner;

    public class averageGrade{
        public static void main(String[] args){
            
        Scanner scan = new Scanner(System.in);
        
        //Print input statment and store test scores
        
        int testscore;
        int count = 0;
        int combinedscore = 0;
        
        System.out.print("Please enter the test scores on a grade scale of 0 to 100: ");
        
        testscore = scan.nextInt();
        
                //while statement that determines if test score is in range, prints error statement 
                //and asks for correct input
        
                while (testscore < 0 || testscore > 100){
                    
                    System.out.print("That is not a valid test score, please enter a valid score: ");
                    
                    testscore = scan.nextInt();
                    
                    break;
                }
                
                //while statement that is executed with correct score input and repeated 
                //until "999" is entered to terminate the loop and display the average
                
                while (testscore > 0 && testscore <= 100){
                    
                    if(testscore != 999){
                        
                        combinedscore += testscore;
                        count++;
                        
                        System.out.print("Please enter the next score: ");
                        testscore = scan.nextInt();
                        
                        
                    }
                    
                    if(testscore == 999){
                        int average = combinedscore/count;
                        
                        System.out.println("The average of the scores was: "+average);
                    }
                }
        
            
            
            
            
            
            
            
        }
    }