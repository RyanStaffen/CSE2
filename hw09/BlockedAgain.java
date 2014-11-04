//Ryan Staffen
//CSE 002 Section 111
//hw09 BlockedAgain

//This program uses a nested sequence of method calls to divide the larger 
//problem into subproblems. Creating modular programs to solve subproblems it
//represents code that allows multiple people to work on it at one time without
//wasting time accidentally


import java.util.Scanner; //import java scanner
    public class BlockedAgain{  //defines class
    
    static Scanner myScanner = new Scanner(System.in);
    
        public static int getInt(){ //defines getInt class
                int m = 0;
            
                while(true){
                    
                    System.out.print("Enter an int between 1 and 9, inclusive: "); //Prints original integer prompt
                    if(checkInt()){
                        m = myScanner.nextInt();
                        if(checkRange(m)){  //Calls method CheckRange and returns true, otherwise sends to error statement
                            break;
                        }
                        else{
                            System.out.println("You did not enter an integer between 1 and 9, please try again: "); //error statement for checkRange
                        }
                    }
                    else{
                        System.out.println("You did not enter an int, Try again: ");//error statement for CheckInt
                    }
                    
                    myScanner.next(); //Stores variable after it has passed both checkInt and CheckRange
                }
                
                 return m; //Returns int m as number input for rest of program
        }
        
        public static boolean checkInt(){ //checkInt method 
            if(myScanner.hasNextInt())  //if input is an int, checkInt method returns as true for getInt method
                return true;
                
            return false; //if input is not an int, checkInt returns as false for getInt Method
        }
        
        public static boolean checkRange(int m){ //checkRange method
            if(m < 1 || m >9){  //if input is not between 1 and 9, inclusive, returns checkRange as false for getInt method
                return false;
            }
            return true; //if input is in the desired range, checkRange returns as true for getInt method
        }
        public static void space(String s){ //method for spaces in output of program
            System.out.print(s); 
        }
        public static void printNum(int num){ //method for the number to be printed in output based on input from user
            System.out.print(num);
        }
        
        
        public static void allBlocks(int in){ //method to format block output, takes input from getInt and formats the lines and numbers
            int dash = 1;
            int per = 1;
            int spaces = in;
            
            for(int i = 1; i < in + 1; i++){ //count
                
                for(int j = 0; j < i; j++){
                    
                    for(int z = 0; z < spaces; z++){
                        space(" ");
                    }
                    
                    for(int x = 0; x < per; x++){
                        printNum(i);
                    }
                    System.out.println();
                }
                
                for(int z = 0; z < spaces; z++){
                        space(" ");
                    }
                
                for(int y = 0; y < dash; y++){
                    space("-");
                }
                
                System.out.println();
                per += 2;
                dash += 2;
                spaces--;
            }
        }
        public static void main(String[] args){ //main method, calls getInt after input has been verified through checkInt and checkRange 
            int c;
            c = getInt(); //establishes input from getInput as variable "c"
            allBlocks(c); //calls method allBlocks with respect to variable c, running method allBlocks with C as the input
            
        }
        
    }
