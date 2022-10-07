package br.com.prova3.exercicio;
import java.util.Scanner;
public class Prova {
    public static void main(String[]args) {

        Scanner ler = new Scanner(System.in);

        double valorMensalidade, calculaMensalidade;
        int numeroIrmaos;

        System.out.println("insira o valor da mensalidade");

        valorMensalidade = ler.nextDouble();
        numeroIrmaos = ler.nextInt();
        calculaMensalidade = ler.nextDouble();

        if (numeroIrmaos==1) {
            calculaMensalidade.5%100 = valorMensalidade;
            System.out.println("o valor da mensalidade é: ");
        }
        else if (numeroIrmaos==2) {
            calculaMensalidade.10%100 = valorMensalidade;
            System.out.println("o valor da mensalidade é: ");

        }
        else if (numeroIrmaos>=2) {
            calculaMensalidade.15%100 = valorMensalidade;
            System.out.println("o valor da mensalidade é: ");

        }
        else(numeroIrmaos==0){
            System.out.println("O desconto é de 0");
        }
        System.out.println("o valor da mensalidade é: " + calculaMensalidade);

    }

}


//Se número de irmãos for  igual a 1 → desconto de 5%
//Se número de irmãos for igual a 2 → desconto de 10%
//Se número de irmãos for maior que dois->  desconto de 15%
//Caso o número de irmãos seja 0 → o desconto será zero
