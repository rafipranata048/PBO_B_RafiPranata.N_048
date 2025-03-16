import java.util.Scanner; //digunakan mengimpor kelas scanner yg digunakan untuk membaca input dr user
import java.time.LocalDate; //digunakan untuk mengimpor kelas LocalDate yg berfungsi mendapatkan tahun saat ini

public class Main {//mendeklarasikan kelas utama dgn nama DataDiri
    public static void main(String[] args){ //metode utama yg akan dieksekusiketika program pertamakali berjalan
        Scanner scanner = new Scanner(System.in);//digunakan untuk membaca input pengguna

        System.out.print("Masukan nama: ");//mengeluarkan output untuk memberi instruksi user untuk memasukan nama
        String nama = scanner.nextLine();//membaca input berupa string

        System.out.print("Masukan jenis kelamin (P/L:) ");//mengeluarkan output untuk memberi instruksi user untuk memasukan jenis kelamin
        char kelamin = scanner.next().charAt(0);// membaca input string pertama

        System.out.print("Masukan tahun lahir: ");//mengeluarkan output untuk memberi instruksi agar memasukan tahun lahir
        int tahunlahir = scanner.nextInt();//membaca input dari user yg berupa integer

        int tahunini = LocalDate.now().getYear();//mendeklarasikan variabel tahunini yang memiliki tipe data integer yang berfungsi untuk Mendapatkan tahun saat ini
        int umur = tahunini - tahunlahir;//mendeklarasikan variabe umur yg memiliki tipe data integer yg berfungsi untuk menghitung umur dengan mengurangi tahun sekarang dengan tahun lahir.


        String jenisKelamin;//digunakan untuk menyimpan hasil pilihan jenis kelamin yang berupa string
        if (kelamin == 'P' || kelamin == 'p') {//pengkondisian if, jika user memasukan P\p maka akan keluar perempuan
            jenisKelamin = "Perempuan";
        } else if (kelamin == 'L' || kelamin == 'l') {//pengkondisian else if, jika user memasukan L\l maka akan keluar laki laki
            jenisKelamin = "Laki-laki";
        }else {// pengkondisian else jika ke 2, kondisi diatas tidak terpenuhi maka baris ini yg akan ter eksekusi
            jenisKelamin = "Jenis kelamin hanya 2, laki-laki dan perempuan";
        }
        System.out.println("Nama: "  + nama); //menampilkan hasil inputan nama
        System.out.println("Jenis kelamin: " + jenisKelamin);//menampilkan hasil inputan jenis kelamin
        System.out.println("Umur: " + umur);//menampilkan hasil umur setelah tahun sekarang dikurangi tahun lahir

        scanner.close();//menutup scanner
    }

}