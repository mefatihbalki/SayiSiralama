import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);
//Kullanıcı veri girişi
        System.out.print("1. Sayı Giriniz:");
        a = input.nextInt();

        System.out.print("2. Sayı Giriniz:");
        b = input.nextInt();

        System.out.print("3. Sayı Giriniz:");
        c = input.nextInt();
//Kullanıcıdan alınan verilerin koşulları
        if((a<b) && (a<c)){
            if (b<c){
                System.out.println("a<b<c");
            }else{
                System.out.println("a<c<b");
            }
        }else if ((b<a) && (b<c)){
            if (a<c){
                System.out.println("b<a<c");
            }else {
                System.out.println("b<c<a");
            }
        }else {
            if (a<b) {
                System.out.println("c<a<b");
            }else {
                System.out.println("c<b<a");
//Program bitişi
            }
        }
    }
}