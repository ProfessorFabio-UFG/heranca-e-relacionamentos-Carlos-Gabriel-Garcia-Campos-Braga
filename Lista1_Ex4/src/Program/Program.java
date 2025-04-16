package Program;

import Entities.Robo;

public class Program {

	public static void main(String[] args) {
        
        Robo robo1 = new Robo(1, 100);
        Robo robo2 = new Robo(2, 150);

        System.out.println("====== Robô 1 ======");
        try {
            robo1.LigarRobo();
            System.out.println(robo1);

            robo1.Andar(3, 4);
            System.out.println(robo1);

            robo1.Aspirar(30);
            System.out.println(robo1);

            robo1.Parar();
            System.out.println(robo1);

            robo1.DesligarRobo();
            System.out.println(robo1);

        } 
        catch (Exception e) 
        {
            System.out.println("Erro no Robô 1: " + e.getMessage());
        }

        System.out.println("\n====== Robô 2 ======");
        try 
        {
            robo2.LigarRobo();
            System.out.println(robo2);

            robo2.Andar(5, 2);
            System.out.println(robo2);

            robo2.Aspirar(80);
            System.out.println(robo2);

            robo2.Aspirar(90); 
            System.out.println(robo2);

            robo2.Parar(); 
            System.out.println(robo2);

        } 
        catch (Exception e) 
        {
            System.out.println("Erro no Robô 2: " + e.getMessage());
        }
    }

}
