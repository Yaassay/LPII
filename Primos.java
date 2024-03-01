//Escreva um programa em Java que verifique se um número fornecido pelo usuário é primo ou não.
public class Primos{
    public static void main(String[] args){
    int n = 9;
    boolean primo = true;
    int i;
    for (i = 2; i < n; i++){
        if(n % i == 0){
            primo = false;
            break;

}}
    if(primo)
        System.out.println("Esse n é primo");
    else
        System.out.println("Esse n não é primo");

}}