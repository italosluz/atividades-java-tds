import java.util.Scanner;

public class OperacoesBasicas {
    public static void main(String[] args) throws Exception {
        float num1, num2, soma, subtracao, multiplicacao, divisao;
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextFloat();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextFloat();
        entrada.close(); // Fechando o buffer de entrada

        // Realizando operações básicas
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        // Exibindo os resultados
        System.out.println("OPERAÇÕES BÁSICAS");
        System.out.println("- Soma: " + soma);
        System.out.println("- Subtração: " + subtracao);
        System.out.println("- Multiplicação: " + multiplicacao);
        System.out.println("- Divisão: " + divisao);
    }
}