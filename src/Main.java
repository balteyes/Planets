import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Planet> planetList = new ArrayList<>(8);
        planetList.add(new Planet("Jupiter", 18.90));
        planetList.add(new Planet("Saturn", 5.68));
        planetList.add(new Planet("Uranus", 8.68));
        planetList.add(new Planet("Neptune", 1.02));
        planetList.add(new Planet("Mercury", 1.8987));
        planetList.add(new Planet("Venus", 4.87));
        planetList.add(new Planet("Mars", 6.42));
        planetList.add(new Planet("Earth", 5.97));
        System.out.println(planetList);

        planetList.sort(new Astronom());
        System.out.println(planetList);



    }

}