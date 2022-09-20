package sessions.inheritance14.tapshyrma2;

public class Adult extends Person{

    private int numberOfChildren;
    private boolean marriage;
    private int salary;

    public Adult(int numberOfChildren, boolean marriage, int salary, String name, int age, String gender) {
        super(name, age, gender);
        this.numberOfChildren = numberOfChildren;
        this.marriage = marriage;
        this.salary = salary;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public boolean isMarriage() {
        return marriage;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "numberOfChildren=" + numberOfChildren +
                ", marriage=" + marriage +
                ", salary=" + salary +
                super.toString();
    }
}
