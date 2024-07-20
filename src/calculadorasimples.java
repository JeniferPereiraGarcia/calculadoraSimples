import java.util.Scanner;

public class calculadorasimples{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a operação (+, -, *, /)");
        char operacao = scanner.next().charAt(0);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacao){
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0){
                    resultado = numero1/numero2;
                }else{
                    System.out.println("Erro: divisão por zero");
                    return;
                }
                break;
            default:
                System.out.println("ERRO");
                return;
        }
        System.out.println("O resultado da operação é: " + resultado);
        scanner.close();

    }
}