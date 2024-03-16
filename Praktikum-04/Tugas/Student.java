/**********************************************************************************************************************/
/* File      : Student.java                                                                                           */
/* Deskripsi : Kelas Student dengan menggunakan konsep inheritance serta overloading dan overriding                   */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                                                                    */
/* Tanggal   : 13 Maret 2024                                                                                          */
/**********************************************************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    /* Atribut */
    private int studentID;
    private List<Course> coursesEnrolled;

    /* Konstruktor */
    public Student(String name, int age, String address, int studentID){
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    /* Fungsi selektor untuk mendapatkan nilai dari atribut studentID */
    public int getStudentID(){
        return studentID;
    }
    
    /* Prosedur untuk mengeset nilai atribut studentID dengan nilai yang baru */
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    
    /* Override getDetails untuk menampilkan studentID */
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.printf("Student ID: %s\n", getStudentID());
    }

    /* Prosedur untuk menambahkan ke dalam course */
    public void enrollInCourse(Course c){
        System.out.printf("Student named %s enrolled in courses %s. \n\n", getName(), c.getCourseName());
        coursesEnrolled.add(c);
    }

    /* Fungsi selektor untuk mendapatkan nilai dari atribut courseEnrolled */
    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }
    
    /* Prosedur untuk mendapatkan detail dari name yang masuk ke courses */
    public void viewEnrolledCourses(){
        System.out.printf("\nCourses enrolled by student named %s.\n", getName());
        for (Course course : coursesEnrolled) {
            course.getDetails(); 
        }
    }
}
