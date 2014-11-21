//Ryan Staffen
//CSE 002 Section 111
//hw10 PokerOdds

//This program uses an array representing the 52 cards in a deck
//and uses a random number generator to simulate 1000 hands and 
//keep track of the number of times that a hand with a specific rank
//occurs, along with the number of hands that do not have a pair.

 import java.util.Random;
 import java.util.Scanner;
 
    public class PokerOdds{
        
        public static void main(String[] args){
            showOneHand();
            simulateOdds();
            
        }
    
        public static void showOneHand(){
            
            Scanner scan = new Scanner(System.in);
            
            int deck[] = new int[52];
            String suits[] = {"Diamonds", "Hearts", "Clubs", "Spades"};
            String rank[] = {"Ace", "2", "3", "4", "5", "6", "7","8","9","10","Jack","Queen","King"};
            
            for (int a = 0; a<deck.length; a++)
                deck[a]=a;
            
            for (int a = 0; a<deck.length; a++){
                
                int num = (int)(Math.random() *deck.length);
                int temp = deck[a];
                deck[a]= deck[num];
                deck[num]= temp;
            }
            
            System.out.println("The 5 cards in your hand are: ");
            
            for (int a = 0; a<5; a++){
                String suit = suits[deck[a] /13];
                String rank1= rank[deck[a] %13];
                System.out.println(rank1+" of "+suit+" ");
                
                
                
                }
                
       
        }
        
        public static void simulateOdds(){
            int pairCount=0;
            for(int hands = 0; hands<=10000; hands++){
                
                int deck[] = new int[52];
                int rank[] = new int[5];
                
                for(int a = 0; a < deck.length; a++)
                    deck[a] = a;
                    
                for(int a = 0; a < deck.length; a++){
                    int num = (int)(Math.random()*deck.length);
                    int temp = deck[a];
                    deck[a]=deck[num];
                    deck[num]=temp;
                    
                
                for(int b = 0; b < 5; b++){
                    deck[b]=deck[num];
                    
                    if(exactlyOneDup(deck) == true){
                        pairCount++;
                        }
                    }    
                }
                
            }
            System.out.println();
            System.out.println("There were " +pairCount+" hands with exactly one pair");
        }    
            
        public static boolean exactlyOneDup(int deck[] ){
            int count = 0;
            for(int c = 0; c<deck.length;c++){
                for(int d = 0; d<deck.length;d++){
                    if(deck[c] == deck[d]){
                        count++;
                    }
                }
                if(count == 1){
                    return true;
                }
            }
            return false;
        }
            
}
        

       
                
    
            
