// Ryan Staffen
// CSE 002 Section 111
//HW 11 Poker Hands

//The first program prompts the user to enter a five card poker hand and then 
//prints out the rank of the hand as a straight or flush, etc. 

//Program 2 The 2nd program builds a 3d array and uses methods to find the smallest 
//value in the array and sorts by insertion and selection sorts

import java.util.Scanner; 
public class PokerHands{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 'Y' or 'y' to enter a(nother) hand: "); 
        
        String reply = scan.next(); 
        
        if (reply == "Y" || reply == "y"){
            
             for (int i = 0, i < 5, i++){   
                System.out.println("Enter the suit: 'c' 'd' 'h' or 's':  ");
                String suitreply= scan.next();
                
                while(suitreply == "c"){
                    System.out.print("Clubs: ");
                }
                
            }
            
            for (int j = 0, j < 5, j++){
                System.out.println("Enter one of 'a' 'k' 'q' 'j' .....'2':  ");
                string cardreply = scan.next(); 
                
                System.out.print(cardreply);
            }
            
            
        
        }
        
    }
        
        public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ","Spades:   "};
	String face[]={ "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }

    
}