public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("Smith");
        person.setAge(10);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
    }
}

