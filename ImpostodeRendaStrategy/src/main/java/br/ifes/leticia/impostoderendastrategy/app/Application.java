/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.impostoderendastrategy.app;

import br.ifes.leticia.impostoderendastrategy.control.Pessoa;
import br.ifes.leticia.impostoderendastrategy.model.CalculoImposto;

/**
 *
 * @author Leticia
 */
public class Application {
    public static void main(String [] args){
        CalculoImposto calculoImposto;
        Pessoa pessoa = new Pessoa(2000.00);
        calculoImposto = new CalculoImposto(pessoa);
        
        pessoa = new Pessoa(-200);
        calculoImposto = new CalculoImposto(pessoa);
    }
}
