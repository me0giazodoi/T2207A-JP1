package assignmentBuoi11;

import java.util.ArrayList;

public class PhoneNumber {
    public String name;
    public ArrayList<String> phones;

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }
}