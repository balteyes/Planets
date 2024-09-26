import java.util.ArrayList;
import java.util.List;

public class Planet {
    String name;
    private double weight;
    private List<Moon> moons = new ArrayList<>();

    public Planet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';


    }
        public double getWeight() {
            return weight;

    }
    public void addMoon(Moon m){ this.moons.add(m);

    }
    public List<Moon> getMoons(){return moons;}

    public double getTotalMonsMass(){
        double s = 0;
        for (Moon m: moons)
            s+= m.weight;
        return s;
    }
      }







