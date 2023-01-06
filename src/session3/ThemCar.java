package session3;

import assignmentBuoi5.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ThemCar {
    public static void main(String[] agrs){
        ArrayList<Car> xe = new ArrayList<>();
        xe.add(new Car("abc","ô tô",12.5));
        xe.add(new Car("xyz","xe máy",24.5));
        xe.add(new Car("omn","xe đạp",96.5));
        Collections.sort(xe, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice()>0? 0:-1;
            }
        });
        System.out.println("Sắp xếp theo thứ tự giá tăng dần");
        for (int i=0;i< xe.size();i++){
            System.out.println("Tên xe: "+xe.get(i).getName()+" Hãng xe: "+xe.get(i).getBrand()+" Giá xe: "+xe.get(i).getPrice());
        }
    }
}
