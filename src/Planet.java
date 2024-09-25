import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Planet {
    private String name;
    private double weight;
    private List<Moon> moons;

    public Planet(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.moons = new ArrayList<>();

    }

    public double getWeight() {
        return weight;
    }
    public String getName(){return name;}
    public void addMoon(Moon moon) {
        moons.add(moon);
    }

    public List<Moon> getMoons() {
        return moons;
    }

    public int getNumberOfMoons() {
        return moons.size();
    }

    public double getTotalWeightOfMoons(){
        return moons.stream().mapToDouble(Moon::getWeight).sum();
    }

    public Moon getHeaviestMoon(){
        return moons.stream().max(Comparator.comparingDouble(Moon::getWeight)).orElse(null);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", moons="  +moons.size() +
                '}';
    }


}



