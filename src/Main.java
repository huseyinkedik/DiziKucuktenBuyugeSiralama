import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dizinin boyutu için kullanıcıdan giriş alındı.
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int diziBoyutu = input.nextInt();

        //Dizi tanımlandı.
        int[] list = new int[diziBoyutu];

        //Dizi boyutu kadar eleman giriş istendi.
        for (int i = 0; i < diziBoyutu; i++) {
            System.out.println(i + 1 + ".nolu elemanı giriniz: ");
            int a = input.nextInt();
            list[i] = a;
        }

        //Dizi elemanları sıralandı ve yazdırıldı
        Arrays.sort(list);
        for (int i = 0; i < diziBoyutu; i++) {
            System.out.println(i + 1 + ". Elemanı: " + list[i]);

        }
        System.out.print("sıralama: " + Arrays.toString(list));

    }

}


