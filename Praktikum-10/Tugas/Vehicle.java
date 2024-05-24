/**
 * File: Vehicle.java
 * Deskripsi: Abstract class untuk kendaraan
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 26 Mei 2024
 */

public abstract class Vehicle {
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();
    
    public String toString() {
        return this.getClass().getSimpleName();
    }
}