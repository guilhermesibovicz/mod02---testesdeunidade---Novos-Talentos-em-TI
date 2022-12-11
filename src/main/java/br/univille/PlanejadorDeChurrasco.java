package br.univille;

public class PlanejadorDeChurrasco {
    private int adulto;
    private int crianca;

    public void setAdulto(int adulto){
        this.adulto = adulto;
    }
    
    public void setCrianca(int crianca){
        this.crianca = crianca;
    }

    public float calculaQtdCarne(){
        float total = 0;
        if (adulto < 0){
            adulto = 0;
            
        }
        
        if (crianca < 0){
            crianca = 0;
        }
        total = (adulto * 250) + (crianca * 100);
        return total;
    }
}
