import org.junit.*;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author JWright
 */
public class InstructorTest
{
    Instructor instructor;

    public InstructorTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
//        firstName, String lastName, String streetAddress, String city, String postalCode,
//                      LocalDate hireDate, LocalDate birthday, int employeeNum

        instructor = new Instructor("Professor", "Snape", "11 Sinsister St", "London", "L0L 1W4", LocalDate.of(2000, Month.SEPTEMBER, 12), LocalDate.of(1976, Month.MARCH, 12), 1);
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of getFirstName method, of class Instructor.
     */
    @Test
    public void testGetFirstName()
    {
        String expResult = "Professor";
        String result = instructor.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Instructor.
     */
    @Test
    public void testSetFirstNameInvalid()
    {
        String firstName = "";
        try{
            instructor.setFirstName(firstName);
            fail("the setFirstName method should require a non-empty String");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of setFirstName method, of class Instructor.
     */
    @Test
    public void testSetFirstName()
    {
        String firstName = "Casper";
        instructor.setFirstName(firstName);
        assertEquals(firstName, instructor.getFirstName());
    }

    /**
     * Test of getLastName method, of class Instructor.
     */
    @Test
    public void testGetLastName()
    {
        String expResult = "Snape";
        String result = instructor.getLastName();
        assertEquals(expResult, result);
    }


    /**
     * Test of setLastName method, of class Instructor with an empty String.
     * This should trigger an exception
     */
    @Test
    public void testSetLastNameInvalid()
    {
        String lastName = "";
        try{
            instructor.setLastName(lastName);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }


    /**
     * Test of setLastName method, of class Instructor.
     */
    @Test
    public void testSetLastName()
    {
        String lastName = "Friendly";
        instructor.setLastName(lastName);
        assertEquals(lastName, instructor.getLastName());
    }

    /**
     * Test of getHireDate method, of class Instructor.
     */
    @Test
    public void testGetHireDate()
    {
        LocalDate expResult = LocalDate.of(2000, Month.SEPTEMBER, 12);
        LocalDate result = instructor.getHireDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHireDate method, of class Instructor.
     */
    @Test
    public void testSetHireDate()
    {
        LocalDate hireDate = LocalDate.of(2018, Month.FEBRUARY, 1);
        instructor.setHireDate(hireDate);
        assertEquals(hireDate, instructor.getHireDate());
    }


    /**
     * Test of setHireDate method, of class Instructor with date too far in the
     * future - it should trigger an exception.
     */
    @Test
    public void testSetHireDateInvalid()
    {
        LocalDate hireDate = LocalDate.of(2020, Month.FEBRUARY, 1);
        try{
            instructor.setHireDate(hireDate);
            fail("A hire date years in the future should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getBirthday method, of class Instructor.
     */
    @Test
    public void testGetBirthday()
    {
        LocalDate expResult = LocalDate.of(1976, Month.MARCH, 12);
        LocalDate result = instructor.getBirthday();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBirthday method, of class Instructor.
     */
    @Test
    public void testSetBirthday()
    {
        LocalDate birthday = LocalDate.of(1966, Month.MARCH, 10);
        instructor.setBirthday(birthday);
        assertEquals(birthday, instructor.getBirthday());
    }

    /**
     * Test of setBirthday method, of class Instructor.  This will make the Instructor
     * over 90 years old and should trigger an exception
     */
    @Test
    public void testSetBirthdayInvalid()
    {
        LocalDate birthday = LocalDate.of(1866, Month.MARCH, 10);
        try{
            instructor.setBirthday(birthday);
        } catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }


    /**
     * Test of getStreetAddress method, of class Instructor.
     */
    @Test
    public void testGetStreetAddress()
    {
        String expResult = "11 Sinsister St";
        String result = instructor.getStreetAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStreetAddress method, of class Instructor with an empty String
     * This should trigger an IllegalArgumentException.
     */
    @Test
    public void testSetStreetAddressInvalid()
    {
        String streetAddress = "";
        try{
            instructor.setStreetAddress(streetAddress);
            fail("An empty street address should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of setStreetAddress method, of class Instructor.
     */
    @Test
    public void testSetStreetAddress()
    {
        String streetAddress = "Test Street";
        instructor.setStreetAddress(streetAddress);
        assertEquals(streetAddress, instructor.getStreetAddress());
    }


    /**
     * Test of getCity method, of class Instructor.
     */
    @Test
    public void testGetCity()
    {
        String expResult = "London";
        String result = instructor.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCity method, of class Instructor with an emprt String.
     * This should trigger an exception
     */
    @Test
    public void testSetCityInvalid()
    {
        String city = "";
        try{
            instructor.setCity(city);
            fail("An empty city should trigger an exception");
        } catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of setCity method, of class Instructor.
     */
    @Test
    public void testSetCity()
    {
        String city = "Happy Town";
        instructor.setCity(city);
        assertEquals(city, instructor.getCity());
    }


    /**
     * Test of getPostalCode method, of class Instructor.
     */
    @Test
    public void testGetPostalCode()
    {
        String expResult = "L0L 1W4";
        String result = instructor.getPostalCode();
        assertEquals(expResult, result);
    }


    /**
     * Test of setPostalCode method, of class Instructor with an emptyString.
     * This should trigger an exception
     */
    @Test
    public void testSetPostalCodeInvalid()
    {
        String postalCode = "";
        try{
            instructor.setPostalCode(postalCode);
            fail("an empty postal code should trigger an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of setPostalCode method, of class Instructor.
     */
    @Test
    public void testSetPostalCode()
    {
        String postalCode = "L6R 5E4";
        instructor.setPostalCode(postalCode);
        assertEquals(postalCode, instructor.getPostalCode());
    }

    /**
     * Test of getEmployeeNum method, of class Instructor.
     */
    @Test
    public void testGetEmployeeNum()
    {
        int expResult = 1;
        int result = instructor.getEmployeeNum();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmployeeNum method, of class Instructor with an invalid employee number.
     * This should trigger an exception.
     */
    @Test
    public void testSetEmployeeNumInvalid()
    {
        int employeeNum = -1;
        try{
            instructor.setEmployeeNum(employeeNum);
            fail("employee numbers must be greater than 0");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of setEmployeeNum method, of class Instructor.
     */
    @Test
    public void testSetEmployeeNum()
    {
        int employeeNum = 1001;
        instructor.setEmployeeNum(employeeNum);
        assertEquals(employeeNum, instructor.getEmployeeNum());
    }

    /**
     * Test of toString method, of class Instructor.
     */
    @Test
    public void testToString()
    {
        String expResult = "Professor Snape";
        String result = instructor.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAgeInYears method, of class Instructor.
     */
    @Test
    public void testGetAgeInYears()
    {
        int expResult = 42;
        int result = instructor.getAgeInYears();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYearsAtCollege method, of class Instructor.
     */
    @Test
    public void testGetYearsAtCollege()
    {
        int expResult = 18;
        int result = instructor.getYearsAtCollege();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCourseToAbilities method, of class Instructor.
     */
    @Test
    public void testAddCourseToAbilities()
    {
        String courseCode = "COMP1011";
        instructor.addCourseToAbilities(courseCode);
        assertEquals(courseCode, instructor.listOfSubjectsCertifiedToTeach());
    }

    /**
     * Test of canTeach method, of class Instructor, test for false.
     */
    @Test
    public void testCanTeach()
    {
        boolean expResult = false;
        boolean result = instructor.canTeach("COMP1011");
        assertEquals(expResult, result);
    }

    /**
     * Test of canTeach method, of class Instructor, test for true.
     */
    @Test
    public void testCanTeachTrue()
    {
        instructor.addCourseToAbilities("COMP1008");
        boolean expResult = true;
        boolean result = instructor.canTeach("COMP1008");
        assertEquals(expResult, result);
    }


    /**
     * Test of listOfSubjectsCertifiedToTeach method, of class Instructor with
     * no courses
     */
    @Test
    public void testListOfSubjectsCertifiedToTeachEmpty()
    {
        String expResult = "";
        String result = instructor.listOfSubjectsCertifiedToTeach();
        assertEquals(expResult, result);
    }


    /**
     * Test of listOfSubjectsCertifiedToTeach method, of class Instructor with
     * no courses
     */
    @Test
    public void testListOfSubjectsCertifiedToTeach()
    {
        String expResult = "COMP1011, COMP1008";
        instructor.addCourseToAbilities("COMP1011");
        instructor.addCourseToAbilities("COMP1008");
        String result = instructor.listOfSubjectsCertifiedToTeach();
        assertEquals(expResult, result);
    }


    /**
     * Test of getYearBorn method, of class Instructor.
     */
    @Test
    public void testGetYearBorn()
    {
        int expResult = 1976;
        int result = instructor.getYearBorn();
        assertEquals(expResult, result);
    }

    /**
     * Test to ensure that a non-empty String is being passed into the
     * method addCourseToAbilities()
     */
    @Test
    public void testAddCourseToAbilitiesInvalid()
    {
        try
        {
            instructor.addCourseToAbilities("");
            fail("Course code should not be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test to ensure that a String with lower case letters is converted
     * to UPPER case letters
     * method addCourseToAbilities()
     */
    @Test
    public void testAddCourseToAbilitiesLowerCase()
    {
        String expResult = "COMP1008";
        instructor.addCourseToAbilities("comp1008");
        String result = instructor.listOfSubjectsCertifiedToTeach();
        assertEquals(expResult, result);
    }
}