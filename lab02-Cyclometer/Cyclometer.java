//Ryan Staffen
//CSE 002 Section 111
//9-4-2015

// first compile the program
//      javac Cyclometer.java
// run the program
//      java Cyclometer//

//  define a class
public class Cyclometer{
    
//  add main method
    public static void main(String[] args) {

//  create variables for seconds of trip and rotations during trip
    int secsTrip1=480; // Number of Seconds in Trip 1
    int secsTrip2=3220; // Number of Seconds in Trip 2
    int countsTrip1=1561; // Number of Counts in Trip 1
    int countsTrip2=9037; // Number of Counts in Trip 2 

// create constant variables
    double wheelDiameter=27.0, // Wheel Diameter
    PI=3.14159, // Decimal equivalent to Pi
    feetPerMile=5280, // Distance in Feet per Mile
    inchesPerFoot=12, // Number of Inches per Foot
    secondsPerMinute=60; // Seconds Per Minute
    double distanceTrip1, distanceTrip2, totalDistance;
    
// Print out Number of Seconds and Counts
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
    
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");

// Run calculations, store and document values here

    distanceTrip1=countsTrip1*wheelDiameter*PI;
//  above represents distance in inches
    distanceTrip1/=inchesPerFoot*feetPerMile; 
//  above converts distance to miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
//  total distance declaration
    totalDistance= distanceTrip2+distanceTrip1;

// Print out the distances

    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
// end of main method
    }
// end of class
}