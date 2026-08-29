public class PratoVegano extends Prato{
    
    public PratoVegano(String nome, double precoBase, int estoque){
        super(nome, precoBase, estoque);
    }


    @Override 
    public double calculaPrecoFinal(){
        return getPrecoBase() - (100 * 0.10);
    }

    @Override 
    public void exibirInfo(){
        System.out.println("Detalhes do Prato");    
        System.out.println("Prato: " + getNome());
        System.out.println("Preço R$ " + getPrecoBase());
        System.out.println("Quantidade " + getEstoque());
        System.out.println();
    }
}
