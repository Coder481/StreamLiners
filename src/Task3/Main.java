package Task3;

public class Main {
    public static void main(String[] args) throws Exception{
        TouristPlace hawaMahal = new TouristPlace("Hawa Mahal","9AM to 5PM",100);


        System.out.println(hawaMahal.famousFor("HawaMahal is a historical palace"));
        System.out.println(hawaMahal.famousFor("This is famous for it's beehive like structure"));
        hawaMahal.rate(0.0f);
        hawaMahal.rate(2.5f);
        hawaMahal.rate(3.5f);
        hawaMahal.rate(4.0f);
        hawaMahal.rate(4.5f);
        hawaMahal.rate(3.0f);
        System.out.println("Rating of HawaMahal: "+hawaMahal.starRating+"\n Number Of Rating:"+hawaMahal.noOfRate());
        System.out.println(hawaMahal.isPlaceOpen("10:00AM to 6:55PM"));
        Menu menu = new Menu();
        menu.show();

    }


}
