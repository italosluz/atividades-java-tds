public class TiposDeDados {
    public static void main(String[] args) throws Exception {
        System.out.println(
            "Tipos de Dados em Java:" +
            "\n - Menor tipo de dado de byte: " + Byte.MIN_VALUE + " e maior: " + Byte.MAX_VALUE +
            "\n - Menor tipo de dado de short: " + Short.MIN_VALUE + " e maior: " + Short.MAX_VALUE +
            "\n - Menor tipo de dado de int: " + Integer.MIN_VALUE + " e maior: " + Integer.MAX_VALUE +
            "\n - Menor tipo de dado de long: " + Long.MIN_VALUE + " e maior: " + Long.MAX_VALUE +
            "\n - Menor tipo de dado de float: " + Float.MIN_VALUE + " e maior: " + Float.MAX_VALUE +
            "\n - Menor tipo de dado de double: " + Double.MIN_VALUE + " e maior: " + Double.MAX_VALUE
        );
        TiposDeDados.mesesVivo(null);
        TiposDeDados.celsiusParaFahrenheit(null);
        TiposDeDados.areaCirculo(null);
        TiposDeDados.nomePessoa(null);
    }

    public static void mesesVivo(String[] args) throws Exception {
        int idade = 18;
        int meses = idade * 12;
        System.out.println("Você viveu " + meses + " meses.");
    }

    public static void celsiusParaFahrenheit(String[] args) throws Exception {
        float celsius = 20, fahrenheit, kelvin;
        fahrenheit = celsius * 1.8f + 32;
        kelvin = celsius + 273.15f;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(celsius + "°C = " + kelvin + "K");
    }

    public static void areaCirculo(String[] args) throws Exception {
        final float PI = 3.14f;
        float diametro = 20, raio, area;
        raio = diametro / 2;
        area = PI * (raio * raio);
        System.out.println("A área do círculo é: " + area + " cm²");
    }

    public static void nomePessoa(String[] args) throws Exception {
        /* A partir do nome de uma pessoa, 
        verifique o tamanho do nome comple
        to e extraia o primeiro nome, igno
        rando os sobrenomes. */
        String nomeCompleto = "Ítalo da Silva Luz", primeiroNome, tamanhoNome;
        primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
        tamanhoNome = primeiroNome.length() + " caracteres";
        System.out.println("O primeiro nome é: " + primeiroNome + " e possui " + tamanhoNome);
    }
}
