package tcs;

import java.util.Scanner;

public class TrainTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the array of stations
        String[] stations = {"chennai beach", "chennai park", "chennai fort", "chennai egmore", "chetpet", "nungambakkam", "kodambakkam", "mambalam", "saidapet", "guindy", "st.thomas mount", "pazhavanthangal", "meenambakkam", "trisulam", "pallavaram", "chromepet", "tambaram sanatorium", "tambaram"};

        // Prompt the user to enter the starting and ending stations
        System.out.print("Enter the starting station: ");
        String startStation = scanner.nextLine().toLowerCase();
        System.out.print("Enter the ending station: ");
        String endStation = scanner.nextLine().toLowerCase();

        // Calculate the distance between the two stations
        int startIndex = -1;
        int endIndex = -1;
        for (int i = 0; i < stations.length; i++) {
            if (stations[i].equalsIgnoreCase(startStation)) {
                startIndex = i;
            }
            if (stations[i].equalsIgnoreCase(endStation)) {
                endIndex = i;
            }
        }
        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid station names");
            return;
        }
        int distance = Math.abs(endIndex - startIndex);

        // Calculate the total cost
        int cost = distance * 5;
        
        System.out.println("------------------------");

        // Print out the total cost
        System.out.println("Total cost: Rs. " + cost);
        
        System.out.println("-------------------------");
        
        System.out.println("Have A Safe Journey----->  :)");
        
    }
}
