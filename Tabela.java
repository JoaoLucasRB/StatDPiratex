
package principal;

public class Tabela {
    private Ampliark amp;
    private Escaner num;
    int n=0;
    private Integer[] freqA = new Integer[(int)amp.getKa()];
    private Float[] max = new Float[(int)amp.getKa()];
    private Float[] min = new Float[(int)amp.getKa()];
    private Float[] pontoMedio = new Float[(int)amp.getKa()];
    
    public void absolutaEPm(){
        for (int c=0; c<amp.getKa(); c++){
            float limite = num.getNumeros(n) + amp.getLargura();
            min[c] = num.numeros[n];
            for(n=n; n<num.getQtdNum(); n++){
                if(num.getNumeros(n) < limite){
                    freqA[c]++;
                }else if(num.getNumeros(n) >= limite){
                    max[c] = num.getNumeros(n-1);
                    break;
                }
            }
            pontoMedio[c] = (max[c] - min[c])/2;
        }
    }
    
}
