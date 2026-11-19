import java.util.Scanner;

public class EstruturasRepeticao {
    /*
     for (inicialização; condição; incremento ou decremento) {
        // bloco de código a ser executado enquanto a condição for verdadeira
        }
    */

        public static void main(String[] args) throws Exception {
            int numero, resultado, contador;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite um número para ver sua tabuada: ");
            numero = entrada.nextInt();
            entrada.close();
            System.out.println("\nTabuada do " + numero + ":");


            for (contador = 1; contador <= 10; contador++) {
                resultado = numero * contador;
                System.out.println(numero + " x " + contador + " = " + resultado);
            }
        }
}
