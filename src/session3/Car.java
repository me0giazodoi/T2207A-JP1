package session3;

public class Car {
    private String brand;
    private String name;
    private double price;

    public Car() {
    }

    public Car(String brand, String name, Double price){
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand(){//getter
        return brand;
    }

    public void setBrand(String brand){//setter
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
