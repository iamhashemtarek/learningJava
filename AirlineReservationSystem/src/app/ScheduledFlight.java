package app;

public class ScheduledFlight extends  Flight {
    private int ID;
    private String date;

    public ScheduledFlight(String from, String to, String arrival, String departure, int capacity, int ID, String date) {
        super(from, to, arrival, departure, capacity);
        this.ID = ID;
        this.date = date;
    }

    @Override
    public String toString() {
        return "ScheduledFlight{" +
                "ID=" + ID +
                ", date='" + date + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }
}
