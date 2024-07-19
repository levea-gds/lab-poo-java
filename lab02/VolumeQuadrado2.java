package lab02;

import java.util.Scanner;

public class VolumeQuadrado2 {
    
    public static void main(String[]args){
        System.out.println("Informe o lado: ");
        var  sc = new Scanner(System.in);
        var lado = sc.nextInt();
        var  volume = Math.pow(lado,2);
        System.out.println("o volume do quadrado é:" + volume);}

    
}
