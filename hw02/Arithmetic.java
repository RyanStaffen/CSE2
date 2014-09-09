//Ryan Staffen
//CSE 002 Section 111
//HW02
//9-9-2014

// first compile the program 
//      javac Arithmetic.java
// run the program
//      java Arithmetic

//  Define a class
public class Arithmetic{
    
//  Add main method
    public static void main(String[]args){
    
//  Input Variables

//  Pennsylvania Sales Tax
    double taxPercent=0.06;
//  Numbers of pairs of socks
    int nSocks=3;
//  Cost per pair of socks
    double sockCost=2.58;
//  Total Sock Cost
    double totalSockCost=((nSocks*sockCost)+(nSocks*sockCost)*(taxPercent));
//  Number of Drinking Glasses
    int nGlasses=6;
//  Cost Per Glass
    double glassCost=2.29;
//  Total Glasses Cost
    double totalglassCost=((nGlasses*glassCost)+(nGlasses*glassCost)*(taxPercent));
//  Number of Boxes of Envelopes
    int nEnvelopes=1;
//  Cost per box of Envelopes
    double envelopeCost=3.25;
//  Total Envelope Box Cost
    double totalenvelopeCost=((nEnvelopes*envelopeCost)+(nEnvelopes*envelopeCost)*(taxPercent));
    
    
//  Print Receipt Results
    System.out.println("Socks: 3 = "+totalSockCost+"");
    System.out.println("Tax on Socks:"+totalSockCost*taxPercent+"");
    System.out.println("Glasses: 6 = "+(totalglassCost+""));
    System.out.println("Tax on Glasses:"+(totalglassCost*taxPercent+""));
    System.out.println("Envelopes: 1 = "+totalenvelopeCost+"");
    System.out.println("Tax on Envelopes:"+(totalenvelopeCost*taxPercent+""));
    System.out.println("Total:"+(((totalSockCost+(totalSockCost*taxPercent))+(totalglassCost+(totalglassCost*taxPercent))+(totalenvelopeCost+(totalenvelopeCost*taxPercent))+"")));
    
    }
}