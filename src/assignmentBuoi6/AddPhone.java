package assignmentBuoi6;

import session3.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddPhone {
    public static void main(String[] agrs){
        ArrayList<PhoneNumber> pn = new ArrayList<>();




        Collections.sort(pn, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getPhone() - o2.getPhone()>0? 0:-1;
            }
        });
    }
}
