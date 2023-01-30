package assignmentBuoi11;

import java.util.ArrayList;

public class PhoneNumber {
    public String name;
    public ArrayList<String> phones = new ArrayList<>();

    public PhoneNumber(String name) {
        this.name = name;
    }

    public PhoneNumber(ArrayList<String> phones) {
        this.phones = phones;
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