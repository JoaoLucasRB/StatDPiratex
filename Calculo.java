
package principal;

public class Calculos {
    private Escaner num;
    private Ampliark amp;
    private Tabela tab;
    private float media = 0f;
    private float mediana = 0f;
   
    public Calculos(Escaner n, Ampliark m, Tabela o){
        this.num = n;
        this.amp = m;
        this.tab = o;
    }
    
    public float calcMedia(){
        for(int c=0; c<tab.getCont(); c++){
            this.media = media + (tab.getPontoMedio(c)*tab.getFreqA(c));
        }
        this.media = media/num.getQtdNum();
        System.out.println("Media: " + media);
        return this.media;
    }
    
    public float calcMediana(){
        int soma = 0;
        int somaF = 0;
        amp.calcLargura();
        for(int c=0; c<tab.getCont(); c++){
            soma = soma + tab.getFreqA(c);
            if((num.getQtdNum()/2) < soma){
                for(int l=0; l<c; l++){
                    somaF = somaF + tab.getFreqA(l);
                }
                mediana = tab.getMin(c) + (((num.getQtdNum()/2)*amp.getLargura())/tab.getFreqA(c));
            }
        }
        System.out.println("Mediana: " + mediana);
        return this.mediana;
    }
    
    public float getMedia(){
        return this.media;
    }
    
    public float getMediana(){
        return this.mediana;
    }
}
