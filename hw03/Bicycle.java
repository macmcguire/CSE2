//Patrick McGuire 
// Bicycle Java Program
// This program computes total distance of bike ride and avergae miles per hour of trip
//
//  first compile the program 
//      javac Bicycle.java
//  then run the program 
//      java Bicycle//
//


import java.util.Scanner; // imports the scanner utility

//  defines a class
public class Bicycle {
//  adds main method
    public static void main(String [] args) {
        Scanner myScanner=new Scanner( System.in ); // defines a new Scanner
        System.out.println("input the number of counts"); // prompts user to enter number of counts the wheel turned
        int countsOfTrip=myScanner.nextInt(); // defines countsOfTrip as the integer entered
        System.out.println("input the number of seconds"); // prompts user to enter number of seconds of trip
        int secsOfTrip=myScanner.nextInt(); // defines secsOfTrip as the integer entered
        
        double wheelDiameter=27.0; // describes the diameter of the wheel
        double PI=3.14159; // defines the length of PI
        double feetPerMile=5280; //  defines the amount of feet per the mile
        double inchesPerFoot=12; //  defines how many inches are in a foot
        double secondsPerMinute=60; // defines how many seconds are in a minute
        double minutesPerHour=60; //   defines how many minutes are in an hour
        double minutesOfTrip=secsOfTrip/secondsPerMinute; // uses previous variables to calculate how many minutes the trip took
        double distanceOfTrip0=(countsOfTrip*wheelDiameter*PI/inchesPerFoot/feetPerMile)*100; // uses previous variables to calculate the distance of the trip
        double distanceOfTrip=((int) (distanceOfTrip0))/(100.0); // casts previous variable as an int, divides by 100 and reassigns as a double
        double avgMPH0=(distanceOfTrip/hoursOfTrip)*100; // uses previous variables to calculate the average miles per hour
        double avgMPH=((int) (avgMPH0))/(100.0); // casts previous variable as an integer, divides by 100 and reassigns as double
        System.out.println("The distance of the trip was "+distanceOfTrip+" miles and took "+minutesOfTrip+" minutes"); // prints out the distance and time of trip
        System.out.println("The average miles per hour was "+avgMPH+" "); // prints out the average MPH during the trip
        
        
        
        
        
    }
}