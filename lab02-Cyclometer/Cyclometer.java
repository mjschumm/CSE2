//Mark Schumm
//CSE2
//9/3/15

//This program uses the data given by a Cyclometer: time elapsed in seconds
//and number of rotations in the front wheel.
//The java program will calculate the time in minutes of each trip
//the number of counts for each trip and the separate and total distance of
//the two trips.
public class Cyclometer{
    public static void main(String[] args) {
        int secsTrip1=480; //Time in seconds of Trip 1
        int secsTrip2=3220; //Time in seconds of Trip 2
        int countsTrip1=1561; //Rotations in the front wheel for Trip 1
        int countsTrip2=9037; //Rotations in the front wheel for Trip 2
        
        double wheelDiameter=27, //The diameter of the front wheel
         PI=3.14159, //The constant PI
         feetPerMile=5280, //The conversion from feet to miles
         inchesPerFoot=12, //The conversion from inches to feet
         secondsPerMinute=60;//The conversion from seconds to minute
        double distanceTrip1, distanceTrip2, totalDistance;//variables for distance
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) +
        " minutes and had " + countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) +
        " minutes and had " + countsTrip2 + " counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;//distance[inches] 
        //the circumference of the front wheel is pi*diameter and multiplying
        //it by the number of rotations of the front wheel, will give distance traveled
        distanceTrip1/=inchesPerFoot*feetPerMile; //Converts inches to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance
        //of trip 2 in miles
        totalDistance=distanceTrip1+distanceTrip2;
        
        //print out output data
        System.out.println("Trip 1 was " + distanceTrip1 + " miles");
        System.out.println("Trip 2 was " + distanceTrip2 + " miles");
        System.out.println("The total distance was " +totalDistance+ " miles");
        
    } //end of main method
} //end of class