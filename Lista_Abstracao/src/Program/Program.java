package Program;

import java.util.Scanner;
import Entities.Produto;

public class Program {
    public static void main(String[] args) {
        


        Produto p1 = new Produto(1);
        p1.Inserir("Jogo Batalha Naval", 10, "jogo", 100.00);

        Produto p2 = new Produto(2, "Jogo Master", 20);
        p2.Inserir("Jogo Master", 20, "jogo", 150.00);

        Produto p3 = new Produto(3, "Jogo Quebra-Cabeça", 30, "jogo", 50.00);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());


        System.out.println("\nVendendo 5 unidades de " + p1.Nome);
        double valorVenda = p1.Vender(5);
        System.out.println("Valor total da venda: R$" + valorVenda);
        System.out.println("Estoque atualizado: " + p1.toString());


        System.out.println("\nComprando 10 unidades de " + p2.Nome);
        p2.Comprar(10, 140.00);
        System.out.println("Estoque atualizado: " + p2.toString());


        System.out.println("\nComparando produtos");
        boolean saoIguais = p1.Igual(p2);
        System.out.println("Os produtos " + p1.Nome + " e " + p2.Nome + " são iguais? " + saoIguais);
    }
}
