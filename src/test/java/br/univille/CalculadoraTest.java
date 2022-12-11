package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calc;
    @BeforeEach
    public void paraCada(){
        calc = new Calculadora();
    }

    //Annotation
    @DisplayName("Testa soma do valor dois com dois")
    @Test
    public void testaSomaDoiseDois(){
        assertEquals(4, calc.soma(2, 2));
    }
    @DisplayName("Testa soma do valor dois com cinco")
    @Test
    public void testaSomaDoiseCinco(){
        assertEquals(7, calc.soma(2, 5));
    }

    @DisplayName("Testa subtração do valor três com 2")
    @Test
    public void testaSubtraiTrêseDois(){
        assertEquals(1, calc.subtrai(3, 2));
    }


    @DisplayName("Testa subtração do valor quatro e cinco")
    @Test
    public void testaSubtraiQuatroeCinco(){
        assertEquals(-1, calc.subtrai(4, 5));
    }


    @DisplayName("Testa subtração do valor sete e cinco")
    @Test
    public void testaSubtraiSeteeCinco(){
        assertEquals(2, calc.subtrai(7, 5));
    }

    @DisplayName("Testa multiplicação do valor nove e nove")
    @Test
    public void testaMultiplicacaoNoveeNove(){
        assertEquals(81, calc.multiplicacao(9, 9));
    }


    @DisplayName("Testa multiplicação do valor seis e zero")
    @Test
    public void testaMultiplicacaoSeiseZero(){
        assertEquals(0, calc.multiplicacao(6, 0));
    }

    @DisplayName("Testa multiplicação do valor dez e um")
    @Test
    public void testaMultiplicacaoDezeUm(){
        assertEquals(10, calc.multiplicacao(10, 1));
    }

    @DisplayName("Testa divisão do valor oito e zero")
    @Test
    public void testaDivisaoOitoeZero(){
       try {
            calc.divisao(8, 0);
        fail("Deveria ocorrer ArithmeticException");
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
       
    }

    @Test
    public void testaDivisaoOitoeZerov2(){
        assertThrows(ArithmeticException.class, () -> calc.divisao(8, 0));
    }
    

    @DisplayName("Testa divisão do valor oito e quatro")
    @Test
    public void testaDivisaoOitoeQuatro(){
        assertEquals(2, calc.divisao(8, 4));
    }

    @DisplayName("Testa divisão do valor dez e dois")
    @Test
    public void testaDivisaoDezeDois(){
        assertEquals(5, calc.divisao(10, 2));
    }
    
}
