import java.util.LinkedList;
public class Tugas1strukturdata {
    public static void main(String[] args) {
        // 1. 
        int StrukturBaris = 5;
        // 2.
        String KataBaru = "Reinhad";
        // 3.
        int[] empatAngka = {5, 10, 20, 52};
        // 4.
        String[][] Angka = {
            {"05", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "52"}
        };
        // 5.
        LinkedList<String> listAngka = new LinkedList<>();
        listAngka.add("05");
        listAngka.add("19");
        listAngka.add("44");
        listAngka.add("60");
        listAngka.add("52");
        // tampilan hasil
        System.out.println("Struktur Baris: " + StrukturBaris);
        System.out.println("Kata Baru: " + KataBaru);
        System.out.print("Empat Angka: ");
        for (int i = 0; i < empatAngka.length; i++) {
            System.out.print(empatAngka[i] + " ");
        }
        System.out.println();
        System.out.println("Angka 2 Dimensi array:");
        for (int i = 0; i < Angka.length; i++) {
            for (int j = 0; j < Angka[i].length; j++) {
                System.out.print(Angka[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("LinkedList Angka: " + listAngka);
    }
}