package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Dosen;
import id.ac.undiksha.siak.people.Mahasiswa;

public class Main {

    public static void main(String[] args) {

        // Instansiasi objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("1234");

        System.out.println("NIM Mahasiswa 1: " + mhs1.getNim());

        System.out.println("------");

        Mahasiswa mhs2 = new Mahasiswa(
                "2215101023",
                "I Komang Pasek Bayu Atmaja",
                "6 September 2005",
                true,
                "Br. Dinas Abang Kelod",
                "ILKOM22",
                "Ilmu Komputer",
                "TI",
                "Teknik Informatika",
                "FTK"
        );
        
        mhs2.printAllInfo();
        
        Dosen dosen1 = new Dosen(
                "5678679",
                "Dr.Andi",
                "17 Mei 2024",
                true,
                "Seraya",
                "ILKOM",
                "Ilmu Komputer",
                "Dosen",
                "TI",
                "Teknik Informatika",
                "FTK"
        );
        
        dosen1.printAllInfo();

    }
}