import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double initialTransaction){
        if(findCustomer(name) == null){
            Customer newCustomer = new Customer(name, initialTransaction);
            customers.add(newCustomer);
            System.out.println("Customer " + name + " added with initial transaction " + initialTransaction);
            return true;
        }
        else {
            System.out.println("Customer already exists");
            return false;
        }
    }

    private Customer findCustomer(String name){
        for(int i = 0 ; i < customers.size() ; i++){
            if(customers.get(i).getName().equals(name)) {
                return customers.get(i);
            }
        }
        return null;
    }

    public void addTransaction(String customer, double transaction){
        Customer searchedCustomer = findCustomer(customer);
        if(searchedCustomer == null){
            System.out.println("No customer with name " + customer + " exists." );
        }
        else {
            searchedCustomer.addTransaction(transaction);
        }
    }

}
