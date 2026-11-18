import java.util.Calendar;
import java.util.GregorianCalendar;

public class IdadeUsuario {
    public static void main(String[] args) throws Exception {
        // Fornecerá o ano atual
        Calendar calendario = GregorianCalendar.getInstance();
        // O objeto calendário fornece o ano atual
        int anoAtual = calendario.get(Calendar.YEAR);
        int anoNascimento = 2008;
        int idade = anoAtual - anoNascimento;
        System.out.println("A idade do usuário é: " + idade + " anos.");
    }

}
