package AutowireByNameExample;

public class Specification {
    private String brand;
    private String model;

    public String getMake() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
