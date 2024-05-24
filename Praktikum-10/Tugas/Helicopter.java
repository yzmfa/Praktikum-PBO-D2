/**
 * File: Helicopter.java
 * Deskripsi: Kelas turunan Airplane untuk helikopter
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 26 Mei 2024
 */

class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter(){

    }
    
    public Helicopter(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public void takeOff() {
    
    }

    public void land() {
        
    }

    public void fly() {
      
    }

    public double calcFuelEfficiency() {
        return 0; 
    }

    public double calcTripDistance() {
        return 0; 
    }

    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}