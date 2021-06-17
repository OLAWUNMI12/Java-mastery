import java.util.ArrayList;


public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName){
        Customer customer = null;
        for(int i = 0 ;i < this.customers.size(); i++){
            if(customerName.equals(this.customers.get(i).getName())){
                customer = this.customers.get(i);
                break;
            }
        }
        return customer;
    }

    public boolean newCustomer(String customerName, double transaction){
        boolean success = false;
        if(findCustomer(customerName) == null){
            Customer customer = new Customer(customerName, transaction);
            getCustomers().add(customer);
            success = true;
        }
        return success;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        boolean success = false;
        Customer customer = findCustomer(customerName);
        if(customer != null){
            customer.addTransaction(transaction);
            success = true;
        }
        return success;
    }

}
