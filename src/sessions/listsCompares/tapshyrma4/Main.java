package sessions.listsCompares.tapshyrma4;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Country> list1 = new LinkedList<>();
        list1.add(new Country(1, "AKyrgyzstan",6, 150));
        list1.add(new Country(99, "BRussia",148, 900));
        list1.add(new Country(3, "WKazakhstan",19, 20));
        list1.add(new Country(344, "BUzbekistan",30, 30));
        list1.add(new Country(5, "CTajikistan",40, 70));
        LinkedList<Country> list2 = new LinkedList<>(list1);

//        sortId(list1);
//        System.out.println();
//        sortByName(list1);
        sortByPopulationAndGDP(list2);
    }

    public static void sortId(LinkedList<Country> list1){

        for (Country i: list1) {
            System.out.println(i.getId()+" "+i.getName());
        }

        System.out.println();

        Collections.sort(list1);

        for (Country i: list1) {
            System.out.println(i.getId()+" "+i.getName());
        }
    }

    public static void sortByName(LinkedList<Country> list1){

        for (Country i: list1) {
            System.out.println(i.getId()+" "+i.getName());
        }

        System.out.println();

        list1.sort(new NameComparator());

        for (Country i: list1) {
            System.out.println(i.getId()+" "+i.getName());
        }
    }

    public static void sortByPopulationAndGDP(LinkedList<Country> list2){

        for (Country i: list2) {
            System.out.println(i.getName()+" "+i.getPopulation()+" "+i.getGDP());
        }

        System.out.println();

        list2.sort(Country.populationComparator);
        list2.sort(Country.GDPComparator);

        for (Country i: list2) {
            System.out.println(i.getName()+" "+i.getPopulation()+" "+i.getGDP());
        }
    }
}
