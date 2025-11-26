import java.util.Optional;

public class Ex_04 {
//    Exercicio 04: Crie Optional<Double> e use orElseGet() para valor padrão.

    public static void main(String[] args) {
        Optional<Double> numero = Optional.of(2.0);
        Double resultado = numero.orElseGet(() -> 0.0);

        System.out.println(resultado);
    }
    }