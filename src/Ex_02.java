import java.util.Optional;

public class Ex_02 {
//    Exercicio 02: Crie um Optional vazio e use orElse("valor padrão").

    public static void main(String[] args) {
        Optional<String> nome = Optional.empty();

        String resultado = nome.orElse("Valor Padrão");

        System.out.println(resultado);
    }
}
