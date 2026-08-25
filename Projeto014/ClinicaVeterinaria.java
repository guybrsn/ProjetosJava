package Projeto014;

import java.sql.Date;

import Projeto014.Excessoes.AnimalJaInternadoException;

public class ClinicaVeterinaria {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Maria Eduarda", "321.245.761-67", "65-996353131", "Rua dois, Nr 35");

        Animal animal01 = new Animal("Clarinha", "Rotvayler", 6, 22);

        Internacao internacao01 = new Internacao(35131, new Date(2026,3,17), 5);

        Procedimento procedimento01 = new Procedimento("Sutura", 55, 200);

        internacao01.adicionarProcedimentoInternacao(procedimento01);

        cliente01.cadastrarAnimal(animal01);
        animal01.setCliente(cliente01);
        animal01.adicionarInternacaoAnimal(internacao01);

        
        try {
            internacao01.internarAnimal(animal01);
        } catch (AnimalJaInternadoException e) {
            e.getMessage();
        }


        System.out.println("Nome: " + cliente01.getNome());
        System.out.println("CPF: " + cliente01.getCPF());
        System.out.println("Telefone: " + cliente01.getTelefone());
        System.out.println("Endereço: " + cliente01.getEndereço());
        System.out.println("Quantidade de animal " + cliente01.quantidadeAnimal());
        System.out.println("Internações");
        animal01.mostrarProcedimentoInternacao(procedimento01);
        internacao01.darAltaAnimal(animal01);


    }
}
