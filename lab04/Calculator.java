//Ryan Staffen
//CSE 002
//LAB 04

//This lab again uses input from the user to obtain 2 integers through a 
//scanner and then will carry out multiple artihmatic calculations as long
//as the correct operators are provided by the user otherise a switch 
//statement will provide an error messaage


import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        
        Scanner scan1 = new Scanner(System.in);
        
        //declare integers
        int num1;
        int num2;
        //Print statements to obtain integer values
        System.out.print("Please enter the first integer: ");
        num1 = scan1.nextInt();
        System.out.print("Please enter the second integer: ");
        num2 = scan1.nextInt();
        
        //Print statement to obtain operator
        String operator;
        System.out.print("Please enter an operator: * , + , / , or - : ");
        
        operator = scan1.next();
        
        //switch portion of program to select operator and perform operation
        
        switch (operator){
            case "*":
                System.out.println(num1*num2);
                
            break;
            
            case "+":
                System.out.println(num1+num2);
            break;
            
            case "/":
                System.out.println(num1/num2);
            break;
            
            case "-":
                System.out.println(num1-num2);
            break;
            
            default:
                System.out.println("You did not enter a valid operator");
            break;
                
            
        }
        
    }
}