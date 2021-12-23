package app;

public class main {
    public static void main(String[] args) {
        Passenger hashem = new Passenger("hashen", "egypt" );
        Passenger ali = new Passenger("ali", "egypt" );
        Passenger omar = new Passenger("omar", "egypt" );
        Passenger ahmed = new Passenger("ahmed", "egypt" );

        AirPort[] airports = new AirPort[4];
        airports[0] = new AirPort("cairoAirport", "x", "y", "7pm", "8pm", 100, 1, "December 23, 2021", hashem);
        airports[1] = new AirPort("cairoAirport", "x", "z", "1pm", "3pm", 100, 2, "December 24, 2021", hashem);
        airports[2] = new AirPort("alexAirport", "y", "x", "9am", "11am", 130, 3, "December 25, 2021", hashem);
        airports[3] = new AirPort("alexAirport", "y", "z", "3pm", "6pm", 130, 4, "December 26, 2021", hashem);

       // AirPort.schedule(airports, "cairoAirport");
        AirPort.addReservation(airports, "cairoAirport", hashem);

    }
}
