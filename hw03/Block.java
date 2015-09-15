//Ryan Staffen
//CSE 002
//Hw 03 Block Program

//This program prompts the user to input the length, width and heigth of a block
//and outputs the volume and surface area of said block

//import java Scanner utility
import java.util.Scanner;

    //Create Block class and main method
    public class Block{
        public static void main(String[] args){
            
            Scanner scan = new Scanner(System.in);
            
            //Prompt user for input of dimensions
            System.out.print("Please enter block length: ");
            double length = scan.nextDouble();
            System.out.print("Please enter block width: ");
            double width = scan.nextDouble();
            System.out.print("Please enter block heigth: ");
            double heigth = scan.nextDouble();
            //calculations for block volume and surface area
            double Volume = length*width*heigth;
            
            double surfaceArea = 2*length*width+2*length*heigth+2*width*heigth;
            
            //print results
            System.out.println("The block with dimensions "+length+" x "+width+" x "+heigth+" has a volume of "+Volume+" and surface area of "+surfaceArea);
            System.out.println();
            
        }
    }
