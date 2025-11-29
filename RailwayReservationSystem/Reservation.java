package RailwayReservationSystem;

import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Railway Reservation System =====");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Gender (M/F): ");
        String gender = sc.nextLine();

        System.out.print("From Station: ");
        String from = sc.nextLine();

        System.out.print("To Station: ");
        String to = sc.nextLine();

        System.out.print("Enter Journey Date (DD-MM-YYYY): ");
        String date = sc.nextLine();

        System.out.println("\n===== Reservation Submitted Successfully =====");
        System.out.println("Passenger Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Journey Date: " + date);

        sc.close();
    }
}
