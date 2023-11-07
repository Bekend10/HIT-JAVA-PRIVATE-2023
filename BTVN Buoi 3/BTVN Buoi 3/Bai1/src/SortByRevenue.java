import java.util.Comparator;

public class SortByRevenue implements Comparator<Vegetable> {
    public int compare(Vegetable v1, Vegetable v2) {
        if (v1.getTotalRevenue() > v2.getTotalRevenue())    return 1;
        else    return -1;
    }
}
