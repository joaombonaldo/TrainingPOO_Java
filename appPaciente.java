package Avaliação;
import java.util.*;
public class appPaciente {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String nome;
        char sexo;
        double peso = 0, altura = 0;
        int idade;
        
        System.out.println("--- Começo ---");
        do {
            System.out.println("Nome do paciente: ");
            nome = teclado.nextLine();
            if (nome == "") System.out.println("Nome inválido. Digite novamente.");
        } while (nome == "");

        do {
            System.out.println("Sexo do paciente - Use (M) ou (F)");
            sexo = teclado.next().toUpperCase().charAt(0);
            if (sexo != 'M' && sexo != 'F') System.out.println("Sexo inválido. Digite novamente.");
        } while (sexo != 'M' && sexo != 'F');

        Paciente p1 = new Paciente(nome, sexo);

        int op = 1;
        while (op == 1){
            System.out.println("\n" + p1.toString());
            System.out.println("\n--- MENU ---");
            System.out.println("(1) - Alterar Informações do Paciente;");
            System.out.println("(2) - Calcular IMC do Paciente;");
            System.out.println("(3) - Calcular o Peso Ideal do Paciente;");
            System.out.println("(4) - Calcular a Faixa de Risco conforme o IMC do Paciente;");
            int opMenu = teclado.nextInt();

            switch (opMenu){
                case 1:
                System.out.println("--- Alterar Informações ---");
                System.out.println("Qual informação você deseja alterar? ");
                System.out.println("(1) - Nome ");
                System.out.println("(2) - Sexo ");
                System.out.println("(3) - Peso ");
                System.out.println("(4) - Altura ");
                System.out.println("(5) - Idade ");
                int opCase1 = teclado.nextInt();
                switch (opCase1){
                    case 1:
                    do{
                        System.out.println("--- Alterar Nome ---");
                        System.out.print("Digite o novo nome do Paciente: ");
                        nome = teclado.nextLine();
                        p1.setNome(nome);
                        if (p1.setNome(nome) == false) System.out.println("Nome inserido é inválido!");
                    } while (p1.setNome(nome) == false);
                    break;

                    case 2:
                    do{
                        System.out.println("--- Alterar Sexo ---");
                        System.out.print("Digite o novo sexo do Paciente: ");
                        sexo = teclado.next().toUpperCase().charAt(0);
                        p1.setSexo(sexo);
                        if (p1.setSexo(sexo) == false) System.out.println("Sexo inserido não é válido!");
                    } while (p1.setSexo(sexo) == false);
                    break;

                    case 3:
                    do {
                        System.out.println("--- Alterar Peso ---");
                        System.out.print("Digite o novo peso do Paciente: ");
                        peso = teclado.nextDouble();
                        p1.setPeso(peso);
                        if (p1.setPeso(peso) == false) System.out.println("Peso inserido não é válido!");
                    } while (p1.setPeso(peso) == false);
                    break;

                    case 4:
                    do{
                        System.out.println("--- Alterar Altura ---");
                        System.out.print("Digite a nova altura do Paciente: ");
                        altura = teclado.nextDouble();
                        p1.setAltura(altura);
                        if (p1.setAltura(altura) == false) System.out.println("Altura inserida não é válida!");
                    } while (p1.setAltura(altura) == false);
                    break;

                    case 5:
                    do{
                        System.out.println("--- Alterar Idade ---");
                        System.out.print("Digite a nova idade do Paciente: ");
                        idade = teclado.nextInt();
                        p1.setIdade(idade);
                        if (p1.setIdade(idade) == false) System.out.println("Idade inserida não é válida!");
                    } while (p1.setIdade(idade) == false);
                    break;

                    default:
                    System.out.println("Opção Inválida!");
                    break;
                }
                break;

                case 2:
                System.out.println("--- Calcular IMC ---");
                if (peso != 0 && altura != 0){
                    System.out.println("IMC do Paciente: " + p1.imc());
                } else {
                    System.out.println("Você não definiu o PESO e a ALTURA do paciente!");
                }
                break;

                case 3:
                System.out.println("--- Calcular Peso Ideal ---");
                if (altura != 0){
                    System.out.println("Peso Ideal do Paciente: " + p1.pesoIdeal());
                } else {
                    System.out.println("Você não definiu a ALTURA do paciente!");
                }
                break;

                case 4:
                System.out.println("--- Calcular a Faixa de Risco conforme o IMC ---");
                if (peso != 0 && altura != 0) {
                    System.out.println("Faixa de Risco do Paciente: " + p1.faixaRisco());
                } else {
                    System.out.println("Você não definiu o PESO e a ALTURA do paciente!");
                }
                break;

                default:
                System.out.println("Opção Inválida!");
                break;
            }

            do{
                System.out.println("\nVocê deseja continuar? \n(0) - Sair \n(1) - Continuar");
                op = teclado.nextInt();
                if (op != 1 && op != 0) System.out.println("Opção Inválida. Digite novamente.");
            } while (op != 1 && op != 0);
        }

        System.out.println("\nPrograma Encerrado.");
    }
}
