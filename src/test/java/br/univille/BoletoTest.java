package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BoletoTest {

    private Boleto boleto;
   
    @DisplayName("Testa mil reais menos o desconto")
    @Test
    public void testaMilReaisMenosDesconto(){
        boleto = new Boleto(1000,10,10,10);
        assertEquals(900, boleto.pagar(10));
    }

    @DisplayName("Testa mil reais mais a multa")
    @Test
    public void testaMilReaisMaisMulta(){
        boleto = new Boleto(1000,10,10,10);
        assertEquals(1100, boleto.pagar(11));
    }

    @DisplayName("Testa menos cem reais mais a multa")
    @Test
    public void testaMenosCemReaisMaisMulta(){
        boleto = new Boleto(-100,10,2,3);
        assertEquals(-103, boleto.pagar(14));
    }
    
    //REVER COM O SOR (-2)
    @DisplayName("Testa cem reais mais a multa")
    @Test
    public void testaCemReaisMaisMulta(){
        boleto = new Boleto(100,10,2,3);
        assertEquals(98, boleto.pagar(-2));
    }


}

