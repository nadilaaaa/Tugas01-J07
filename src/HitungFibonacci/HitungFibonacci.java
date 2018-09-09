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
public class HitungFibonacci {
    public static void main(String[] args) {
        String identitas = "Nadila Amalia Pribadi / XRPL3 / 29";
        tampilJudul(identitas);
        
        int n = tampilInput();
    }
    
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas: " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ...dst.\n");
    }
    
    private static int tampilInput() {
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Bilangan ke- ");
        int n = baca.nextInt();
        
        return n;
    }
}
