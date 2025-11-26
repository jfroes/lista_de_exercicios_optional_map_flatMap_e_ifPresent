import java.util.Optional;

public class Ex_01 {
//    Exercicio 01: Crie um Optional<String> com valor presente e imprima com ifPresent().

    public static void main(String[] args) {
        Optional<String> nome = Optional.of("José");

        nome.ifPresent(System.out::println);
    }
}
