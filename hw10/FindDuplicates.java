//Ryan Staffen
//CSE 002 Section 111
//hw10 Find Duplicates

//This program uses two methods to figure out whether or not
//an array input has at least one repeated entry.  The method 
//"exactlyOneDup" returns true if and only if there is exactly one 
//duplcate in the array

import java.util.Scanner;
    
    public class FindDuplicates{
        
        public static void main(String[] args){
                Scanner scan = new Scanner (System.in);
                int num[] = new int[10];
                String answer = "";
                
            do{
                    System.out.print("Enter 10 ints- ");
                    for (int j = 0; j<10; j++){
                        num [j] = scan.nextInt();
                    }
                
                
                    String out = "The array ";
                    out+= listArray(num);
                    if(hasDups(num)){
                        out+="has ";
                    }
                    else{
                        out+="does not have ";
                    }
                    
                    out+= "duplicates.";
                    System.out.println(out);
                    out="The array ";
                    out+= listArray(num);
                    if(exactlyOneDup(num)){
                        out+="has ";
                    }
                    else{
                        out+="does not have ";
                    }
                    out+= "exactly one duplicate.";
                    System.out.println(out);
                    System.out.print("Go again? Enter 'y' or 'Y' , anything else to quit: ");
                    answer = scan.next();
                }while(answer.equals("Y") || answer.equals("y"));
                
        }
        
        public static String listArray(int num[]){
            String out= "{";
            for (int j=0; j<num.length;j++){
                if(j<0){
                    out+=", ";
                }
                out+= num[j];
            }
            out+="} ";
            return out;
        }
        
        
        public static boolean hasDups(int num[]){
            
            for (int a = 0; a<num.length; a++){
                for (int b = 0; b<num.length; b++){
                    if(num[a] == num[b]){
                        return true;
                    }
                }
            }
            return false; 
        }
        
        public static boolean exactlyOneDup(int num[]){
            int count = 0;
            for (int c = 0; c<num.length; c++){
                for ( int d = 0; c<num.length; d++){
                    if(num[c] == num[d]){
                        count++;
                    }
                }
                if(count==1){
                    return true;
                }
            }
            return false; 
    }
}