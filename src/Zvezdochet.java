import java.util.Comparator;

public class Zvezdochet implements Comparator<Planet> {

    @Override
    public int compare(Planet p1, Planet p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
