import java.util.Optional;

public class Ex_08 {
//    Exercicio 08: Converta Optional<String> para Optional<Integer> usando map().

    public static void main(String[] args) {
        Optional<String> frase = Optional.of("José");
        Optional<Integer> tamanho = frase.map(String::length);

    }
}