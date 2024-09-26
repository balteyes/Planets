public class Moon {
    String name;
    double weight;
    String color;

    public Moon(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Moon{" +
                "name='" + name + '\'' +
                ", mass=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
