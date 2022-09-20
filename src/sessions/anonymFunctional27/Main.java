package sessions.anonymFunctional27;

import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {
        Personn male = new Personn("Alex",28, Genderr.MALE, "Maks", Genderr.MALE);
        Personn female = new Personn("Sarah", 24, Genderr.FEMALE,"Ariana", Genderr.FEMALE);

        CreateBaby<Personn, Babby> createBaby = (m, f)->
        {
            int randomNumber = random.nextInt(1,3);

            if(randomNumber==1){
                return new Babby(m.getName(), 0, m.getFutureGender());
            }
            else{
                return new Babby(f.getName(), 0, f.getFutureGender());
            }
        };

        Babby baby = createBaby.createBaby(male, female);
        System.out.println(baby.getName());
        System.out.println(baby.getAge());
        System.out.println(baby.getGender());

    }
}

@FunctionalInterface
interface CreateBaby<Personn, Babby>{

    Babby createBaby(Personn parameter1, Personn parameter2);

}
