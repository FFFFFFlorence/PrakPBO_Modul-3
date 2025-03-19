import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahKaryawan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input.nextInt();
        input.nextLine();
        
        String[][] karyawanData = new String[jumlahKaryawan][3];
        int[][] dataAbsen = new int[jumlahKaryawan][2];
        double[] gajiList = new double[jumlahKaryawan];
        int gajiPerJam;
        double gaji;
        int jamLembur;

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("\nData Karyawan " + (i + 1) + ":");
            System.out.print("ID: ");
            karyawanData[i][0] = input.nextLine();
            System.out.print("Nama: ");
            karyawanData[i][1] = input.nextLine();
            System.out.print("Shift (pagi/siang/malam): ");
            karyawanData[i][2] = input.nextLine();
            
            switch (karyawanData[i][2].toLowerCase()) {
                case "pagi":
                    gajiPerJam = 50000;
                    break;
                case "siang":
                    gajiPerJam = 55000;
                    break;
                case "malam":
                    gajiPerJam = 60000;
                    break;
                default:
                    System.out.println("Shift invalid! Menggunakan shift pagi sebagai default.");
                    gajiPerJam = 50000;
            }
            
            do {
                System.out.print("Total jam kerja dalam seminggu (0-80): ");
                dataAbsen[i][0] = input.nextInt();
                if (dataAbsen[i][0] < 0 || dataAbsen[i][0] > 80) {
                    System.out.println("Jam kerja invalid! Harap masukkan angka antara 0-80.");
                }
            } while (dataAbsen[i][0] < 0 || dataAbsen[i][0] > 80);
            
            do {
                System.out.print("Jumlah hari absen dalam seminggu (0-7): ");
                dataAbsen[i][1] = input.nextInt();
                if (dataAbsen[i][1] < 0 || dataAbsen[i][1] > 7) {
                    System.out.println("Jumlah hari absen invalid! Harap masukkan angka antara 0-7.");
                }
            } while (dataAbsen[i][1] < 0 || dataAbsen[i][1] > 7);
            input.nextLine();
            
            gaji = dataAbsen[i][0] * gajiPerJam;
            
            if (dataAbsen[i][0] > 40) {
                jamLembur = dataAbsen[i][0] - 40;
                gaji += jamLembur * gajiPerJam * 1.5;
            }
            
            if (dataAbsen[i][0] < 30) {
                gaji *= 0.9;
            }
            
            gaji -= dataAbsen[i][1] * 100000;
            gajiList[i] = gaji;
        }
        
        System.out.println("\nLaporan Gaji Karyawan:");
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.printf("ID: %s | Nama: %s | Shift: %s | Jam Kerja: %d | Absen: %d | Gaji: Rp%.2f%n",
                    karyawanData[i][0], karyawanData[i][1], karyawanData[i][2], dataAbsen[i][0], dataAbsen[i][1], gajiList[i]);
        }
        
        input.close();
    }
}
