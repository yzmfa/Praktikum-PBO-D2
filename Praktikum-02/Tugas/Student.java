/**********************************************************************************************************************/
/* File      : Student.java                                                                                           */
/* Deskripsi : Kelas Students yang merupakan seorang student dengan name, age, address, studentID dan coursesEnrolled */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                                                                    */
/* Tanggal   : 28 Februari 2024                                                                                       */
/**********************************************************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class Student {
    /*Atribut */
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    /*Method */
    /*Konstruktor */
    public Student(String name, int age, String address, int studentID){
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    /*Fungsi selektor untuk mendapatkan nilai dari atribut name */
    public String getName(){
        return name;
    }

    /*Prosedur untuk mengeset nilai atribut name dengan nilai yang baru */
    public void setName(String name){
        this.name = name;
    }
    
    /*Fungsi selektor untuk mendapatkan nilai dari atribut age */
    public int getAge(){
        return age;
    }
    
    /*Prosedur untuk mengeset nilai atribut age dengan nilai yang baru */
    public void setAge(int age){
        this.age = age;
    }
    
    /*Fungsi selektor untuk mendapatkan nilai dari atribut address */
    public String getAddress(){
        return address;
    }
    
    /*Prosedur untuk mengeset nilai atribut address dengan nilai yang baru */
    public void setAddress(String address){
        this.address = address;
    }
    
    /*Fungsi selektor untuk mendapatkan nilai dari atribut studentID */
    public int getStudentID(){
        return studentID;
    }
    
    /*Prosedur untuk mengeset nilai atribut studentID dengan nilai yang baru */
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    
    /*Fungsi selektor untuk mendapatkan nilai dari semua atribut */
    public void getDetails(){
        System.out.printf("Name      : %s\n", getName());
        System.out.printf("Age       : %s\n", getAge());
        System.out.printf("Address   : %s\n", getAddress());
        System.out.printf("Student ID: %s\n", getStudentID());
    }
    
    /*Prosedur untuk menambahkan ke dalam course */
    public void enrollInCourse(Course c){
        System.out.printf("Student named %s enrolled in courses %s. \n\n", getName(), c.getCourseName());
        coursesEnrolled.add(c);
    }

    /*Fungsi selektor untuk mendapatkan nilai dari atribut courseEnrolled */
    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }
    
    /*Prosedur untuk mendapatkan detail dari name yang masuk ke courses */
    public void viewEnrolledCourses(){
        System.out.printf("\nCourses enrolled by student named %s.\n", getName());
        for (Course course : coursesEnrolled) {
            course.getDetails(); 
        }
    }

}