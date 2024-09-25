import java.util.Comparator;

public class Astronom implements Comparator<Planet> {
    @Override
    public int compare(Planet p1, Planet p2) {
        return Double.compare(p1.weight, p2.weight);
    }
}
