package PraticaDeConceitosNovos;

public class Clientes {

     private int id;
     private String nome;
     private String gmail;
     
     public Clientes(int id, String nome, String gmail) {
        this.id = id;
        this.nome = nome;
        this.gmail = gmail;
     }

     public int getId() {
         return id;
     }

     public String getNome() {
         return nome;
     }

     public String getGmail() {
         return gmail;
     }

     
}
