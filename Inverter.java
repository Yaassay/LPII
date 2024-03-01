//Escreva um programa em Java que inverta uma string fornecida pelo usuário e exiba o resultado.
public class Inverter{
    public static void main(String[] args ){
        String palavra = "Manteiga";
        int tamamho = palavra.length();

        for(int i = (tamamho-1); i>= 0; i--){
            System.out.print(palavra.charAt(i));
        }
        System.out.println();
    }}