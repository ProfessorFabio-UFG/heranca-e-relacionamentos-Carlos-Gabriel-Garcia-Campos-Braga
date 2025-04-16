package Program;

import Entities.Apartamento;
import Entities.Morador;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Criando 2 moradores
        Morador morador1 = new Morador(
                "Maria Oliveira",
                "123.456.789-00",
                "(11) 99999-0000",
                LocalDateTime.of(1990, 5, 10, 0, 0),
                'F',
                1,
                101,
                "A123"
        );

        Morador morador2 = new Morador(
                "João Silva",
                "987.654.321-00",
                "(11) 98888-1111",
                LocalDateTime.of(1988, 8, 20, 0, 0),
                'M',
                1,
                101,
                "B456"
        );

        // Criando um apartamento
        Apartamento ap101 = new Apartamento(101, 1, 75.5, "Quitado");

        // Adicionando os moradores ao apartamento
        ap101.addMorador(morador1);
        ap101.addMorador(morador2);

        // Exibindo os dados do apartamento com os moradores
        System.out.println(ap101);
    }
}
