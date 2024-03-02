/**********************************************************************************************************************/
/* File      : Lecture.java                                                                                           */
/* Deskripsi : Kelas Lecture yang merupakan seorang lecturer dengan name, age, address, employeeID dan coursesTaught  */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                                                                    */
/* Tanggal   : 28 Februari 2024                                                                                       */
/**********************************************************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class Lecture {
    /*Atribut */
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    /*Method */
    /*Konstruktor */
    public Lecture(String name, int age, String address, int employeeID){
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    /*Fungsi selektor untuk mendapatkan nilai dari atribut name */
    public String getName(){
        return name;
    }
    
    /*Prosedur untuk mengeset nilai atribut name dengan nilai yang baru */
    public void setName(String name) {
        this.name = name;
    }
    
    /*Fungsi selektor untuk mendapatkan nilai dari atribut age */
    public int getAge() {
        return age;
    }
    
    /*Prosedur untuk mengeset nilai atribut age dengan nilai yang baru */
    public void setAge(int age) {
        this.age = age;
    }
    
    /*Fungsi selektor untuk mendapatkan nilai dari atribut address */
    public String getAddress() {
        return address;
    }
    
    /*Prosedur untuk mengeset nilai atribut address dengan nilai yang baru */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /*Fungsi selektor untuk mendapatkan nilai dari atribut employeeID */
    public int getEmployeeID() {
        return employeeID;
    }
    
    /*Prosedur untuk mengeset nilai atribut employeeID dengan nilai yang baru */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
    /*Fungsi selektor untuk mendapatkan nilai dari semua atribut */
    public void getDetails() {
        System.out.printf("Name       : %s\n", getName());
        System.out.printf("Age        : %d\n", getAge());
        System.out.printf("Address    : %s\n", getAddress());
        System.out.printf("Employee ID: %d\n", getEmployeeID());
    }
    
    /*Prosedur untuk menambahkan lecturer ke coursesTaught */
    public void teachCourse(Course c) {
        System.out.printf("Lecturer named %s taught in courses %s. \n", getName(), c.getCourseName());
        coursesTaught.add(c);
    }

    /*Prosedur untuk melihat detail dari courses yang diTaught lecturer */
    public void viewTaughtCourses() {
        System.out.printf("\nCourses taught by lecturer named %s.\n", getName());
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}

