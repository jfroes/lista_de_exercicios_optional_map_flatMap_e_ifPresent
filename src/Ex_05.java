import java.util.Optional;

public class Ex_05 {
//    Exercicio 05: Crie méthodo que retorna Optional<Integer> e dobre o valor com map().

    public static void main(String[] args) {
        Optional<Integer> numero = Optional.of(2);
        Integer resultado = numero.map(n -> n * 2).orElse(0);

        System.out.println(resultado);
    }
    }