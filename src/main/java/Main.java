import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        /*Optional<String> hello = Optional.ofNullable("hello");

        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        String orElse = hello
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    // ... extra computation to retrieve the value
                    return "world";
                });
        System.out.println(orElse);*/

        Person person = new Person("James", null);
        /*System.out.println(person
                .getEmail()
                .map(String::toLowerCase)
                .orElse(person.getName() + ", email not provided."));*/

        if(person.getEmail().isPresent()) {
            String email = person.getEmail().get();
            System.out.println(email.toLowerCase());
        } else {
            System.out.println(person.getName() + ", email not provided.");
        }
    }
}

class Person {
    private final String name;
    private final String email;

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public Optional<String> getEmail() { return Optional.ofNullable(email); }
}
