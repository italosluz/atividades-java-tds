import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) throws Exception {
        /*
        Tipo[] nomeDoVetor = new Tipo[tamanho];
        Tipo[] nomeDoVetor = {valor1, valor2, valor3, ...};
        */
        int qtdAluno, qtdAcimaMedia = 0;
        float mediaNotas = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        qtdAluno = entrada.nextInt();

        System.out.println("---- ---- ---- ----");

        float[] notas = new float[qtdAluno];

        for (int i = 0; i < qtdAluno; i++) {
            System.out.print("Qual a nota do " + (i+1) + "ª aluno? ");
            notas[i] = entrada.nextFloat();
            mediaNotas += notas[i];
        }

        entrada.close();

        mediaNotas /= qtdAluno;
        System.out.println("---- ---- ---- ----");
        System.out.println("A média da turma é " + mediaNotas + " pts.");
        System.out.println("---- ---- ---- ----");

        for (int i = 0; i < qtdAluno; i++) {
            if (notas[i] > mediaNotas) {
                System.out.println("- O " + (i+1) + "ª aluno está acima da média com " + notas[i] + " pts.");
                qtdAcimaMedia++;
            }
        }
        System.out.println("---- ---- ---- ----");

        float aproveitamento = (( (float) qtdAcimaMedia / qtdAluno) * 100);

        System.out.println("Sua turma teve " +qtdAcimaMedia+ " alunos acima da média! Um aproveitamento de " + aproveitamento + "%");

    }
}
