//Ryan Staffen 
//CSE 002 Section 111
//hw04 CourseNumber

//This program prompts the user to enter a 6 digit number representing 
//year and semester number and then prints a statement of the year
//and semester the class was offered

    //Import java Scanner
      import java.util.Scanner;
      
      //Create a class
        public class CourseNumber{
            
            //Add main method
            public static void main(String[] args){
                
                //Declare scanner
                  Scanner myScanner;
                //Initiate scanner
                  myScanner = new Scanner(System.in);
                  
                //Prompt User for input
                  System.out.print("Enter a six digit number representing course semester: ");
                //Accept user input
                  int nCourse = myScanner.nextInt();
                  
                  //Create if statements for course number
                  if(nCourse<186510 || nCourse>201440){
                      System.out.println("This course was not in the range between 186510 and 201440");
                      }
                    else if(nCourse>186510 || nCourse<201440){
                      System.out.println("The course was offered in "+nCourse+ % 1000000"");
                    
                      //I could not figure out how to separate the digits that need to print and correspond with the semester
                      //offered in 
                    }
            }
        }