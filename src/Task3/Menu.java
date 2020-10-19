package Task3;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    HashMap<String , TouristPlace> map = new HashMap<>();

    public void show() throws Exception {
        readMap();
        while (true) {
            int choice = showMenuAndGetChoice();

            switch (choice) {
                case 1:
                    addNewPlace();
                    break;
                case 2:
                    findAPlace();
                    break;
                case 3:
                    rateAPlace();
                    break;
                case 4:
                    removeAPlace();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if (wantToExit()){
                showPlaces();
                writeMap();
                break;
            }
        }

    }


        private void removeAPlace () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter place name to remove:");
            String placeName = sc.nextLine();
            if (map.containsKey(placeName)) {
                map.remove(placeName);
                System.out.println("Place Removed!!");
                System.out.println(map);
            } else System.out.println("Place Not Found!!");

        }
        private void writeMap () throws Exception {
            String path = "C:\\Users\\admin\\IdeaProjects\\HelloWorld\\src\\Task3\\task3.txt";
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            fileOutputStream.close();

        }
    private void readMap() {
        try {
            String path = "C:\\Users\\admin\\IdeaProjects\\HelloWorld\\src\\Task3\\task3.txt";
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            HashMap<String, TouristPlace> hashMap = (HashMap<String, TouristPlace>) objectInputStream.readObject();
            System.out.println(hashMap.values().toString());
        } catch (Exception e) {
            //If file is not found
            map = new HashMap<>();
        }
    }
            private void rateAPlace () {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter place name:");
                String input = sc.nextLine();
                TouristPlace place = map.get(input);
                if (map.containsKey(input)) {
                    System.out.println("Please Rate (1-5) :");
                    int rating = sc.nextInt();
                    if (rating >= 1 && rating <= 5) {
                        place.rate(rating);
                        System.out.println("Place Rated!!\n" + map);
                    }
                } else {
                    System.out.println("Place Not Found!!");
                }
            }

            private void findAPlace () {
                TouristPlace place = new TouristPlace();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter place to be found: ");
                String placeName = scanner.next();
                if(map.containsKey(placeName)) {
                    System.out.println("Place found!");
                }
                else{
                    System.out.println("place not found!");
                }
            }

            private void addNewPlace () {
                TouristPlace place = TouristPlace.newFromUserinput();
                map.put(place.name, place);
                System.out.println("Place Added!");
                System.out.println(map);

            }

            public int showMenuAndGetChoice () {
                System.out.println("\n------Menu----------\n");
                System.out.println("1.Add new place");
                System.out.println("2.Find a place");
                System.out.println("3.Rate a place");
                System.out.println("4.Remove a place");
                System.out.println("\nEnter your choice:");
                return new Scanner(System.in).nextInt();
            }
            private boolean wantToExit () {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Do you want to continue(Y/N)");
                String input = scanner.next().toUpperCase();
                return input.equals("N");
            }
            private void showPlaces () {
                System.out.println((">>Places : " + map.keySet().toString()));
            }
        }
