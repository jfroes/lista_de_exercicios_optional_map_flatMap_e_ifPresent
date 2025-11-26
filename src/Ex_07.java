import java.util.Optional;

public class Ex_07 {
//    Exercicio 07: Crie Optional<String> e verifique se contém determinada substring.

    public static void main(String[] args) {
        Optional<String> frase = Optional.of("Pralelepipedo paralelo paradoxal");
        String result = frase.filter(f -> f.contains("amanhã")).orElse("Não tem");

        System.out.println(result);
    }
}