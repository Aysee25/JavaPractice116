package day08;

import java.util.Scanner;

public class nextline_atlamaSorunu {
    public static void main(String[] args) {

        Scanner mb=new Scanner(System.in);
        System.out.println("Lutfen Adinizi ve Soyadinizi Giriniz:");
        String name=mb.nextLine();

        System.out.println("Lutfen Yasinizi Giriniz :");
        int age=mb.nextInt();
        //satır sonu sonu arabbellekte kalan bosluk kullanılmalıdır. Bunun için boş bir nextline kullanarak sorun çözülüyor.
        mb.nextLine();

        System.out.println("Lutfen mesleginizi giriniz:");
        String job=mb.nextLine();

    }
}
