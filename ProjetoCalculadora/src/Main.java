import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int opcao = 0;

        while (opcao != 5) {

            try {

                System.out.println("\n===== CALCULADORA =====");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();

                if (opcao >= 1 && opcao <= 4) {

                    System.out.print("Digite o primeiro número: ");
                    calc.setNumero1(scanner.nextDouble());

                    System.out.print("Digite o segundo número: ");
                    calc.setNumero2(scanner.nextDouble());

                }

                switch (opcao) {

                    case 1:
                        System.out.println("Resultado: " + calc.somar());
                        break;

                    case 2:
                        System.out.println("Resultado: " + calc.subtrair());
                        break;

                    case 3:
                        System.out.println("Resultado: " + calc.multiplicar());
                        break;

                    case 4:
                        System.out.println("Resultado: " + calc.dividir());
                        break;

                    case 5:
                        System.out.println("Encerrando o programa...");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (ArithmeticException e) {

                System.out.println(e.getMessage());

            } catch (Exception e) {

                System.out.println("Erro: entrada inválida.");
                scanner.nextLine(); // limpa entrada inválida

            }

        }

        scanner.close();
    }
}