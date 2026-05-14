import java.util.Scanner;

public class kalkulatorgaji {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String golongan;
        int jamLembur;

        int gajiPokok = 0;
        int gajiLembur = 0;
        int totalGaji;

        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        golongan = input.nextLine();

        System.out.print("Masukkan Jam Lembur: ");
        jamLembur = input.nextInt();

        if (golongan.equalsIgnoreCase("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equalsIgnoreCase("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equalsIgnoreCase("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid");
        }
        
        
        if (jamLembur == 1) {
            gajiLembur = (int) (0.30 * gajiPokok);
        } else if (jamLembur == 2) {
            gajiLembur = (int) (0.32 * gajiPokok);
        } else if (jamLembur == 3) {
            gajiLembur = (int) (0.34 * gajiPokok);
        } else if (jamLembur == 4) {
            gajiLembur = (int) (0.36 * gajiPokok);
        } else if (jamLembur >= 5) {
            gajiLembur = (int) (0.38 * gajiPokok);
        } else {
            gajiLembur = 0;
        }

        totalGaji = gajiPokok + gajiLembur;

        System.out.println("Gaji Pokok     : Rp " + gajiPokok);
        System.out.println("Gaji Lembur    : Rp " + gajiLembur);
        System.out.println("Total Gaji     : Rp " + totalGaji);

    }
}