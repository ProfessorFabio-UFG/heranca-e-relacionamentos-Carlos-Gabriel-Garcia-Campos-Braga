package Program;

import Entities.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== FUNCIONÁRIO: CAIXA DE BANCO ===");
        CaixaBanco caixa = new CaixaBanco("Fernanda Alves", "(11) 96666-9999", 1002, 4000.00, LocalDateTime.of(2025, 4, 16, 8, 0));
        System.out.println("Antes do aumento:");
        System.out.println(caixa);

        caixa.AumentoSalario(0.10); 
        System.out.println("\nApós aumento de 10%:");
        System.out.println(caixa);

        System.out.println("\n=== FUNCIONÁRIO: GERENTE ===");
        Gerente gerente = new Gerente("Carlos Lima", "(11) 97777-8888", 1001, 8000.00, 0.10, "Administrativo");
        System.out.println("Antes do aumento:");
        System.out.println(gerente);

        gerente.AumentoSalario(0.20); 
        System.out.println("\nApós aumento de 20%:");
        System.out.println(gerente);

        System.out.println("\n=== CLIENTES ===");
        Cliente cliente1 = new Cliente("Maria Souza", "(11) 98888-7777", 30, "123.456.789-00");
        Cliente cliente2 = new Cliente("João Silva", "(11) 97777-6666", 45, "987.654.321-00");
        Cliente cliente3 = new Cliente("Ana Pereira", "(11) 96666-5555", 25, "111.222.333-44");

        
        cliente2.InativarStatus();

       
        System.out.println("\nCliente 1:");
        System.out.println(cliente1);

        System.out.println("\nCliente 2 (desativado):");
        System.out.println(cliente2);

        System.out.println("\nCliente 3:");
        System.out.println(cliente3);
    }
}
