import java.util.Optional;

public class Ex_09 {
//    Exercicio 09: Use ifPresent() para imprimir apenas se o valor existir.

    public static void main(String[] args) {
        Optional<String> frase = Optional.of("José");
        Optional<Integer> tamanho = frase.map(String::length);

        tamanho.ifPresent(System.out::println);
    }
}