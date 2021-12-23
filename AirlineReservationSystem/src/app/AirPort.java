package app;
import java.util.Scanner;

public class AirPort {
    private String name;
    private ScheduledFlight scheduledFlights; //Composition
    private Passenger passengers;   //Aggregation


    public AirPort() {
    }

    public AirPort(String name, String from, String to, String arrival, String departure, int capacity, int ID, String date, Passenger passengers) {
        this.name = name;
        this.scheduledFlights = new ScheduledFlight(from, to, arrival, departure, capacity, ID, date);
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "AirPort{" +
                "name='" + name + '\'' +
                ", scheduledFlights=" + scheduledFlights +
                ", passengers=" + passengers +
                '}';
    }

    public static void schedule(AirPort[] airPorts, String airportName) {
        for (int i = 0 ; i<airPorts.length; i++) {
            if (airportName == airPorts[i].name) {
                System.out.println(airPorts[i]);
            }
        }
    }
    public static void printTicket(AirPort[] airPorts ,Passenger p) {
        for (int i = 0; i<airPorts.length; i++) {
            if (p.getID() == airPorts[i].scheduledFlights.getID()){
                System.out.println(airPorts[i]);
            }
        }
    }

    public static void addReservation(AirPort[] airPorts, String airportName, Passenger p) {
        Scanner input = new Scanner(System.in);

        schedule(airPorts, airportName);
        System.out.println("select the id of the flight you want to reserve: ");
        int id = input.nextInt();
        p.setID(id);
        System.out.println("your ticket details: ");
        printTicket(airPorts, p);

    }
}
