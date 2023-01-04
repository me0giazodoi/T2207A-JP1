package session3;

import assignment1.Fraction;

public class Session3Main {
    public static void main(String[] args){
        Car c = new Car("BMW","X8");
        System.out.println(c.getBrand());

        int x = 10;
        int [] arr = new int[5];
        for (int i=0;i< arr.length;i++){
            arr[i] = 1+3;
        }

        Car[] cars = new Car[3];
        for (int i=0;i< cars.length;i++){
            cars[0] = new Car("Honda","CRV");
            cars[1] = new Car("Honda","123");
            cars[2] = new Car("Honda","456");
            System.out.println(cars[i].getName());
            System.out.println(cars[i].getBrand());
        }
    }
}
