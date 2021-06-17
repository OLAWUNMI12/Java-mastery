import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String  branch){
        boolean success = false;
        if(findBranch(branch) == null){
            this.branches.add(new Branch(branch));
            success = true;
        }
        return success;
    }

    private Branch findBranch(String branchName){
        Branch branch = null;
        for(int i = 0 ;i < this.branches.size(); i++){
            if(branchName.equals(this.branches.get(i).getName())){
                branch = this.branches.get(i);
                break;
            }
        }
        return branch;
    }

    public boolean addCustomer(String  branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        boolean success = false;
        if(branch != null){
           success = branch.newCustomer(customerName, transaction);
        }
        return success;
    }

    public boolean addCustomerTransaction(String  branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        boolean success = false;
        if(branch != null){
                success = branch.addCustomerTransaction(customerName, transaction);
        }
        return success;
    }

    public boolean listCustomers(String branchName, boolean printTransaction){
        Branch branch = findBranch(branchName);
        boolean branchExist = false;
        if (branch != null){
            branchExist = true;
            System.out.println("Customer details for branch " + branch.getName());

            if(branch.getCustomers().size() >= 0){
                for(int i = 0 ;i < branch.getCustomers().size(); i++){
                    Customer customer = branch.getCustomers().get(i);
                    System.out.println("Customer : " + customer.getName() + "[" + (i+1) + "]");
                    if(printTransaction){
                        if(customer.getTransactions().size() >= 0){
                            System.out.println("Transactions");
                            for(int j = 0 ;j < customer.getTransactions().size(); j++){
                                System.out.println("[" + (j+1) + "]  Amount " +  customer.getTransactions().get(j));
                            }
                        }
                    }
                }
            }
        }
        return branchExist;
    }

}
