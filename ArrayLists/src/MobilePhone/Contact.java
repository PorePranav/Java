package MobilePhone;

public class Contact {
    private String name;
    private String contactNumber;

    public Contact(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public static Contact newContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}
