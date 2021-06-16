import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        int index = findContact(contact);
        boolean containsContact = !(index >= 0);
        if(!(index >= 0)){
            this.myContacts.add(contact);
        }
        return containsContact;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        boolean updated = false;
        int index = findContact(oldContact);
        if(index >= 0){
            this.myContacts.set(index, newContact);
            updated = true;
        }
        return updated;
    }

    public boolean removeContact(Contact contact){
        boolean removed = false;
        int index = findContact(contact);
        if(index >= 0){
            this.myContacts.remove(index);
            removed = true;
        }
        return removed;
    }

    private int findContact(Contact contact){
        int index = -1;
        for(int i = 0 ;i < this.myContacts.size(); i++){
            if(contact.getName().equals(this.myContacts.get(i).getName())){
                index = i;
                break;
            }
        }
        return index;
    }

    private int findContact(String contact){
        int index = -1;
        for(int i = 0 ;i < this.myContacts.size(); i++){
            if(contact.equals(this.myContacts.get(i).getName())){
                index = i;
                break;
            }
        }
        return index;
    }

    public Contact queryContact(String name){
        Contact contact = null;
        int index = findContact(name);
        if(index >= 0){
            contact = this.myContacts.get(index);
        }
        return contact;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0 ;i < this.myContacts.size(); i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
