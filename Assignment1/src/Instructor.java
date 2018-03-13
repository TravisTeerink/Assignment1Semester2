import java.time.LocalDate;
import java.util.ArrayList;

public class Instructor {

    private String firstName;
    private String lastName;
    private LocalDate dateHired;
    private LocalDate birthday;
    private String address;
    private String city;
    private String postalCode;
    private int employeeNum;
    private ArrayList<String> courseCodes = new ArrayList<String>();

    public Instructor(String firstname, String lastname, String Address, String City, String postalcode, LocalDate datehired, LocalDate Birthday, int employeenum){
        setFirstName(firstname);
        setLastName(lastname);
        setStreetAddress(Address);
        setCity(City);
        setPostalCode(postalcode);
        setHireDate(datehired);
        setBirthday(Birthday);
        setEmployeeNum(employeenum);
    }

    public void setHireDate(LocalDate newDateHired){
        if(newDateHired.isAfter(LocalDate.now().plusMonths(1)))
            throw new IllegalArgumentException("The new hire date cannot be more than one month in the future.");
        else
            this. dateHired = newDateHired;
    }

    public void setBirthday(LocalDate newBirthday){
        if(LocalDate.now().getYear() - newBirthday.getYear() > 90)
            throw new IllegalArgumentException("Employee cannot be older than 90 years old.");
        else
            this.birthday = newBirthday;
    }

    public void setEmployeeNum(int newEmployeeNum){
        if(newEmployeeNum <= 0)
            throw new IllegalArgumentException("Employee number must be above 0.");
        else
            this.employeeNum = newEmployeeNum;
    }

    public void setFirstName(String newFirstName){
        if(newFirstName == "")
            throw new IllegalArgumentException("First name cannot be emtpy.");
        else
            this.firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        if(newLastName == "")
            throw new IllegalArgumentException("Last name cannot be empty.");
        else
            this.lastName = newLastName;
    }

    public void setStreetAddress(String newAddress){
        if(newAddress == "")
            throw new IllegalArgumentException("Street Address cannot be empty.");
        else
            this.address = newAddress;
    }

    public void setCity(String newCity){
        if(newCity == "")
            throw new IllegalArgumentException("City cannot be empty.");
        else
            this.city = newCity;
    }

    public void setPostalCode(String newPostalCode){
        if(newPostalCode == "")
            throw new IllegalArgumentException("Postal code cannot be empty");
        else
            this.postalCode = newPostalCode;
    }

    public int getYearBorn(){ return birthday.getYear(); }

    public int getAgeInYears(){ return LocalDate.now().getYear() - birthday.getYear(); }

    public int getYearsAtCollege(){ return LocalDate.now().getYear() - dateHired.getYear(); }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getStreetAddress() { return address; }

    public String getCity() { return city; }

    public String getPostalCode() { return postalCode; }

    public LocalDate getBirthday() { return birthday; }

    public LocalDate getHireDate() { return dateHired; }

    public int getEmployeeNum() { return employeeNum; }

    public void addCourseToAbilities(String newCourse){
        if(newCourse == "")
            throw new IllegalArgumentException("The new course code cannot be empty.");
        else {
            courseCodes.add(newCourse.toUpperCase());
        }
    }

    public boolean canTeach(String courseInQuestion){
        if(courseCodes.contains(courseInQuestion))
            return true;
        else
            return false;
    }

    public String listOfSubjectsCertifiedToTeach(){
        String certifiedCourses = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= courseCodes.size() - 1; i++){
            String currentCode = courseCodes.get(i);
            if(courseCodes.size() - 1 == i){
                sb.append(currentCode);
            }
            else{
                sb.append(currentCode + ", ");
            }
        }
        return sb.toString();
    }

    public String toString(){ return firstName + " " + lastName; }

}
