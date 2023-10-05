
public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public Customer(String firstName, String userName, String lastName) {
        this.firstName = firstName;
        this.userName = userName;
        this.lastName = lastName;
        id = 1;


    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getlastName() {
        return this.lastName;
    }

    public String getuserName() {
        return this.userName;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return this.userName + " : " +  this.firstName + " : " + this.lastName + " : " + this.id;

    }

}



