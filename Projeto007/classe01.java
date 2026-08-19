import java.util.ArrayList;


public class classe01 {
    // O Primeiro nome da classe tem que ser o msm nome do arquivo.
    public static void main(String[] args) {
        // Lista dinamica

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Chico2000");
        nomes.add("Maria Eduarda");
        nomes.add("Juliana");

        // acessando os valores dessa lista dinamica.
        // dentro do for para o .size() serve para identificar o tamanho do array.
        for (int i = 0; i < nomes.size(); i+=2){
            System.out.println(nomes.get(i));
        }
        
        // para remover valores da lista
        nomes.remove(0);
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}