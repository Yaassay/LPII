//Escreva um programa em Java que calcule o fatorial de um número fornecido pelo usuário.


public class Fatorial {
    public static void main(String[] args){
        int n = 5;
        int resultado = 1;
        int i;
        for(i = n; i >= 1; i--){
            resultado *= i;
        }
        System.out.println(resultado);
    }
}
