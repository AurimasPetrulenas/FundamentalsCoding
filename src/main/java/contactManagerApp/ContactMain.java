package contactManagerApp;

public class ContactMain {

    public  static  void main(String[]args){

        Contact brother = new Contact();
        brother.setName("Karolis");
        brother.setEmail("karolis@gmail.com");
        brother.setPhoneNumber("123456");

        ContactServise contactServise = new ContactServise();
        contactServise.addContact(brother);
        contactServise.showContactList();

        Contact sister = new Contact("Diana", "diana@gmail.com", "6987455");
        contactServise.addContact(sister);
        contactServise.showContactList();

        Contact foundContact = contactServise.searchContact("Paulius");
        System.out.println(foundContact);

    }
}
