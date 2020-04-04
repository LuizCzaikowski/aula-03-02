/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Luiz_
 */
public class ContaEspecial extends Conta {
    
    public void emprestimo(Double saldo){
        super.setSaldo(saldo);
        super.setSaldo((super.getSaldo() - 10) + saldo);
    }
}
