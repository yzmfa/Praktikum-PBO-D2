/**********************************************************************************************************************/
/* File      : Person.java                                                                                            */
/* Deskripsi : Kelas Person dengan menggunakan konsep inheritance serta overloading dan overriding                    */
/* NIM/Nama  : 24060122120021/Yusuf Zaenul Mustofa                                                                    */
/* Tanggal   : 13 Maret 2024                                                                                          */
/**********************************************************************************************************************/
public class Person {
    /* Atribut */
    protected String name;
    protected int age;
    protected String address;

    /* Konstruktor */
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /* Konstruktor dengan overloading */
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this.name = name;
    }

    /* Fungsi selektor untuk mendapatkan nilai dari atribut name */
    public String getName(){
        return name;
    }

    /* Prosedur untuk mengeset nilai atribut name dengan nilai yang baru */
    public void setName(String name){
        this.name = name;
    }
    
    /* Fungsi selektor untuk mendapatkan nilai dari atribut age */
    public int getAge(){
        return age;
    }
    
    /* Prosedur untuk mengeset nilai atribut age dengan nilai yang baru */
    public void setAge(int age){
        this.age = age;
    }
    
    /* Fungsi selektor untuk mendapatkan nilai dari atribut address */
    public String getAddress(){
        return address;
    }
    
    /* Prosedur untuk mengeset nilai atribut address dengan nilai yang baru */
    public void setAddress(String address){
        this.address = address;
    }
    
    /* Fungsi selektor untuk mendapatkan nilai dari semua atribut */
    public void getDetails(){
        System.out.printf("Name    : %s\n", getName());
        System.out.printf("Age     : %s\n", getAge());
        System.out.printf("Address : %s\n", getAddress());
    }
}