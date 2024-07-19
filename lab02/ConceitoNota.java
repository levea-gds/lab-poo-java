import java.util.Scanner;

public class ConceitoNota{
    public static void main(String[] args){
    var sc = new Scanner(System.in); 
    System.out.println("Digite um conceito entre (A,B,C,D,E ou F) que voce deseja converter");
    var conceito = sc.next();
    switch (conceito) {
        case "A" -> System.out.println("nota = 100");
        case "B" -> System.out.println("nota = 90");
        case "C" -> System.out.println("nota = 80");
        case "D" -> System.out.println("nota = 70");
        case "E" -> System.out.println("nota = 60");
        case "F" -> System.out.println("nota = 50");

    }
    sc.close();

}
}
