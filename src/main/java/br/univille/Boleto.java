package br.univille;

public class Boleto {
    private float valor;
    private int diaDoVencimento;
    private float percDesconto;
    private float percMulta;

    public Boleto(float valor, int diaDoVencimento, float percDesconto, float percMulta) { 
        this.valor = valor;
        this.diaDoVencimento = diaDoVencimento; 
        this.percDesconto = percDesconto; 
        this.percMulta = percMulta;
    }

    public float getValor(){
        return valor;
    }

    public int getDiaDoVencimento(){
        return diaDoVencimento;
    }

    public float getPercDesconto(){
        return percDesconto;
    }

    public float getPercMulta(){
        return percMulta;
    }

    public float pagar(int diaDoPagamento){
        float valortotal = 0;


        if (diaDoPagamento <= diaDoVencimento){
            percDesconto = (valor * percDesconto) / 100f;
            valortotal = valor - percDesconto;
        }else{
            percMulta = (valor * percMulta) / 100f;
            valortotal = valor + percMulta;
        }
        return valortotal;
    }

    
}
