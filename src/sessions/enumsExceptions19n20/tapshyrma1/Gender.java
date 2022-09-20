package sessions.enumsExceptions19n20.tapshyrma1;

public enum Gender {
    MALE("I am strong!"), FEMALE("I am beautiful!");

    private String deviz;

    Gender(String deviz) {
        this.deviz = deviz;
    }

    public String getDeviz() {
        return deviz;
    }
}
