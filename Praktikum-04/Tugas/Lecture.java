/**********************************************************************************************************************/
/* File      : Lecture.java                                                                                           */
/* Deskripsi : Kelas Lecture dengan menggunakan konsep inheritance serta overloading dan overriding                   */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                                                                    */
/* Tanggal   : 13 Maret 2024                                                                                          */
/**********************************************************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person {
    /* Atribut */
    private int employeeID;
    private List<Course> coursesTaught;

    /* Konstruktor */
    public Lecture(String name, int age, String address, int employeeID){
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    /* Fungsi selektor untuk mendapatkan nilai dari atribut employeeID */
    public int getEmployeeID(){
        return employeeID;
    }
    
    /* Prosedur untuk mengeset nilai atribut employeeID dengan nilai yang baru */
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }
    
    /* Override getDetails untuk menampilkan employeeID */
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.printf("Employee ID: %d\n", getEmployeeID());
    }

    /* Prosedur untuk menambahkan lecturer ke coursesTaught */
    public void teachCourse(Course c) {
        System.out.printf("Lecturer named %s taught in courses %s. \n", getName(), c.getCourseName());
        coursesTaught.add(c);
    }

    /* Prosedur untuk melihat detail dari courses yang diTaught lecturer */
    public void viewTaughtCourses() {
        System.out.printf("\nCourses taught by lecturer named %s.\n", getName());
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
