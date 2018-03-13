import org.junit.*;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author JWright
 */
public class StudentTest
{
    Student student;

    public StudentTest()
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
        student = new Student("Barb", "Dwyer", "123 Happy St", "Barrie", "L4M 8T0", LocalDate.of(1976, Month.MARCH, 10), LocalDate.of(2016, Month.SEPTEMBER, 1), 10001);
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of getFirstName method, of class Student.
     */
    @Test
    public void testGetFirstName()
    {
        String expResult = "Barb";
        String result = student.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Student.
     */
    @Test
    public void testSetFirstName()
    {
        student.setFirstName("Fredrick");
        String result = student.getFirstName();
        assertEquals("Fredrick",result);
    }

    /**
     * Test of getLastName method, of class Student.
     */
    @Test
    public void testGetLastName()
    {
        String expResult = "Dwyer";
        String result = student.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetLastName()
    {
        student.setLastName("Great");
        assertEquals("Great", student.getLastName());
    }

    /**
     * Test of setLastName method, of class Student.
     */
    @Test
    public void testSetLastNameInvalid()
    {
        String lastName = "";
        try
        {
            student.setLastName(lastName);
            fail("The setLastName method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getStreetAddress method, of class Student.
     */
    @Test
    public void testGetStreetAddress()
    {
        String expResult = "123 Happy St";
        String result = student.getStreetAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStreetAddress method, of class Student with an invalid empty argument.
     */
    public void testSetStreetAddressInvalid()
    {
        String lastName = "";
        try
        {
            student.setStreetAddress("");
            fail("setStreetAddress with an empty argument should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }


    /**
     * Test of setStreetAddress method, of class Student.
     */
    @Test
    public void testSetStreetAddress()
    {
        student.setStreetAddress("123 HaHa St");
        assertEquals("123 HaHa St", student.getStreetAddress());
    }

    /**
     * Test of getCity method, of class Student.
     */
    @Test
    public void testGetCity()
    {
        String expResult = "Barrie";
        String result = student.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCity method, of class Student.
     */
    @Test
    public void testSetCity()
    {
        student.setCity("Brampton");
        assertEquals("Brampton", student.getCity());
    }

    /**
     * Test of setCity method, of class Student with an invalid input.
     */
    @Test
    public void testSetCityInvalid()
    {
        try{
            student.setCity("");
            fail("setCity method with an empty argument should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getPostalCode method, of class Student.
     */
    @Test
    public void testGetPostalCode()
    {
        String expResult = "L4M 8T0";
        String result = student.getPostalCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPostalCode method, of class Student.
     */
    @Test
    public void testSetPostalCode()
    {
        student.setPostalCode("L8T 2S1");
        assertEquals("L8T 2S1", student.getPostalCode());
    }


    /**
     * Test of setPostalCode method, of class Student with an invalid argument.
     */
    @Test
    public void testSetPostalCodeInvalid()
    {
        try{
            student.setPostalCode("");
            fail("setPostalCode with an empty argument should trigger an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }


    /**
     * Test of getStudentNum method, of class Student.
     */
    @Test
    public void testGetStudentNum()
    {
        int expResult = 10001;
        int result = student.getStudentNum();
        assertEquals(expResult, result);
    }


    /**
     * Test of getDateOfBirth method, of class Student.
     */
    @Test
    public void testGetDateOfBirth()
    {
        LocalDate expResult = LocalDate.of(1976, Month.MARCH, 10);
        LocalDate result = student.getDateOfBirth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateOfBirth method, of class Student.
     */
    @Test
    public void testSetDateOfBirth()
    {
        LocalDate dateOfBirth = LocalDate.of(2000, Month.DECEMBER, 1);
        student.setDateOfBirth(dateOfBirth);
        assertEquals(dateOfBirth, student.getDateOfBirth());
    }


    /**
     * Test of setDateOfBirth method, of class Student.
     */
    @Test
    public void testSetDateOfBirthInvalid()
    {
        LocalDate dateOfBirth = LocalDate.of(1888, Month.DECEMBER, 1);
        try{
            student.setDateOfBirth(dateOfBirth);
        }
        catch (IllegalArgumentException e){
            System.out.println("The student is too old and should have triggered an exception");
        }
    }

    /**
     * Test of getDateEnrolled method, of class Student.
     */
    @Test
    public void testGetDateEnrolled()
    {
        LocalDate expResult = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate result = student.getDateEnrolled();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateEnrolled method, of class Student.
     */
    @Test
    public void testSetDateEnrolled()
    {
        LocalDate dateEnrolled = LocalDate.of(2016, Month.SEPTEMBER, 1);
        student.setDateEnrolled(dateEnrolled);
        assertEquals(dateEnrolled, student.getDateEnrolled());
    }


    /**
     * Test of setDateEnrolled method, of class Student.
     */
    @Test
    public void testSetDateEnrolledInvalid()
    {
        LocalDate dateEnrolled = LocalDate.of(2020, Month.SEPTEMBER, 1);
        try{
            student.setDateEnrolled(dateEnrolled);
            fail("setDateEnrolled with invalid date should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }


    /**
     * Test of getYearBorn method, of class Student.
     */
    @Test
    public void testGetYearBorn()
    {
        int expResult = 1976;
        int result = student.getYearBorn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge()
    {
        System.out.println("getAge");
        int expResult = 42;
        int result = student.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYearEnrolled method, of class Student.
     */
    @Test
    public void testGetYearEnrolled()
    {
        int expResult = 2016;
        int result = student.getYearEnrolled();
        assertEquals(expResult, result);
    }


    /**
     * Test of isInGoodStanding method, of class Student.
     */
    @Test
    public void testIsInGoodStanding()
    {
        boolean expResult = true;
        boolean result = student.isInGoodStanding();
        assertEquals(expResult, result);
    }

    /**
     * Test of suspendStudent method, of class Student.
     */
    @Test
    public void testSuspendStudent()
    {
        student.suspendStudent();
        boolean expResult = false;
        boolean result = student.isInGoodStanding();
        assertEquals(expResult, result);

    }

    /**
     * Test of reinstateStudent method, of class Student.
     */
    @Test
    public void testReinstateStudent()
    {
        student.reinstateStudent();
        boolean expResult = true;
        boolean result = student.isInGoodStanding();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString()
    {
        String expResult = "Barb Dwyer, student number: 10001";
        String result = student.toString();
        assertEquals(expResult, result);
    }

    /**
     * This test will attempt to create a Student with an invalid student number
     */
    @Test
    public void testInvalidStudentNumber()
    {
        try{
            Student student = new Student("Barb", "Dwyer", "123 Happy St", "Barrie", "L4M 8T0", LocalDate.of(1976, Month.MARCH, 10), LocalDate.of(2016, Month.SEPTEMBER, 1), -1);
            fail("-1 is not a valid student number and should be caught");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * This test will attempt to create a street address with an invalid street
     */
    @Test
    public void testInvalidStreetAddress()
    {
        try{
            student.setStreetAddress("");
            fail("Street address should never be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * This test will attempt to create a first name with an empty String
     */
    @Test
    public void testInvalidFirstName()
    {
        try{
            student.setFirstName("");
            fail("first name should never be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }



}