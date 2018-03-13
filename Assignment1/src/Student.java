import java.time.LocalDate;
import java.time.Period;

public class Student {

    private String firstName = "";
    private String lastName = "";
    private String streetAdress = "";
    private String city = "";
    private String postalCode = "";
    private int studentNumber = -1;
    private LocalDate dateEnrolled;
    private LocalDate birthday;
    private boolean Standing;

    public Student(String firstName, String lastName, String streetAdress, String city, String postalCode, LocalDate birthday, LocalDate dateEnrolled, int studentNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAdress = streetAdress;
        this.city = city;
        this.postalCode = postalCode;
        this.birthday = birthday;
        this.dateEnrolled = dateEnrolled;
        setStudentNum(studentNumber);
        this.Standing = true;
    }

    public int getYearBorn() { return birthday.getYear(); }

    public int getAge(){
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setDateOfBirth(LocalDate newBirthdate){
        if(Period.between(newBirthdate, LocalDate.now()).getYears() < 100)
            this.birthday = newBirthdate;
        else
            throw new IllegalArgumentException("You have entered a birthday rendering the student an ago of 100 or more");
    }

    public void setDateEnrolled(LocalDate newDateEnrolled){
        if(newDateEnrolled.isBefore(LocalDate.now()))
            dateEnrolled = newDateEnrolled;
        else
            throw new IllegalArgumentException("You can't enroll in the future!");
    }

    public void setFirstName(String firstName) {
        if(!firstName.equals(""))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("This field cannot be empty.");
    }

    public void setLastName(String lastName) {
        if(!lastName.equals(""))
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("This field cannot be empty.");
    }

    public void setStreetAddress(String address) {
        if(!address.equals(""))
            this.streetAdress = address;
        else
            throw new IllegalArgumentException("This field cannot be empty.");
    }

    public void setCity(String city){
        if(!city.equals(""))
            this.city = city;
        else
            throw new IllegalArgumentException("This field cannot be empty.");
    }

    public void setStudentNum(int studentNumber){
        if(studentNumber == -1)
            throw new IllegalArgumentException("This field cannot be empty.");
        else
            this.studentNumber = studentNumber;

    }

    public void setPostalCode(String postalCode){
        if(!postalCode.equals(""))
            this.postalCode = postalCode;
        else
            throw new IllegalArgumentException("This field cannot be empty.");
    }

    public int getYearEnrolled(){
        return this.dateEnrolled.getYear();
    }

    public boolean isInGoodStanding(){
        return this.Standing;
    }

    public void suspendStudent(){
        this.Standing = false;
    }

    public void reinstateStudent(){
        this.Standing = true;
    }

    public String getStreetAddress(){
        return this.streetAdress;
    }

    public int getStudentNum(){
        return this.studentNumber;
    }

    public String getCity(){
        return this.city;
    }

    public String getPostalCode(){
        return this.postalCode;
    }

    public LocalDate getDateOfBirth() {
        return birthday;
    }

    public LocalDate getDateEnrolled() {
        return dateEnrolled;
    }

    public String toString(){
        return this.firstName + " " + this.lastName + ", student number: " + this.studentNumber;
    }

}