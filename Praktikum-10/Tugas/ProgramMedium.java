/**
 * File: ProgramMedium.java
 * Deskripsi: Program utama untuk mengelola armada kendaraan
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 26 Mei 2024
 */

import java.util.*;

public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println(truck);

        SeaPlane sPlane = new SeaPlane();
        System.out.println(sPlane);

        Helicopter copter = new Helicopter();
        System.out.println(copter);

        System.out.println("###################################################");

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        // Menambahkan kendaraan ke kelompok armada yang sesuai
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("Jumlah Armada Truck: " + armadaTruck.size());

        armadaSeaPlane.add(sPlane);
        System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());

        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());

        System.out.println("###################################################");

        ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();

        System.out.println("Menambah armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        System.out.println("Menambah armada baru");
        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        System.out.println("Menambah armada baru");
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
    }
}
