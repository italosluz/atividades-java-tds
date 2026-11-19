public class EstruturasCondicionais {
    public static void main(String[] args) throws Exception {
        int num1 = 10, num2 = 20, num3 = 30;
        System.out.println(num1 > num2); // false
        System.out.println(num2 < num3); // true
        System.out.println(num1 == num3); // false
        System.out.println(num1 != num2); // true
        // Operadores lógicos
        System.out.println(num1 > num2 && num2 < num3); // false
        System.out.println(num1 < num2 || num2 > num3); // true

        String valorA = "Este é um texto";
        String valorB = "Este é outro texto";
        String valorC = new String("Este é outro texto");
        // comparando valorA e valorB
        System.out.println(valorA.equals(valorB));// false
        // comparando valorA com um texto equivalente
        System.out.println(valorA.equals("Este é um texto"));// true
        // comparando valores dos objetos
        System.out.println(valorB.equals(valorC));// true
        // comparando objetos, e não valores
        System.out.println(valorB == valorC);// false
    }
}
