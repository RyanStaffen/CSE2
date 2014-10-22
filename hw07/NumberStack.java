//Ryan Staffen
//CSE 002 Section 111
//hw07 NumberStack

//This program forces the user to enter an integer from 1-9 and then 
//creates an output pattern based on the number accepted using for,while,
//and do-while loops. 

    //import java scanner
    import java.util.Scanner;
    
    //Create a class
        public class NumberStack{
        
        //Create main method
            public static void main(String[] args){
            
                //Declare Scanner
                Scanner myScanner;
            
                myScanner = new Scanner(System.in);
            
                //Prompt user for int 
                System.out.print("Please enter an int in the range 1-9: ");
            
                int inp1 = myScanner.nextInt();
                
                
                
                //Create while loops for input error
                
                while (inp1 > 9){
                    System.out.println("You did not enter an int in the range");
                    break;
                }
                while (inp1 < 1){
                    System.out.println("You did not enter an int in the range");
                    break;
                }
                
                //Create while and nested while loops for correct input and coordinated output
                while (inp1 <= 9){
                    
                    while (inp1 == 1){
                        System.out.println("        1        ");
                        System.out.println("        -        ");
                        break;
                    }    
                    while (inp1 == 2){
                        System.out.println("        1        ");
                        System.out.println("        -        ");
                        System.out.println("       222       ");
                        System.out.println("       222       ");
                        System.out.println("       ---       ");
                        break;
                    }
                    while (inp1 == 3){
                        System.out.println("        1        ");
                        System.out.println("        -        ");
                        System.out.println("       222       ");
                        System.out.println("       222       ");
                        System.out.println("       ---       ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      -----      ");
                        break;
                    }
                    while (inp1 == 4){
                        System.out.println("        1        ");
                        System.out.println("        -        ");
                        System.out.println("       222       ");
                        System.out.println("       222       ");
                        System.out.println("       ---       ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      -----      ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     -------     ");
                        break;
                    }
                    while (inp1 == 5){
                        System.out.println("        1        ");
                        System.out.println("        -        ");
                        System.out.println("       222       ");
                        System.out.println("       222       ");
                        System.out.println("       ---       ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      -----      ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     -------     ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    ---------    ");
                        break;
                    }
                    while (inp1 == 6){
                        System.out.println("        1        ");
                        System.out.println("        -        ");
                        System.out.println("       222       ");
                        System.out.println("       222       ");
                        System.out.println("       ---       ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      -----      ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     -------     ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    ---------    ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   -----------   ");
                        break;
                    }
                    while (inp1 == 7){
                        System.out.println("        1        ");
                        System.out.println("        -        ");
                        System.out.println("       222       ");
                        System.out.println("       222       ");
                        System.out.println("       ---       ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      -----      ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     -------     ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    ---------    ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   -----------   ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  -------------  ");
                        break;
                    }
                    while (inp1 == 8){
                        System.out.println("        1        ");
                        System.out.println("        -        ");
                        System.out.println("       222       ");
                        System.out.println("       222       ");
                        System.out.println("       ---       ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      -----      ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     -------     ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    ---------    ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   -----------   ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  -------------  ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" --------------- ");
                        break;
                    }
                    while (inp1 == 9){
                        System.out.println("        1        ");
                        System.out.println("        -        ");
                        System.out.println("       222       ");
                        System.out.println("       222       ");
                        System.out.println("       ---       ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      33333      ");
                        System.out.println("      -----      ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     4444444     ");
                        System.out.println("     -------     ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    555555555    ");
                        System.out.println("    ---------    ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   66666666666   ");
                        System.out.println("   -----------   ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  7777777777777  ");
                        System.out.println("  -------------  ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" 888888888888888 ");
                        System.out.println(" --------------- ");
                        System.out.println("99999999999999999");
                        System.out.println("99999999999999999");
                        System.out.println("99999999999999999");
                        System.out.println("99999999999999999");
                        System.out.println("99999999999999999");
                        System.out.println("99999999999999999");
                        System.out.println("99999999999999999");
                        System.out.println("99999999999999999");
                        System.out.println("99999999999999999");
                        break;
                        
                    }
                 
             break;
            
            }
            
            
            //----------------------FOR LOOP---------------------------
            
            int in = inp1;
            
            int dash = 1;
            int per = 1;
            int spaces = in;
            
            for(int i = 1; i < in + 1; i++){
                
                for(int j = 0; j < i; j++){
                    
                    for(int z = 0; z < spaces; z++){
                        System.out.print(" ");
                    }
                    
                    for(int x = 0; x < per; x++){
                        System.out.print(i);
                    }
                    System.out.println();
                }
                
                for(int z = 0; z < spaces; z++){
                        System.out.print(" ");
                    }
                
                for(int y = 0; y < dash; y++){
                    System.out.print("-");
                }
                
                System.out.println();
                per += 2;
                dash += 2;
                spaces--;
            }
            
            
            //--------------------------DO-WHILE-----------------------
            
            dash = 1;
            per = 1;
            spaces = in;
            
            int i =1;
            do{
                int j = 0;
                do{
                    int z = 0;
                    do{
                        System.out.print(" ");
                    
                        
                        z++;
                    }while (z < spaces);
                    
                    
                    int x = 0;
                    do{
                        System.out.print(i);
                        
                        x++;
                    }while (x < per);
                    
                    
                    System.out.println();
                
                
                    j++;    
                }while(j<i);
                
                
                int z = 0;
                do{
                        System.out.print(" ");
                        
                        z++;
                    }while (z < spaces);
                
                int y = 0;
                do{
                    System.out.print("-");
                    
                    y++;
                }while (y < dash);
                
                System.out.println();
                per += 2;
                dash += 2;
                spaces--;
                
                i++;
            }while(i < in + 1);
         
        }
}