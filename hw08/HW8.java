//Ryan Staffen
//CSE 002 Section 111
//hw08 HW8.java

//Overloaded methods are used to take 
//a string input from the user as a single
//character and print out the character entered
//by the user out of the listed string.
//It also forces the user to continue input of a
//single character until it satisifies the condition
//of being a character contained in the string


    import java.util.Scanner;
        public class HW8{
            static int f = 0;
            public static char getInput(Scanner scan, String in){
                String s = scan.next();
                boolean good = false;
                if(s.length() > 1){
                    System.out.print("You should enter exactly one character- ");
                    return getInput(scan, in);
                }
                char c = s.charAt(0);
                for(int i = 0; i < in.length(); i++){
                    if(c == in.charAt(i)){
                        good = true;
                    }
                }
                if(!good){
                    System.out.print("You did not enter a character from the list '" + in + "' try again- ");
                    return getInput(scan, in);
                }
                return c;
            }
            
            public static char getInput(Scanner scan, String in, int tries){
                int l = in.length();
                if(f == 0){    
                    System.out.print("Enter ");
                    for(int i = 0; i < l-1; i++){
                        System.out.print("'"+in.charAt(i)+ "', ");
                    }
                    System.out.print("or '"+in.charAt(l-1)+ "'- ");
                }
                
                String s = scan.next();
                boolean good = false;
                char c = ' ';
                if(f < tries){
                    if(s.length() > 1){
                        System.out.print("You should enter exactly one character- ");
                        f++;
                        return getInput(scan, in, tries);
                    }
                    c = s.charAt(0);
                    for(int i = 0; i < in.length(); i++){
                        if(c == in.charAt(i)){
                            good = true;
                        }
                    }
                    if(!good){
                        System.out.print("You did not enter a character from the list '" + in + "' try again- ");
                        f++;
                        return getInput(scan, in, tries);
                    }
                }
                return c;
            }
            
            public static char getInput(Scanner scan, String in, String nums){
                boolean good = false;
                System.out.println("Choose a digit.");
                int l = nums.length();
                System.out.print("Enter one of: ");
                for(int i = 0; i < l-1; i++){
                    System.out.print("'"+nums.charAt(i)+ "', ");
                }
                System.out.print("'"+nums.charAt(l-1)+ "'- ");
                
                String s = scan.next();
                if(s.length() > 1){
                    System.out.println("Enter exactly one character");
                    return getInput(scan, in, nums);
                }
                char c = s.charAt(0);
                for(int i = 0; i < l; i++){
                    if(c == nums.charAt(i)){
                        good = true;
                    }
                }
                if(!good){
                    System.out.println("You did not enter an acceptable character");
                    return getInput(scan, in, nums);
                }
                return c;
            }
            
            public static void main(String[] args){
                //code from hw
                char input;
                Scanner myScan = new Scanner(System.in);
                System.out.print("Enter 'C' or 'c' to continue, anything else to quit: ");
                input = getInput(myScan, "Cc");
                System.out.println("You entered '" + input +"'");
                input = getInput(myScan, "yYnN",5); //terminates after 5 incorrect guesses
                if (input != ' '){
                    System.out.println("You entered '" +input+"'");
                }
                input = getInput(myScan,"Choose a digit.","0123456789");
                System.out.println("You entered '"+input+"'");
            }
        }