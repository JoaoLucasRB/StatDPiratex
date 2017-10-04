
package principal;

public class Calculos {
    private Escaner num;
    private Ampliark amp;
    private Tabela tab;
    private float media;
   
    public void media(){
        for(int c=0; c<amp.getKa(); c++){
            media = media + (tab.getPontoMedio(c) * tab.getFreqA(c));
        }
    }
}
