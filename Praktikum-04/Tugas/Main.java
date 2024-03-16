/**********************************************************************************************************/
/* File      : Main.java                                                                                  */
/* Deskripsi : Kelas yang berisi main dari Student, Lecture, dan Course dengan Overloading dan Overriding */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                                                        */
/* Tanggal   : !3 Maret 2024                                                                              */
/**********************************************************************************************************/
public class Main {
    public static void main(String[] args) {
        /*Inisialisasi lecture */
        Lecture agus = new Lecture("Agus", 35, "Tembalang", 177013);
        Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", 412873);
        
        /*Inisialisasi student */
        Student cahyo = new Student("Cahyo", 20, "456 Elm St", 723751);
        Student dani = new Student("Dani", 20, "123 Oak St", 734621);
        Student edi = new Student("Edi", 20, "789 Pine St", 733451);
        
        /*Inisialisasi course */
        Course cs101 = new Course("CS101", "Intro to Computer Science", agus);
        Course cs102 = new Course("CS102", "Data Structures", agus);
        Course cs103 = new Course("CS103", "Algorithms", bambang);
        
        /*Memberikan detail dari lecture, student, dan course yang sudah diinisialisasi */
        System.out.printf("Details of the lecturer named Agus.\n");
        agus.getDetails();
        System.out.printf("\nDetails of the lecturer named Bambang.\n");
        bambang.getDetails();
        System.out.printf("\nDetails of the students named Cahyo.\n");
        cahyo.getDetails();
        System.out.printf("\nDetails of the students named Dani.\n");
        dani.getDetails();
        System.out.printf("\nDetails of the students named Edi.\n");
        edi.getDetails();
        System.out.printf("\nDetails of the courses in Intro to Computer Science.\n");
        cs101.getDetails();
        System.out.printf("\nDetails of the courses in Data Structures.\n");
        cs102.getDetails();
        System.out.printf("\nDetails of the courses in Algorithms.\n");
        cs103.getDetails();
        
        /*Menambahkan lecture ke teachCourse */
        System.out.printf("\n\n");
        agus.teachCourse(cs101);
        agus.teachCourse(cs102);
        bambang.teachCourse(cs103);
        
        /*Menambahkan student ke studentsEnrolled dan coursesEnrolled */
        System.out.printf("\n\n");
        cs101.addStudent(cahyo);
        cahyo.enrollInCourse(cs101);
        cs101.addStudent(dani);
        dani.enrollInCourse(cs101);
        cs101.addStudent(edi);
        edi.enrollInCourse(cs101);
        cs102.addStudent(cahyo);
        cahyo.enrollInCourse(cs102);
        cs102.addStudent(dani);
        dani.enrollInCourse(cs102);
        cs103.addStudent(cahyo);
        dani.enrollInCourse(cs103);

        /*Melihat courses yang dienroll cahyo */
        cahyo.viewEnrolledCourses();
        
        /*Menghapus dan unenroll cahyo dari courses cs101 (Intro to Computer Science) */
        cs101.removeStudent(cahyo);

        /*Melihat courses yang dienroll cahyo */
        cahyo.viewEnrolledCourses();

        /*Melihat courses yang ditaught agus */
        agus.viewTaughtCourses();

        /*Melihat students yang enroll courses cs101 (Intro to Computer Science) */
        cs101.viewEnrolledStudents();
    }
}
