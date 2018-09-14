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
public class Tugas02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String identitas = "Nadila Amalia Pribadi/XRPL3/29";
        
        double total;
        
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. C");
        System.out.println("4. D");
        System.out.println("5. E");
        System.out.println("Jenis Barang: (1/2/3/4/5)");
        double jenis = input.nextDouble();
        
        System.out.println("");
        
        System.out.print("Masukkan berat barang: ");
        double berat = input.nextDouble();
        
        System.out.println("");
    }
}

