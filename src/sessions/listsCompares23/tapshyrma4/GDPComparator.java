package sessions.listsCompares23.tapshyrma4;

import java.util.Comparator;

public class GDPComparator implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
        return o2.getGDP()-o1.getGDP();
    }
}
