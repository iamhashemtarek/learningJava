package app;

public class Passenger extends Person {
    private int ID;

    public Passenger(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        if (ID != 0) {
            return "Passenger{" +
                    "ID=" + ID +
                    '}';
        }
        return "";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
