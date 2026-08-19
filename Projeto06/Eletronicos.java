public class Eletronicos extends Produto{
    
    private int garantia;

    public Eletronicos(String nome, double preco, int quantidadeEstoque, int garantia){
        super(nome, preco, quantidadeEstoque);
        this.garantia = garantia;
    }

    @Override
    public int vender(int quantidadeVendida) throws QuantidadeInvalidaException{
        if (quantidadeVendida <= 0){
            throw new QuantidadeInvalidaException("Quantidade deve ser maior que zero.");    
        }
        setQuantidade(getQuantidade() - quantidadeVendida);

        return getQuantidade();
    }

    @Override
    public double calcularDesconto(){
        setPreco(getPreco() - (100 * 0.1));
        return getPreco();
    }


    public int getGarantia(){
        return this.garantia;
    }
}
