/* 

** Desafio

Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.


** Entrada

O arquivo de entrada contém um número inteiro positivo N.


** Saída

Imprima a saída conforme o exemplo fornecido.

*/

import java.io.IOException;
import java.util.Scanner;

public class NumeroQuadradoCubo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 1; i <= N; i++) {
            //TODO: Complete os espaços em branco para obter o quadrado e o cubo de "i".
            int iAoQuadrado = (int) Math.pow(i ,  2);
            int iAoCubo = (int) Math.pow(i , 3);
            System.out.println(i + " " +  iAoQuadrado + " " +  iAoCubo);
        }
    }

}