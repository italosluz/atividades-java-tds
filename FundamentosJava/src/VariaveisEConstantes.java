public class VariaveisEConstantes {
    public static void main(String[] args) throws Exception {
        // Para variávies: <tipo> NOME = <valor>;
        // Para constantes: final <tipo> NOME = <valor>;
        final float PI = 3.14f; // constante
        final double E = 1.243e2; // constante
        String nome = "Ítalo Luz";
        int lote = 7890;
        boolean aprovado = true;

        E = 1.48e2; // Erro: não é possível alterar o valor de uma constante

        System.out.println("Nome: " + nome);
        System.out.println("Lote: " + lote);
        System.out.println("Aprovado: " + aprovado);
        System.out.println("Valor de PI: " + PI);
        System.out.println("Valor de E: " + E);
    }
}
