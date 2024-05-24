/**
 * File: ArmadaKendaraan.java
 * Deskripsi: Kelas untuk mengelola armada kendaraan
 * Nama/NIM : Yusuf Zaenul Mustofa/24060122120021
 * Tanggal  : 26 Mei 2024
 */

import java.util.*;

class ArmadaKendaraan {
    private List<Vehicle> armada;

    public ArmadaKendaraan() {
        armada = new ArrayList<>();
    }

    public <T extends Vehicle> void tambahArmada(Collection<T> vehicles) {
        armada.addAll(vehicles);
    }

    public List<Vehicle> getAllArmada() {
        return armada;
    }
}