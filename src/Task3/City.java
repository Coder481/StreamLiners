package Task3;

import java.util.List;

public class City extends TouristPlace {

    String state , cityName;
    List<TouristPlace> touristPlaces;

    public City(String name, String workingHour, int entryTicketPrice, String state, String cityName) {
        super(name, workingHour, entryTicketPrice);
        this.state = state;
        this.cityName = cityName;
    }
}

