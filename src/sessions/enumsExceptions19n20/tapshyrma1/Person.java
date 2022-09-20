package sessions.enumsExceptions19n20.tapshyrma1;

import sessions.anonymFunctional27.Genderr;

public class Person {
    private String name;
    private int age;
    private Genderr gender;
    private Payment payment;

    private String getFutureName;
    private Genderr getfutureGender;

    public Person(String name, int age, Genderr gender, Payment payment, String getFutureName, Genderr getfutureGender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.payment = payment;
        this.getFutureName = getFutureName;
        this.getfutureGender = getfutureGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genderr getGender() {
        return gender;
    }

    public void setGender(Genderr gender) {
        this.gender = gender;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getGetFutureName() {
        return getFutureName;
    }

    public void setGetFutureName(String getFutureName) {
        this.getFutureName = getFutureName;
    }

    public Genderr getGetfutureGender() {
        return getfutureGender;
    }

    public void setGetfutureGender(Genderr getfutureGender) {
        this.getfutureGender = getfutureGender;
    }
}


