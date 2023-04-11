package segitigaterbalik;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class segitigaterbalik {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // Membuat Segitiga Bintang Terbalik Dengan Inputan
            int m = 0;
            System.out.print("Masukan Jumlah : ");
            m = Integer.parseInt(br.readLine());

            for (int i = 0; i <= m; i++) {

                for (int j = i; j < m; j++) {
                    System.out.print("* ");

                }
                System.out.println();
            /*}
            //Membuat Segitiga Bintang Terbalik Tanpa Inputan
            for (int i = 0; i < 5; i++) {
                for (int j = i; j < m; j++) {
                    System.out.print("* ");
                }
                System.out.println();*/
            }
        }
}
