/**
 * File: SeaPlane.java
 * Deskripsi: Kelas turunan Airplane untuk pesawat laut
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 26 Mei 2024
 */

class SeaPlane extends Airplane {
    private double maxLoad;

    public SeaPlane(){

    }

    public SeaPlane(double maxLoad) {
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
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}