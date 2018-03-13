import org.junit.*;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author JWright
 */
public class CourseTest
{
    Course course;
    Instructor instructor;

    public CourseTest()
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
        Student validStudent = new Student("Barb", "Dwyer", "123 Happy St", "Barrie", "L4M 8T0", LocalDate.of(1976, Month.MARCH, 10), LocalDate.of(2016, Month.SEPTEMBER, 1), 10001);
        instructor = new Instructor("Professor", "Snape", "11 Sinsister St", "London", "L0L 1W4", LocalDate.of(2000, Month.SEPTEMBER, 12), LocalDate.of(1976, Month.MARCH, 12), 1);
        instructor.addCourseToAbilities("COMP1008");
        course = new Course(instructor, "COMP1008", "Intro to Objects", "K324", 2);
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of getInstructor method, of class Course.
     */
    @Test
    public void testGetInstructor()
    {

        Instructor expResult = instructor;
        Instructor result = course.getInstructor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInstructor method, of class Course.
     */
    @Test
    public void testSetInstructorInvalid()
    {
        System.out.println("setInstructor");
        Instructor instructor = new Instructor("Funny", "Guy", "11 Funny St", "London", "L0L 1W4", LocalDate.of(2000, Month.SEPTEMBER, 12), LocalDate.of(1976, Month.MARCH, 12), 1);
        try{
            course.setInstructor(instructor);
            fail("The Instructor is not qualified to teach this course");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }


    }

    /**
     * Test of getCourseCode method, of class Course.
     */
    @Test
    public void testGetCourseCode()
    {
        String expResult = "COMP1008";
        String result = course.getCourseCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseCode method, of class Course.
     */
    @Test
    public void testSetCourseCodeInvalid()
    {

        String courseCode = "";
        try{
            course.setCourseCode(courseCode);
            fail("The course code cannot be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }

    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName()
    {
        String expResult = "Intro to Objects";
        String result = course.getCourseName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseNameInvalid()
    {
        String courseName = "";
        try{
            course.setCourseName(courseName);
            fail("The course name cannot be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getRoom method, of class Course.
     */
    @Test
    public void testGetRoom()
    {
        String expResult = "K324";
        String result = course.getRoom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRoom method, of class Course.
     */
    @Test
    public void testSetRoomInvalid()
    {
        String room = "";
        try{
            course.setRoom(room);
            fail("The test case is a prototype.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }

    }

    /**
     * Test of getMaxStudents method, of class Course.
     */
    @Test
    public void testGetMaxStudents()
    {
        int expResult = 2;
        int result = course.getMaxStudents();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaxStudents method, of class Course.
     */
    @Test
    public void testSetMaxStudentsLow()
    {
        int maxStudents = 0;
        try{
            course.setMaxStudents(maxStudents);
            fail("Class size must be greater than 0");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of setMaxStudents method, of class Course.
     */
    @Test
    public void testSetMaxStudentsHigh()
    {
        int maxStudents = 46;
        try{
            course.setMaxStudents(maxStudents);
            fail("Class size must be greater than 0");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString()
    {
        String expResult = "Intro to Objects COMP1008";
        String result = course.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInstructor method, of class Course.
     */
    @Test
    public void testSetInstructor()
    {
        Instructor instructor = new Instructor("Prof", "Test", "11 Sinsister St", "London", "L0L 1W4", LocalDate.of(2000, Month.SEPTEMBER, 12), LocalDate.of(1976, Month.MARCH, 12), 1);
        instructor.addCourseToAbilities("COMP1008");
        course.setInstructor(instructor);
        assertEquals(instructor, course.getInstructor());
    }


    /**
     * Test of addStudent method, of class Course.
     */
    @Test
    public void testAddStudent()
    {
        Student student = new Student("Barb", "Dwyer1", "123 Happy St", "Barrie", "L4M 8T0", LocalDate.of(1976, Month.MARCH, 10), LocalDate.of(2016, Month.SEPTEMBER, 1), 10001);;
        Student student2 = new Student("Barb", "Dwyer2", "123 Happy St", "Barrie", "L4M 8T0", LocalDate.of(1976, Month.MARCH, 10), LocalDate.of(2016, Month.SEPTEMBER, 1), 10001);;
        Student student3 = new Student("Barb", "Dwyer3", "123 Happy St", "Barrie", "L4M 8T0", LocalDate.of(1976, Month.MARCH, 10), LocalDate.of(2016, Month.SEPTEMBER, 1), 10001);;

        course.addStudent(student);
        course.addStudent(student);
        assertEquals(2, course.getStudents().size());
    }

    /**
     * Test of addStudent method, of class Course.
     */
    @Test
    public void testAddStudentStudentInBadStanding()
    {
        Student student = new Student("Barb", "Dwyer1", "123 Happy St", "Barrie", "L4M 8T0", LocalDate.of(1976, Month.MARCH, 10), LocalDate.of(2016, Month.SEPTEMBER, 1), 10001);;
        student.suspendStudent();

        try{
            course.addStudent(student);
            fail("The student is in bad standing and should not have been added");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Trying to add a student in bad standing: %s%n",e);
        }
    }

    /**
     * Test of addStudent method, of class Course.
     */
    @Test
    public void testAddStudentInvalid()
    {
        Student student = new Student("Barb", "Dwyer2", "123 Happy St", "Barrie", "L4M 8T0", LocalDate.of(1976, Month.MARCH, 10), LocalDate.of(2016, Month.SEPTEMBER, 1), 10001);;
        Student student2 = new Student("Barb", "Dwyer3", "123 Happy St", "Barrie", "L4M 8T0", LocalDate.of(1976, Month.MARCH, 10), LocalDate.of(2016, Month.SEPTEMBER, 1), 10001);;
        Student student3 = new Student("Barb", "Dwyer3", "123 Happy St", "Barrie", "L4M 8T0", LocalDate.of(1976, Month.MARCH, 10), LocalDate.of(2016, Month.SEPTEMBER, 1), 10001);;

        course.addStudent(student);
        course.addStudent(student2);
        try{
            course.addStudent(student3);
            fail("max # of students was 2, the third student should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Error for catching too many students: "+e);
        }
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseName()
    {
        String courseName = "COMP1111";
        course.setCourseName(courseName);
        assertEquals(courseName, course.getCourseName());
    }

    /**
     * Test of setRoom method, of class Course.
     */
    @Test
    public void testSetRoom()
    {
        String room = "A123";
        course.setRoom(room);
        assertEquals(room, course.getRoom());
    }

    /**
     * Test of setMaxStudents method, of class Course.
     */
    @Test
    public void testSetMaxStudents()
    {
        int maxStudents = 1;
        course.setMaxStudents(maxStudents);
        assertEquals(1, course.getMaxStudents());
    }
}