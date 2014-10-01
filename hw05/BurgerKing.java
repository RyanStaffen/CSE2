//Ryan Staffen
//CSE 002 Section 111
//hw05 Burger King Program

//This program prompts the user to choose a burger, soda, 
//or fries.  It then asks the user to input the details 
//of their order.

    //Import java scanner
        import java.util.Scanner;
        
        //Create a class
            public class BurgerKing{
                //Create main method
                    public static void main(String[] args){
                      
                        
                       
                        //Declare Scanner
                        Scanner myScanner;
                        //Initiate Scanner
                        myScanner = new Scanner(System.in);
                        
                        String order1;
                        String burgerTopp;
                        String soda;
                        String fries;
                        
                        
                           //Prompt user for input
                             System.out.print("Enter 'B' for a burger, 'S' for a soda, or 'F' for fries: ");
                           //Accept user input
                             order1 = myScanner.next();
                             
                             //if statements for order 1
                                if (order1.equals("B") || order1.equals("b")){
                                    System.out.print("Enter 'A' for all toppings, 'C' for cheese only, or 'P' for plain: ");
                                    burgerTopp = myScanner.next();
                                    if (burgerTopp.equals("A") || burgerTopp.equals("a"))
                                        System.out.println("You ordered a burger with all toppings");
                                    if (burgerTopp.equals("C") || burgerTopp.equals("c"))
                                        System.out.println("You ordered a burger with cheese only");
                                    if (burgerTopp.equals("P") || burgerTopp.equals("p"))
                                        System.out.println("You ordered a plain burger");
                                    }
                                else if (order1.equals("S") || order1.equals("s")){
                                    System.out.print("Enter 'M' for Mt. Dew, 'P' for Pepsi, or 'S' for Sprite: ");
                                    soda = myScanner.next();
                                    if (soda.equals("M") || soda.equals("m"))
                                        System.out.println("You ordered a Mt. Dew");
                                    if (soda.equals("P") || soda.equals("p"))
                                        System.out.println("You ordered a Pepsi");
                                    if (soda.equals("S") || soda.equals("s"))
                                        System.out.println("You ordered a Sprite");
                                    }
                                else if (order1.equals("F") || order1.equals("f")){
                                    System.out.print("Enter 'L' for large fries or 'S' for small fries");
                                    fries = myScanner.next();
                                    if (fries.equals("L") || fries.equals("l"))
                                        System.out.println("You ordered large fries");
                                    if (fries.equals("s") || fries.equals("S"))
                                        System.out.println("You ordered small fries");
                                    }
                                                
                                else{
                                    System.out.println("Invalid selection");
                                }
                                                
                                                
                           //end main method              
                                        
                }
            }
            