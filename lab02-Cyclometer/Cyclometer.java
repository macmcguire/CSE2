// Patrick McGuire 01/30/2015 CSE 02
//
public class Cyclometer {
    // main method required for every java program 
    public static void main(String [] args) {
        // our input data for the Cyclometer 
        double secsTrip1=480;  // the seconds the first trip took 
       	double secsTrip2=3220;  // the seconds the second trip took 
		int countsTrip1=1561;  // the number of rotations of the front wheel during the first trip
		int countsTrip2=9037; // the number of rotations of the the front wheel during the second trip
        double wheelDiameter=27.0;  // the diameter of the front bike wheel 
  	    double PI=3.14159; // the ratio of a circles circumference to it's diameter  
  	    int feetPerMile=5280;  // the number of feet in a mile 
  	    int inchesPerFoot=12;  // the number of inches in a foot 
  	    int secondsPerMinute=60;  // the number of seconds in a minute 
	    double distanceTrip1, distanceTrip2,totalDistance;  // defines variables that describe the 
	    // distance of each trip and the total distance //
	    
	    // now we print out a statement using the above variables to state how long each trip took and how many 
	    // counts of the front wheel occurred during each trip
	      
	    System.out.println("Trip 1 took "+
       	(secsTrip1/secondsPerMinute)+" minutes and had "+
       	countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+
       	(secsTrip2/secondsPerMinute)+" minutes and had "+
       	countsTrip2+" counts.");
       	distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	    distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Gives distance in miles for trip 1
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Gives distance in miles for trip 2
	    totalDistance=distanceTrip1+distanceTrip2; // Defines total distance as the sum of both trips
	    // Now we print out a statement describing the total distance in miles of each trip and the sum of both trips
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");

    }   // end of main method 
}   // end of class 
