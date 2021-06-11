public class Main {
    public static void main(String[] args) {
        Bank SBI = new Bank("SBI");
        SBI.addBranch("Sahakarnagar");
        SBI.addCustomer("Sahakarnagar", "Pranav Pore", 10);
        SBI.searchBranch("Sahakarnagar");
        SBI.addCustomerTransaction("Sahakarnagar", "Pranav", 20);
        SBI.listCustomers("Sahakarnagar", true);
    }
}
