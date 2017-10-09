package Exam;

/**
 * Created by Maxim on 12-Jan-17.
 */
public class Email_11Demo {
    public static void main(String[] args) {
        Email_11 email = new Email_11();
        email.setName("Виктор");
        email.setStreet("Викторовская");
        email.setApart("5А");
        email.setNumApart(7);
        email.setCity("Викторград");
        email.setRegion("Викторовская область");
        email.setZip(123123);


        System.out.println("Имя " + email.getName() + ", улица " + email.getStreet() + ", дом " + email.getApart() + ", кв " + email.getNumApart() + ", г. " + email.getCity() + ", область " + email.getRegion() + ", " + email.getZip());

    }

}
