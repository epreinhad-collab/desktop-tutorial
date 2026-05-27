import java.util.Scanner;

public class kalkulatorgaji2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String golongan;
        int jamLembur;

        int gajiPokok = 0;
        int gajiLembur = 0;
        int totalGaji;

        int gaji[] = {5000000, 6500000, 9500000};

        double lembur[] = {0.30, 0.32, 0.34, 0.36, 0.38};

        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        golongan = input.nextLine();

        System.out.print("Masukkan Jam Lembur: ");
        jamLembur = input.nextInt();

        if (golongan.equalsIgnoreCase("A")) {
            gajiPokok = gaji[0];
        } else if (golongan.equalsIgnoreCase("B")) {
            gajiPokok = gaji[1];
        } else if (golongan.equalsIgnoreCase("C")) {
            gajiPokok = gaji[2];
        } else {
            System.out.println("Golongan tidak valid");
        }

        if (jamLembur == 1) {
            gajiLembur = (int) (lembur[0] * gajiPokok);
        } else if (jamLembur == 2) {
            gajiLembur = (int) (lembur[1] * gajiPokok);
        } else if (jamLembur == 3) {
            gajiLembur = (int) (lembur[2] * gajiPokok);
        } else if (jamLembur == 4) {
            gajiLembur = (int) (lembur[3] * gajiPokok);
        } else if (jamLembur >= 5) {
            gajiLembur = (int) (lembur[4] * gajiPokok);
        } else {
            gajiLembur = 0;
        }

        totalGaji = gajiPokok + gajiLembur;

        System.out.println("Gaji Pokok     : Rp " + gajiPokok);
        System.out.println("Gaji Lembur    : Rp " + gajiLembur);
        System.out.println("Total Gaji     : Rp " + totalGaji);

    }
}