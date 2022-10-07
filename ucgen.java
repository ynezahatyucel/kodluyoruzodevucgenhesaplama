import java.util.Scanner;

public class ucgen {

    public static void main(String[] args) {

        double a, b, c, cevre, alan, u;

        Scanner bilgi = new Scanner(System.in);

        System.out.print("1.kenarı giriniz :");
        a=bilgi.nextDouble();

        System.out.print("2.kenarı giriniz :");
        b=bilgi.nextDouble();

        System.out.print("3.kenarı giriniz :");
        c= bilgi.nextDouble();

        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("üçgenin alanı : "+alan);
        


    }
}
