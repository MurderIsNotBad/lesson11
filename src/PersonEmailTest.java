import java.util.List;
import java.util.stream.Collectors;

public class PersonEmailTest {
    public static void main(String[] args) {

        List<Person> people = Person.getPeople();


        System.out.println("without streams");
        for(Person person: people){
            for(String email: person.getEmails()){
                boolean isSent = sendEmail(email);
                System.out.println("Email send status: " + isSent);
            }
        }

        System.out.println("------------");
        System.out.println("with streams");

            people.stream()
                    .flatMap(person -> person.getEmails().stream())
                    .map(PersonEmailTest::sendEmail)
                    .forEach(isSent -> System.out.println("Email send status: " + isSent));

            String emails = people.stream()
                    .flatMap(person -> person.getEmails().stream())
                    .collect(Collectors.joining(""));

            sendEmail(emails);
    }



    public static boolean sendEmail(String email){
        System.out.println("send email to " + email);
        return true;
    }

}
