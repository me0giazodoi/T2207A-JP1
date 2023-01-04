package session3;

public class Car {
    private String brand;
    private String name;

    public Car() {
    }

    public Car(String brand, String name){
        this.brand = brand;
        this.name = name;
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
}
