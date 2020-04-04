package programa;

import classes.Conta;
import classes.ContaEspecial;
import classes.ContaSalario;



public class Programa {
    public static void main(String[] args) {
        try {
            Conta conta = new Conta();
            ContaEspecial conta2 = new ContaEspecial();
            ContaSalario conta3 = new ContaSalario();
            conta.setTitular("Joao da Silva");
            conta.setNumero("12346");
            conta.depositar(100d);
            conta2.emprestimo(100d);
            conta3.deposito(250d);
            System.out.println(String.format("Titular da conta: %s \n" +
                    "Numero da conta: %s \n" +
                    "Saldo da conta %f \n", conta.getTitular(), conta.getNumero(), conta2.getSaldo()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
