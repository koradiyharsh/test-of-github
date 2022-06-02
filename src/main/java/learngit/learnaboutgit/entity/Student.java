package learngit.learnaboutgit.entity;

public class Student {

    private Long ID;
    private String firstName;
    private String lastName;
    private String address;

    public Student(Long ID, String firstName, String lastName, String address) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}