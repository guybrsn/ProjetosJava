import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Produto produto01 = new Eletronicos("Celular", 3211.00, 5, 6); 
        //Produto produto02 = new Alimenticio("Arroz", 52.15, 10);
        
        List<Produto> listaProdutos = new ArrayList<>();
        
        listaProdutos.add(produto01);
        //listaProdutos.add(produto02);
        
        for( Produto p : listaProdutos){
            System.out.println("Nome: " + p.getNome());
            System.out.println("Preço R$ " + p.getPreco());
            System.out.println("Quantidade: " + p.getQuantidade());
            
            try{
                p.vender(-1);
                System.out.println("Venda realizada com sucesso.");
            }catch(QuantidadeInvalidaException e){
                System.out.println("Erro de quantidade: " + e.getMessage());
            }

            System.out.println("Preço com desconto R$ " + p.getPreco());
            System.out.println("Quantidade: " + p.getQuantidade());
            System.out.println("");
        }



    }

}