package PraticaDeConceitosNovos;

import java.util.ArrayList;
import java.util.List;
// import java.util.function.Consumer;
// import java.util.function.Function;
// import java.util.function.Predicate;
// import java.util.function.Supplier;

public class Main{
    
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        items.add("maça");
        items.add("banana");
        items.add("morango");
        items.add("uva");   


        // for(String item : items){
        //     System.out.println(item);
        // }

        //item e o parametro que a lambda recebe, -> e o operador separa os parametros da ação, por final o vai ser executado System.out.println(item).
        // quando o corpo tem varias instruções usa-se chaves {}.
        items.forEach(item -> {
            String mensagem = "Fruta: " + item;
            System.out.println(mensagem);
        });

        Acao minhAcao = nome -> System.out.println(nome);

        minhAcao.executar("Pedro");

        //Consumer<String> imprimir = item -> System.out.println(item);

        //Predicate<Integer> minhaIdade = idade -> idade >= 18;

        //Function<String, Integer> tamanho = texto -> texto.length();

        //Supplier<String> mensagem = () -> "Olá";
        
    }
}

