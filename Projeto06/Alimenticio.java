public class Alimenticio extends Produto{
    
    public Alimenticio(String nome, double preco, int quantidadeEstoque){
        super(nome, preco, quantidadeEstoque);
    }

    @Override
    public int vender(int quantidadeVendida) throws QuantidadeInvalidaException{
        if (quantidadeVendida <= 0) {
            throw new QuantidadeInvalidaException("Quantidade deve ser maior que zero.");
        }
        setQuantidade(getQuantidade() - quantidadeVendida);

        return getQuantidade();
    }

    @Override
    public double calcularDesconto(){
        setPreco(getPreco() - (100 * 0.001));
        return getPreco();
    }


}
