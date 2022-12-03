import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double result=0;

        System.out.print("Sayı giriniz:");
        n = scan.nextInt();
        for(int i=1;i<=n;i++){

            result += ( 1.0 /i );  // double / integer = double olur.En azından birini double yap.

        }
        System.out.println(result);
    }
}
