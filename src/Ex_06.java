import java.util.Optional;

public class Ex_06 {
//    Exercicio 06: Use filter() dentro do Optional para validar idade ≥ 18.

    public static void main(String[] args) {
        Optional<Integer> idade = Optional.of(26);
        Optional<Integer> maiorDeIdade = idade.filter(i -> i >= 18);

        }
    }