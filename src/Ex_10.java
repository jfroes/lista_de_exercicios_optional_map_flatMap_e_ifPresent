import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex_10 {
//    Exercicio 10: Combine lista + Optional: retorne o primeiro elemento se existir.

    public static void main(String[] args) {
        List<Optional<String>> nomes = Arrays.asList(
                Optional.of("José"),
                Optional.empty(),
                Optional.of("Mario")
        );

        Optional<String> primeiro = nomes.getFirst();

        primeiro.ifPresent(System.out::println);

    }
}