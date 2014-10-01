//Ryan Staffen
//CSE 002
//hw05 Boola Boola program

// This program stores three boolean variables and randomly 
// combines them with random choice of && and || and stores 
// the result.  The program then presents the expression to 
// the user and asks them to state the result of the 
// expression. 

    //Import java scanner
    import java.util.Scanner;
    
        //Create a class
        public class BoolaBoola{
            
            //Create main method
            public static void main(String[] args){
                
                //Declare Scanner
                Scanner myScanner;
                //Initiate Scanner
                myScanner = new Scanner(System.in);
                //5 random ints (0 or 1)
                int a1 = (int)(Math.random()*2);
                int b1 = (int)(Math.random()*2);
                int c1 = (int)(Math.random()*2);
                int o1 = (int)(Math.random()*2);
                int o2 = (int)(Math.random()*2);
                
                boolean a = false;
                boolean b = false;
                boolean c = false;
                //Establish Strings
                String op1 = "";
                String op2 = ""; 
                
                switch(a1){
                    case 0: break;
                    case 1: a = true;
                            break;
                }
                switch(b1){
                    case 0: break;
                    case 1: b = true;
                            break;
                }
                switch(c1){
                    case 0: break;
                    case 1: c = true;
                            break;
                }
                switch(o1){
                    case 0: op1 = "||";
                            break;
                    case 1: op1 = "&&";
                            break;
                }
                switch(o2){
                    case 0: op2 = "||";
                            break;
                    case 1: op2 = "&&";
                            break;
                }
                
                System.out.println("Does " + a + " " + op1 + " " +  b + " " +  op2 + " " + c + " have the value of True(T/t) or False(F/f)?: " );
                String input = myScanner.next();
                boolean in = false;
                switch(input){
                    case "T":
                    case "t":
                        in = true;
                        break;
                    case "F":
                    case "f":
                        break;
                    default:
                        System.out.println("I'm sorry, invalid input.");
                }
                
                
                boolean ans = false;
        
                if( op1.equals("||") && op2.equals("||")){
                    if(a || b || c)
                        ans = true;
                }
                else if( op1.equals("||") && op2.equals("&&")){
                    if(a || b && c)
                        ans = true;
                }
                else if( op1.equals("&&") && op2.equals("||")){
                    if(a && b || c)
                        ans = true;
                }
                else if( op1.equals("&&") && op2.equals("&&")){
                    if(a && b && c)
                        ans = true;
                }
                
                if( ans && in )
                    System.out.println("Correct");
                else if( ans && !in )
                    System.out.println("Incorrect, the answer is true");
                else if( !ans && in)
                    System.out.println("Incorrect, the answer is false");
                else if( ans || !in)
                    System.out.println("Correct");
                
        }
}