import java.util.Comparator;

public class SortByUnit  implements Comparator<Vegetable> {
    public int compare(Vegetable v1, Vegetable v2) {
        if (v1.getUnit().equals(v2.getUnit()))
            return Double.compare(v1.getPrice(), v2.getPrice());
        else
            return v1.getUnit().compareTo(v2.getUnit());

    }
}
