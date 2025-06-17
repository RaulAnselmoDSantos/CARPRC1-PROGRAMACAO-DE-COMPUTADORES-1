/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista05;

/**
 *
 * @author F1
 */
public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(){
        super();
    }
    @Override
    public double calcularTributos(){
        return getSaldo()*0.01;
    }
}
