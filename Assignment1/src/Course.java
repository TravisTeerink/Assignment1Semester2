import java.util.ArrayList;

public class Course {

    public Instructor instructor;
    private String courseCode;
    private String courseName;
    private String room;
    private int maxStudents;
    private int numberOfStudents = 0;
    private ArrayList<Student> studentlist;

    public Course(Instructor instructor, String coursecode, String coursename, String Room, int maxstudents){
        setInstructor(instructor);
        setCourseCode(coursecode);
        setCourseName(coursename);
        setRoom(Room);
        setMaxStudents(maxstudents);
    }

    public void setCourseName(String newCourseName){
        if(newCourseName == "")
            throw new IllegalArgumentException("Course name cannot be empty.");
        else
            this.courseName = newCourseName;
    }

    public void setCourseCode(String newCourseCode){
        if(newCourseCode == "")
            throw new IllegalArgumentException("Course code cannot be empty.");
        else
            this.courseCode = newCourseCode;
    }

    public void setRoom(String newRoom){
        if(newRoom == "")
            throw new IllegalArgumentException("Room cannot be empty.");
        else
            this.room = newRoom;
    }

    public void setInstructor(Instructor newInstructor) {
        if(!newInstructor.canTeach(courseCode))
            throw new IllegalArgumentException("This course in not within the intructors capabilities.");
        else
            this.instructor = newInstructor;
    }

    public void addStudent(Student newStudent){
        if(newStudent.isInGoodStanding() && numberOfStudents < maxStudents) {
            numberOfStudents++;
            studentlist.add(newStudent);
        }
        else
            throw new IllegalArgumentException("Class is either full or student is in badd standing.");
    }

    public void showClassList(){
        String classList = "";
        for(int i = 0; i >= studentlist.size() - 1; i ++){
            Student currentStudent = studentlist.get(i);
            classList += (currentStudent.getFirstName() + " " + currentStudent.getLastName());
        }
        System.out.println(classList);
    }

    public void setMaxStudents(int newMax){
        if(newMax <= 45 || newMax > 0)
            this.maxStudents = newMax;
        else
            throw new IllegalArgumentException("Max number of students must be between 0 and 45");
    }


    public String getCourseName() { return courseName; }

    public String getCourseCode() { return courseCode; }

    public String getRoom() { return room; }

    public Instructor getInstructor() { return instructor; }

    public int getMaxStudents() { return maxStudents; }

    public ArrayList<Student> getStudents() { return studentlist; }

    public String toString(){ return courseName + " " + courseCode; }
}


