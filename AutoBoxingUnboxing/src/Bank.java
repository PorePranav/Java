import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }
    public boolean addBranch(String name){
        if(findBranch(name) == null){
            Branch branch = new Branch(name);
            branches.add(branch);
            return true;
        }
        else {
            System.out.println("Branch with that name already exists");
            return false;
        }
    }
    private Branch findBranch(String name){
        for (Branch branch : branches) {
            if (branch.getName().equals(name))
                return branch;
        }
        return null;
    }
    public boolean addCustomer(String branch, String name, double initialTransaction){
        Branch customerBranch = findBranch(branch);
        if(customerBranch == null) {
            System.out.println("No Branch with the name " + branch + " exists");
            return false;
        }
        else {
            customerBranch.addCustomer(name, initialTransaction);
            return true;
        }
    }
    public boolean addCustomerTransaction(String branch, String name, double amount){
        for(int i = 0 ; i < branches.size() ; i++){
            if(branches.get(i).getName().equals(branch)){
                for (int j = 0 ; j < branches.get(i).getCustomers().size(); i++){
                    Customer customer = branches.get(i).getCustomers().get(j);
                    if(customer.getName().equals(name)){
                        customer.addTransaction(amount);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean searchBranch(String branchName){
        for(int i = 0 ; i < branches.size() ; i++){
            if(branches.get(i).getName().equals(branchName)) {
                System.out.println("Branch " + branchName + " found in the list.");
                return true;
            }
            else {
                System.out.println("Branch " + branchName + " not found in the list.");
                return false;
            }
        }
        return false;
    }
    public void listCustomers(String branch, boolean transactions){
        Branch searchBranch = findBranch(branch);
        if(transactions) {
            for (int i = 0; i < searchBranch.getCustomers().size(); i++) {
                Customer customer = searchBranch.getCustomers().get(i);
                System.out.println("#" + (i + 1) + customer.getName());
                for(int j = 0 ; i < customer.getTransactions().size() ; i++){
                    System.out.println(customer.getTransactions().get(i));
                }
            }
        }
        else {
            for (int i = 0; i < searchBranch.getCustomers().size(); i++) {
                Customer customer = searchBranch.getCustomers().get(i);
                System.out.println("#" + (i + 1) + customer.getName());
            }
        }
    }
}
