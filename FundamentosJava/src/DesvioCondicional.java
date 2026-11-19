import java.util.Scanner;

public class DesvioCondicional {
    /*
    if <(condição)> {
        <instrução 1 executada se a condição for verdadeira>
        <instrução 2 executada se a condição for verdadeira>
        <instrução N executada se a condição for verdadeira>
    }
    <instrução executada após a condição, independente do resultado da condição>
    */

    public static void main(String[] args) throws Exception {
        int numero1, numero2, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();
        entrada.close();

        resultado = numero1 + numero2;

        if (resultado > 10) {
            System.out.println("O resultado da soma dos números é maior que 10.");
        }
    }

}
