/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista05;

/**
 *
 * @author Raul
 */
public abstract class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    protected abstract double indiceCustoBeneficio();
    
    @Override
    public int compareTo(Produto outro){
        double dif = this.indiceCustoBeneficio() - outro.indiceCustoBeneficio();
        if(dif > 0) return 1;
        if(dif < 0) return -1;
        return 0;
    }
}
