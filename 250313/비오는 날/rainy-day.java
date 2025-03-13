import java.util.Scanner;

class Wet_Rain {
    String date, day, weather;

    public Wet_Rain(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public void printInfo() {
        System.out.println(date + " " + day + " " + weather);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        Wet_Rain closestRainDay = null;

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
        
            if (weather.equals("Rain")) {
                if (closestRainDay == null || date.compareTo(closestRainDay.date) < 0) {
                    closestRainDay = new Wet_Rain(date, day, weather);
                }
            }
        }
        if (closestRainDay != null) {
            closestRainDay.printInfo();
        }
        sc.close();
    }
}