package app;

public class PersonalInformation {
    private String fname;
    private String mname;
    private String lname;
    private String bloodGroup;
    private String accNum;
    private String nationality;
    private int yearOfBirth;

    public PersonalInformation() {
    }

    public PersonalInformation(String fname, String mname, String lname, String bloodGroup, String accNum, String nationality, int yearOfBirth) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.bloodGroup = bloodGroup;
        this.accNum = accNum;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "app.PersonalInformation{" +
                "fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", accNum='" + accNum + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
