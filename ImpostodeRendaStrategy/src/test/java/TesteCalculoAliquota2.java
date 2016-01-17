/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.leticia.impostoderendastrategy.control.ICalculaImposto;
import br.ifes.leticia.impostoderendastrategy.control.Pessoa;
import br.ifes.leticia.impostoderendastrategy.model.Aliquota2;
import br.ifes.leticia.impostoderendastrategy.model.CalculaImpostoStrategy;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leticia
 */
public class TesteCalculoAliquota2 {
    
    public TesteCalculoAliquota2() {
    }
    
    @Test
    public void TestCalculoAliquota2(){
        Pessoa pessoa = new Pessoa(2000.00);
        ICalculaImposto calculaImposto = new Aliquota2();
        double imposto = calculaImposto.calcularImpostoRenda(pessoa);
        
        Assert.assertEquals(150.0, imposto, 0.0001);
    }

    @Test
    public void TestAliquota2Max(){
        CalculaImpostoStrategy calculaImposto = new Aliquota2();
        
        Assert.assertEquals(2563.91, calculaImposto.getMaximo(), 0.0001);
    }
    
    @Test
    public void TestAliquota2Min(){
        CalculaImpostoStrategy calculaImposto = new Aliquota2();
        
        Assert.assertEquals(1710.79, calculaImposto.getMinimo(), 0.0001);
    }
    
    @Test
    public void TestAliquota2Porcento(){
        CalculaImpostoStrategy calculaImposto = new Aliquota2();
        
        Assert.assertEquals(0.075, calculaImposto.getAliquota(), 0.0001);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
