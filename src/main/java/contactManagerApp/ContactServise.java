package contactManagerApp;

public class ContactServise {

    public static Contact[] myContacts = new Contact[5];
    private int contactCount;
    public void showContactList(){
       for (Contact myContact : myContacts) {
if (myContact != null){

}
           System.out.println(myContact);

       }
   }

    public void addContact(Contact contactToAdd){
        //ideti tikrinima ar ne per daug kontaktu.
        myContacts[contactCount] = contactToAdd;
        contactCount++;
        System.out.println("Contact was added");
    }

    public Contact searchContact(String fullName) {
        for (int i = 0; i < contactCount; i++){
            if (myContacts[i].getName().equalsIgnoreCase(fullName)){

            }

        }
        System.out.println("No contact was found!");
        return null;
        }
    }

