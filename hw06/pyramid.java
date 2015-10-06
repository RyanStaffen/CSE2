//Ryan Staffen
//CSE 002
//10-6-2015
//HW 06

//This program accepts an integer user input and then outputs a pyramid design
//sized based off the input using a combination of loops

import java.util.Scanner;

public class pyramid{
    public static void main(String[] args){

    //declare scanner
    Scanner scan1 = new Scanner(System.in);
    
    //Print input statement
    System.out.print("Please enter the desired pyramid size: ");
    
    int size = scan1.nextInt();
    
    
    for (int rows = 1 ; rows <= size ; rows++){
        for (int spaces = 1 ; spaces <= size - rows ; spaces++){
            System.out.print(" ");
            
            for (int stars = 1; stars <= 2*rows-1; stars++){
                System.out.print("*");
            }
            
        }
        
        System.out.println();
    }




//I could not quite figure out this pattern.  I was close but need to
//experiment a little more with the nested loops. 






        
    }
}