package lab02;

public class Volumequadrado {
    public static void main(String[] args){
        var lado = Float.parseFloat(args[0]);
        var volume = Math.pow(lado,2);

        
        System.out.println("O vulume para este quadrado é: " + volume);

    }     

}