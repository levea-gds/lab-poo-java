package lab02;

import java.util.Scanner;

public class NotaConceito{
    public static void main(String[] args){
    var sc = new Scanner(System.in);
    System.out.println("Digite uma nota de (0-100) que voce deseja converter");
    var nota = sc.nextInt();

    if (nota>= 91 && nota <= 100 ){
        System.out.println("Conceito A");
    } else if (nota>= 81 && nota <= 90){
        System.out.println("Conceito B"); 
    } else if (nota>= 71 && nota <= 80){
    System.out.println("Conceito C"); {    
    } } else{
        System.out.println("Nota fora de intervalo!"); 
    }

}
}