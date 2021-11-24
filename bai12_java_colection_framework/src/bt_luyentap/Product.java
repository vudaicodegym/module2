package bt_luyentap;

public class Product {
    private int id;
    private String name;
    private String color;
    private int volume;
    public static int idNumber = 1;

    public Product() {
    }

    public Product( String name, String color, int volume) {
        this.id = idNumber++;
        this.name = name;
        this.color = color;
        this.volume = volume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return volume;
    }

    public void setSize(int size) {
        this.volume = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id+
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", volume=" + volume +
//                ", idNumber=" + idNumber +
                '}';
    }
}
