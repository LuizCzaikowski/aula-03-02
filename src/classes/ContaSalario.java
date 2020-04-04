/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.Scanner;
/**
 *
 * @author Luiz_
 */
public class ContaSalario extends Conta {
    int valor;
    
    public void deposito(Double deposito) throws Exception {
        Scanner escolha = new Scanner(System.in);
        System.out.println("Fez mais que 2 depósitos hoje? Digite 2 para sim e 1 para não");
        valor = escolha.nextInt();
        if(valor >= 2){
            throw new ContaException("Depósitos excedidos");
        } else {
            super.setSaldo(deposito);
        }
    }
}
