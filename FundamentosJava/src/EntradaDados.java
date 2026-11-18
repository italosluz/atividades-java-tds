import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) throws Exception {
        String nome;
        int idade;
        float altura;

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        // Solicitando dados ao usuário
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.print("Digite sua altura (em metros): ");
        altura = entrada.nextFloat();
        // Fechando o buffer de entrada
        entrada.close();

        // Exibindo os dados coletados
        System.out.println("--- Dados coletados ---");
        System.out.println("- Nome: " + nome);
        System.out.println("- Idade: " + idade);
        System.out.println("- Altura: " + altura);
    }
}

