import java.util.Optional;

public class Ex_03 {
//    Exercicio 03: Use map() para transformar o valor em maiúsculas.

    public static void main(String[] args) {
        Optional<String> nome = Optional.of("José");

        String resultado = nome.map(String::toUpperCase).orElse("Valor Padrão").toUpperCase();

        System.out.println(resultado);
    }
}
