public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        if ((age < 0) || (age > 100)) {
            return 0;
        }
        return age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setAge(int number) {
        this.age = number;
    }

    public boolean isTeen() {

        int personAge = this.age;
        return (personAge > 12 && personAge < 20) ? true : false;
    }

    public String getFullName() {

        String first = getFirstName();
        String space = " ";
        String last = getLastName();
        String response = first + last;
        boolean firstEmpty = first.isEmpty();
        boolean lastEmpty = last.isEmpty();

        if( (!firstEmpty) && (!lastEmpty)){
            response = first +space+ last;
            return response;
        }

        return response;
    }

}
