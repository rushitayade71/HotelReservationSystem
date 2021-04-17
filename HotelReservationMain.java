import java.util.Scanner;

public class HotelReservationMain {
	
    private static Hotel_Reservation_System hotel1, hotel2, hotel3;

    public static void main(String[] args)  {
    	System.out.println("Welcome to Hotel Reservation System"); 
    	System.out.println("Regular or Reward");
    
    	Scanner t = new Scanner(System.in);
    	String type = t.nextLine();
    
    	Scanner d1 = new Scanner(System.in);
    	String day1 = d1.nextLine();
    
    	Scanner d2 = new Scanner(System.in);
    	String day2 = d2.nextLine();
    
    	Scanner d3 = new Scanner(System.in);
    	String day3 = d3.nextLine();
   
   
    hotel1 = new Hotel_Reservation_System("Lakewood", 3);
    hotel1.setRegularWeekDay(110);
    hotel1.setRegularWeekEnd(90);
    hotel1.setRewardWeekDay(80);
    hotel1.setRewardWeekEnd(80);

    hotel2 = new Hotel_Reservation_System("Bridgewood", 4);
    hotel2.setRegularWeekDay(160);
    hotel2.setRegularWeekEnd(60);
    hotel2.setRewardWeekDay(110);
    hotel2.setRewardWeekEnd(50);

    //setting values for red river   
    hotel3 = new Hotel_Reservation_System("Ridgewood", 5);
    hotel3.setRegularWeekDay(220);
    hotel3.setRegularWeekEnd(150);
    hotel3.setRewardWeekDay(100);
    hotel3.setRewardWeekEnd(40);

    int cost_hotel1 = 0, cost_hotel2 = 0, cost_hotel3 = 0;
    
    if (day1.equalsIgnoreCase("sun") || day1.equalsIgnoreCase("sat")) {
    if (type.equalsIgnoreCase("regular")) {
    cost_hotel1 += hotel1.getRegularWeekEnd();
    cost_hotel2 += hotel2.getRegularWeekEnd();
    cost_hotel3 += hotel3.getRegularWeekEnd();
    } else {
    cost_hotel1 += hotel1.getRewardWeekEnd();
    cost_hotel2 += hotel2.getRewardWeekEnd();
    cost_hotel3 += hotel3.getRewardWeekEnd();
    }
    } else {
    if (type.equalsIgnoreCase("regular")) {
    cost_hotel1 += hotel1.getRegularWeekDay();
    cost_hotel2 += hotel2.getRegularWeekDay();
    cost_hotel3 += hotel3.getRegularWeekDay();
    } else {
    cost_hotel1 += hotel1.getRewardWeekDay();
    cost_hotel2 += hotel2.getRewardWeekDay();
    cost_hotel3 += hotel3.getRewardWeekDay();
    }
    }
    
if (day2.equalsIgnoreCase("sun") || day2.equalsIgnoreCase("sat")) {
    if (type.equalsIgnoreCase("regular")) {
    cost_hotel1 += hotel1.getRegularWeekEnd();
    cost_hotel2 += hotel2.getRegularWeekEnd();
    cost_hotel3 += hotel3.getRegularWeekEnd();
    } else {
    cost_hotel1 += hotel1.getRewardWeekEnd();
    cost_hotel2 += hotel2.getRewardWeekEnd();
    cost_hotel3 += hotel3.getRewardWeekEnd();
    }
    } else {
    if (type.equalsIgnoreCase("regular")) {
    cost_hotel1 += hotel1.getRegularWeekDay();
    cost_hotel2 += hotel2.getRegularWeekDay();
    cost_hotel3 += hotel3.getRegularWeekDay();
    } else {
    cost_hotel1 += hotel1.getRewardWeekDay();
    cost_hotel2 += hotel2.getRewardWeekDay();
    cost_hotel3 += hotel3.getRewardWeekDay();
    }
    }
    
if (day3.equalsIgnoreCase("sun") || day3.equalsIgnoreCase("sat")) {
    if (type.equalsIgnoreCase("regular")) {
    cost_hotel1 += hotel1.getRegularWeekEnd();
    cost_hotel2 += hotel2.getRegularWeekEnd();
    cost_hotel3 += hotel3.getRegularWeekEnd();
    } else {
    cost_hotel1 += hotel1.getRewardWeekEnd();
    cost_hotel2 += hotel2.getRewardWeekEnd();
    cost_hotel3 += hotel3.getRewardWeekEnd();
    }
    } else {
    if (type.equalsIgnoreCase("regular")) {
    cost_hotel1 += hotel1.getRegularWeekDay();
    cost_hotel2 += hotel2.getRegularWeekDay();
    cost_hotel3 += hotel3.getRegularWeekDay();
    } else {
    cost_hotel1 += hotel1.getRewardWeekDay();
    cost_hotel2 += hotel2.getRewardWeekDay();
    cost_hotel3 += hotel3.getRewardWeekDay();
    }
    }
    
    System.out.println(cost_hotel1);
    System.out.println(cost_hotel2);
    System.out.println(cost_hotel3);

     if (cost_hotel1 < cost_hotel2 && cost_hotel1 < cost_hotel3) {
    System.out.println("Lakewood");
    } else if (cost_hotel2 < cost_hotel1 && cost_hotel2 < cost_hotel3) {
   System.out.println("Bridgewood");
    } else  {
    System.out.println("Ridgewood");
    }
    
    }	
}

 