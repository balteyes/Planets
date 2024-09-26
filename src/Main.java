import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Planet> main(String[] args) {

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

        Planet earth = planetList.get(1);
        System.out.println(earth.getMoons());
        earth.addMoon(new Moon("Луна", 7.35e22, "серый"));
        System.out.println(earth.getMoons());

        Planet mars = planetList.get(2);
        mars.addMoon(new Moon("Фобос", 123, "white"));
        mars.getMoons().add(new Moon("Деймос", 222, ""));


        return planetList;
    }

}

