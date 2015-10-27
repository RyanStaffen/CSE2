//Ryan Staffen
//CSE 002
//HW 08 
//This program uses methods to receive integer(s) and then compute the area of either a circle, rectangle, or trapezoid
//based on the users input

//import java scanner utility

import java.util.Scanner;

public class areas{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter 1 to compute circle area, 2 for rectangle, or 3 for trapezoid: ");
        
        int reply = scan.nextInt();
        
        if(reply == 1 ){
            
            System.out.print("Please enter the radius as an int: ");
            
            int radius = scan.nextInt();
            
            double answer = areas(radius);
            
            System.out.println("The area of the circle is: "+answer);
        }else if(reply == 2 ){
            
            System.out.print("Please enter the length: ");
            int length = scan.nextInt();
            
            System.out.print("Please enter the width: ");
            int width = scan.nextInt();
            
            double answer2 = areas(length, width);
            
            System.out.println("The area of the rectangle is: "+answer2);
            
        }else if(reply == 3 ){
            
            System.out.print("Please enter the first base: ");
            int baseA = scan.nextInt();
            
            System.out.print("Please enter the second base: ");
            int baseB = scan.nextInt();
            
            System.out.print("Please enter the height: ");
            int height = scan.nextInt();
            
            double answer3 = areas(baseA, baseB, height);
            
            System.out.println("The area of the trapezoid is: "+answer3);
            
        }else{
            System.out.print("You did not enter a valid response, please try again: ");
            
            reply = scan.nextInt();
        }
    }

    
    
    public static double areas(int a){
        
        double rSQ = a*a;
        double answer = rSQ*3.14;
        
        return answer;
    }
    
    public static double areas(int a, int b){
        
        double area = a*b;
        
        return area;
    }
    
    public static double areas(int a, int b, int c){
        
        double bases = (a + b)/2;
        
        double area = bases * c;
        
        return area; 
    }
    
    
    
    
    
}