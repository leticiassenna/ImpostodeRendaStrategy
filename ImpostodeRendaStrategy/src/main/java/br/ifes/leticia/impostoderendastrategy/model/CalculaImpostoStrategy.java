/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.impostoderendastrategy.model;

import br.ifes.leticia.impostoderendastrategy.control.ICalculaImposto;
import br.ifes.leticia.impostoderendastrategy.control.Pessoa;

/**
 *
 * @author Leticia
 */
public abstract class CalculaImpostoStrategy implements ICalculaImposto{
    protected double minimo;
    protected double maximo;
    protected double aliquota;
    
    CalculaImpostoStrategy(double limMinimo, double limMaximo, double aliquota){
        this.minimo = limMinimo;
        this.maximo = limMaximo;
        this.aliquota = aliquota;
    }
    
    public double getMinimo(){
        return this.minimo;
    }
    
    public double getMaximo(){
        return this.maximo;
    }
    
    public double getAliquota(){
        return this.aliquota;
    }
    
    @Override
    public double calcularImpostoRenda(Pessoa pessoa){
        if (pessoa.getReceita() >= this.minimo && pessoa.getReceita() <= this.maximo){
            return pessoa.getReceita() * this.aliquota;
        }
        else{
            throw new UnsupportedOperationException("Salário não pertence a esta aliquota \n" + this.toString());
        }
    }
    
    @Override
    public String toString(){
        return "Informações da aliquota: \n" + 
               "Minimo: R$ " + this.minimo + " - Maximo: R$ " + this.maximo + 
               "Aliquota: " + this.aliquota * 100 + "% \n";
    }
    
}
