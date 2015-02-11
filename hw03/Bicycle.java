//
//
//
//

import java.util.Scanner; //

//
public class Bicycle {
    //
    public static void main(String [] args) {
        Scanner myScanner=new Scanner( System.in ); //
        System.out.println("input the number of counts"); //
        int countsOfTrip=myScanner.nextInt(); //
        System.out.println("input the number of seconds"); //
        int secsOfTrip=myScanner.nextInt(); //
        
        double wheelDiameter=27.0; //
        double PI=3.14159; //
        double feetPerMile=5280; //
        double inchesPerFoot=12; //
        double secondsPerMinute=60; //
        double minutesPerHour=60; //
        double minutesOfTrip=secsOfTrip/secondsPerMinute; //
        double hoursOfTrip=minutesOfTrip/minutesPerHour; //
        double distanceOfTrip0=(countsOfTrip*wheelDiameter*PI/inchesPerFoot/feetPerMile)*100; //
        double distanceOfTrip=((int) (distanceOfTrip0))/(100.0); //
        double avgMPH0=(distanceOfTrip/hoursOfTrip)*100; //
        double avgMPH=((int) (avgMPH0))/(100.0); //
        System.out.println("The distance of the trip was "+distanceOfTrip+" miles and took "+minutesOfTrip+" minutes"); //
        System.out.println("The average miles per hour was "+avgMPH+" "); //
        
        
        
        
        
    }
}