public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String number) {
        this.name = name;
        this.phone = number;
    }

    @Override
    public String toString(){
        return name + "--->" + phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}

