/**
 * File: Truck.java
 * Deskripsi: Kelas turunan Vehicle untuk truk
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 26 Mei 2024
 */

class Truck extends Vehicle {
    private double maxLoad;

    public Truck(){

    }

    public Truck(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return 0; 
    }

    public double calcTripDistance() {
        return 0; 
    }

    public String toString() {
        return "Truck adalah angkutan darat yang sangat handal";
    }
}