package test;

public class Employee {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int yearOfStartWork;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int yearOfBirth, int yearOfStartWork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.yearOfStartWork = yearOfStartWork;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfStartWork() {
        return yearOfStartWork;
    }

    public void setYearOfStartWork(int yearOfStartWork) {
        this.yearOfStartWork = yearOfStartWork;
    }
}
