/**
 * File: RiverBarge.java
 * Deskripsi: Kelas turunan Vehicle untuk kapal sungai
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 26 Mei 2024
 */

class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge(){

    }
    
    public RiverBarge(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return 0; 
    }

    public double calcTripDistance() {
        return 0; 
    }
}