package app;

public class Flight {
    private String from;
    private String to;
    private String arrival;
    private String departure;
    private int capacity;

    public Flight(String from, String to, String arrival, String departure, int capacity) {
        this.from = from;
        this.to = to;
        this.arrival = arrival;
        this.departure = departure;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", arrival='" + arrival + '\'' +
                ", departure='" + departure + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
