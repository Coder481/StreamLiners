package Task3;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class TouristPlace implements Serializable {
    String name , city , category;
    String workingHour;
    int entryTicketPrice;
    float starRating;
    List<String> famousFor;
    int noOfRatings;


    public TouristPlace(String name, String workingHour, int entryTicketPrice) {
        this.name = name;
        this.workingHour = workingHour;
        this.entryTicketPrice = entryTicketPrice;
        noOfRatings = 0;
        starRating = 0;
        this.famousFor = new ArrayList<>();
        System.out.println("Name:"+name+"\nWorking Hour:"+workingHour+"\nEntry Ticket Price:"+entryTicketPrice);
    }

    public TouristPlace() {

    }

    public static TouristPlace newFromUserinput() {  // Taking input new place as object
        Scanner sc = new Scanner(System.in);
        TouristPlace place = new TouristPlace();
        System.out.println("Enter place:");
        place.name = sc.nextLine();
        return place;
    }
    // Calculating total rating
    public float rate(float rating){
        starRating *= noOfRatings;
        starRating += rating;
        starRating = starRating/noOfRatings++;
        return starRating;
    }
    // Returning number of ratings
    public  int noOfRate(){
        return noOfRatings;
    }
    // Checking is place open or not
    String isPlaceOpen(String workingHour) {
        //Split both the times
        String[] times = workingHour.split(" to ");

        if (times[0].length() == 6)
            times[0] = '0' + times[0];
        if (times[1].length() == 6)
            times[1] = '0' + times[1];

        //Parse times (24 Hour Format)
        LocalTime startTime = LocalTime.parse(times[0], DateTimeFormatter.ofPattern("hh:mma")), endTime = LocalTime.parse(times[1], DateTimeFormatter.ofPattern("hh:mma")), currTime = LocalTime.now();

        //startTime.compare(currTime) : -1, 0
        //endTime.compareTo(currTime) : 1, 0
        if (startTime.compareTo(currTime) <= 0 && endTime.compareTo(currTime) >= 0)
            return "Open";
        else return "Closed";
    }
    public String famousFor(String s) {
        return s;
    }
}
