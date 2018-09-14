/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HitungFibonacci;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Tugas01 {
    public static void main(String[] args) {
        
        
        String identitas = "Nadila Amalia Pribadi/XRPL3/29";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah uang:");
        int uang = input.nextInt();
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        int[] nominal = new int[] {100, 500, 1000, 2000, 5000};
        
        
        while(uang >= 5000)
        {
            uang = uang-5000;
            a++;
        }
        System.out.println("Banyak uang 5000 sebanyak: " + a);
        
        while(uang >= 2000)
        {
            uang = uang - 2000;
            b++;
        }
        System.out.println("Banyak uang 2000 sebanyak: " + b);
        
        while(uang >= 1000)
        {
            uang = uang - 1000;
            c++;
        }
        System.out.println("Banyak uang 1000 sebanyak: " + c);
        
        while(uang >= 500)
        {
            uang = uang - 500;
            d++;
        }
        System.out.println("Banyak uang 500 sebanyak: " + d);
        
        while(uang >= 100)
        {
            uang = uang - 100;
            e++;
        }
        System.out.println("Banyak uang 100 sebanyak: " + e);
    }
}
