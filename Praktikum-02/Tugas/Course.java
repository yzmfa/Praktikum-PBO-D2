/**********************************************************************************************************************/
/* File      : Course.java                                                                                            */
/* Deskripsi : Kelas COurse yang merupakan sebuah course dengan courseCode, courseName, lecture dan studentsEnrolled  */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                                                                    */
/* Tanggal   : 28 Februari 2024                                                                                       */
/**********************************************************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class Course {
    /*Atribut */
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    /*Method */
    /*Konstruktor */
    public Course(String courseCode, String courseName, Lecture lecture){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    /*Fungsi selektor untuk mendapatkan nilai dari atribut courseCode */
    public String getCourseCode() {
        return courseCode;
    }
    
    /*Prosedur untuk mengeset nilai atribut courseCode dengan nilai yang baru */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    /*Fungsi selektor untuk mendapatkan nilai dari atribut courseName */
    public String getCourseName() {
        return courseName;
    }
    
    /*Prosedur untuk mengeset nilai atribut courseName dengan nilai yang baru */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    /*Fungsi selektor untuk mendapatkan nilai dari atribut lecture */
    public Lecture getLecture() {
        return lecture;
    }
    
    /*Prosedur untuk mengeset nilai atribut lecture dengan nilai yang baru */
    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }
    
    /*Fungsi selektor untuk mendapatkan semua atribut course */
    public void getDetails() {
        System.out.printf("Course Code: %s\n", getCourseCode());
        System.out.printf("Course Name: %s\n", getCourseName());
        System.out.printf("Lecture    : %s\n", lecture.getName());
    }
    
    /*Prosedur untuk menambahkan student ke studentsEnrolled */
    public void addStudent(Student student) {
        System.out.printf("Student named %s added in courses %s. \n", student.getName(), getCourseName());
        studentsEnrolled.add(student);
        // student.getCoursesEnrolled().add(this);
    }
    
    /*Prosedur untuk menghapus student dari studentsEnrolled */
    public void removeStudent(Student student) {
        System.out.printf("\nStudent named %s removed and unenrolled in courses %s. \n", student.getName(), getCourseName());
        studentsEnrolled.remove(student);
        student.getCoursesEnrolled().remove(this); //asumsikan saat student diremove otomatis diunenroll 
    }

    /*Prosedur untuk melihat detail dari students yang masuk di course */
    public void viewEnrolledStudents() {
        System.out.printf("\nStudents enrolled in courses %s.\n", getCourseName());
        for (Student student : studentsEnrolled) {
            student.getDetails();
        }
    }
}
