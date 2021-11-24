package ontap;

public class Human<E> {
    private int size;
    private String name;

    public Human() {
    }

    public Human(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}

