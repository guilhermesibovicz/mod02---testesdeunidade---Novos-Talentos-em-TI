package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlanejadorDeChurrascoTest {

    private PlanejadorDeChurrasco plan;
    @BeforeEach
    public void paraCada(){
        plan = new PlanejadorDeChurrasco();
    }

    @DisplayName("Teste planejador de churrasco com um adulto e zero crianças")
    @Test
    public void testaUmAdultoeZeroCrianca(){
        plan.setAdulto(1);
        plan.setCrianca(0);
        assertEquals(250f, plan.calculaQtdCarne());
    }

    @DisplayName("Teste planejador de churrasco com 0 adultos e uma criança")
    @Test
    public void testazeroAdultoeUmaCrianca(){
        plan.setAdulto(0);
        plan.setCrianca(1);
        assertEquals(100, plan.calculaQtdCarne());
    }

    @DisplayName("Teste planejador de churrasco com dois adultos e menos uma criança")
    @Test
    public void testaDoisAdultoseMenosUmaCrianca(){
        plan.setAdulto(2);
        plan.setCrianca(-1);
        assertEquals(500, plan.calculaQtdCarne());
    }

    @DisplayName("Teste planejador de churrasco com menos um adulto e duas crianças")
    @Test
    public void testaMenosUmAdultoeDuasCriancas(){
        plan.setAdulto(-1);
        plan.setCrianca(2);
        assertEquals(200, plan.calculaQtdCarne());
    }

    @DisplayName("Teste planejador de churrasco com menos um adulto e menos uma criança")
    @Test
    public void testaMenosUmAdultoeMenosUmaCrianca(){
        plan.setAdulto(-1);
        plan.setCrianca(-1);
        assertEquals(0, plan.calculaQtdCarne());
    }
}
