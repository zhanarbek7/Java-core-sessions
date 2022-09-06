package listsCompares.tapshyrma4;

import java.util.Comparator;

public class Country implements Comparable<Country>{
    private int id;
    private String name;
    private int population;
    private int GDP;

    public Country(int id, String name, int population, int GDP) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.GDP = GDP;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getGDP() {
        return GDP;
    }

    public static Comparator<Country> nameComparator = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Country> populationComparator = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.getPopulation() - o2.getPopulation();
        }
    };

    public static Comparator<Country> GDPComparator = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o2.getGDP() - o1.getGDP();
        }
    };


    @Override
    public int compareTo(Country o) {
        return this.id - o.id;
    }
}
