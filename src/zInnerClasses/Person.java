package zInnerClasses;

public class Person <T, G>{

    private T parameter1;
    private G parameter2;

    public Person(T parameter1, G parameter2) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
    }

    public T getParameter1() {
        return parameter1;
    }

    public void setParameter1(T parameter1) {
        this.parameter1 = parameter1;
    }

    public G getParameter2() {
        return parameter2;
    }

    public void setParameter2(G parameter2) {
        this.parameter2 = parameter2;
    }
}
