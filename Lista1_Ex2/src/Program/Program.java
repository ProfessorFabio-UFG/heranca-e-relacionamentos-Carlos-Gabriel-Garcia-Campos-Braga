package Program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.Morador;
import Services.CadastrarMoradores;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    

        CadastrarMoradores Moradores = new CadastrarMoradores();

        while(true) {
            System.out.println("O que deseja fazer?");
            System.out.println("1- Cadastrar Morador");
            System.out.println("2- Procurar Morador");
            System.out.println("3- Mostrar Moradores");
            System.out.println("4- Remover Morador");
            System.out.println("5- Sair");

            int escolhaSistema = sc.nextInt();
            sc.nextLine(); 

            switch(escolhaSistema) {
                case 1:
                    System.out.println("Nome: ");
                    String Nome = sc.nextLine();

                    System.out.println("Sexo: ");
                    String Sexo = sc.nextLine();

                    System.out.println("CPF: ");
                    String CPF = sc.nextLine();

                    System.out.println("Data de Nascimento (dd/MM/yyyy): ");
                    String DataNascimentoString = sc.nextLine();

                    DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate DataNascimento = LocalDate.parse(DataNascimentoString, formatacao);

                    System.out.println("Codigo de Acesso: ");
                    int CodigoAcesso = sc.nextInt();
                    sc.nextLine(); 

                    Moradores.addMorador(new Morador(Nome, CPF, DataNascimento, Sexo, CodigoAcesso));

                    System.out.println("Morador adicionado!");
                    System.out.println("Pressione qualquer tecla para voltar ao menu.");
                    sc.nextLine(); 
                    break;

                case 2:
                    System.out.println("Digite o código de acesso do morador que está procurando: ");
                    int codigoAcessoProcurado = sc.nextInt();
                    sc.nextLine(); 

                    Morador moradorProcurado = Moradores.procurarMorador(codigoAcessoProcurado);

                    if(moradorProcurado == null) {
                        System.out.println("Morador não encontrado!");
                    } else {
                        System.out.println("Morador encontrado!");
                        System.out.println(moradorProcurado);
                    }
                    System.out.println("Pressione qualquer tecla para voltar ao menu.");
                    sc.nextLine(); 
                    break;

                case 3:
                    System.out.println("Moradores Cadastrados:");
                    for(Morador m: Moradores.mostrarMoradores()) {
                        System.out.println(m);
                        System.out.println("======================");
                    }
                    System.out.println("Pressione qualquer tecla para voltar ao menu.");
                    sc.nextLine(); 
                    break;

                case 4:
                    System.out.println("Código de acesso do morador que deseja remover: ");
                    int codigoAcessoRemover = sc.nextInt();
                    sc.nextLine(); 

                    boolean moradorRemovido = Moradores.removerMorador(codigoAcessoRemover);

                    if(moradorRemovido) {
                        System.out.println("Morador removido com sucesso!");
                    } else {
                        System.out.println("Morador não encontrado!");
                    }
                    System.out.println("Pressione qualquer tecla para voltar ao menu.");
                    sc.nextLine(); 
                    break;

                case 5:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            
            clearScreen();
        }
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
