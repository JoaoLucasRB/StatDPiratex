
package principal;

public class Tabela {
    Ampliark amp;
    Escaner num;
    int n=0;
    int cont;
    Integer[] freqA;
    Float[] freqR, freqP, min, pMedio, max;    
    public Tabela(Escaner n, Ampliark m){
        this.num = n;
        this.amp = m;         
    }
    
    public void minMax(){
        amp.calcKa();
        amp.calcLargura();
        this.cont = (int)amp.getKa();
        this.min = new Float[this.cont];
        this.max = new Float[this.cont];
        for(int c=0; c<this.cont; c++){
            if(c == 0){
                this.min[c] = num.getNumeros(0);
            }else if (c != 0){
                this.min[c] = max[c-1];
            }
            this.max[c] = min[c] + amp.getLargura();
        }
        
    }
    
    public void pontoMedio(){
        this.pMedio = new Float[this.cont];
        for (int c=0; c<this.cont; c++){
            this.pMedio[c] = ((this.max[c]-this.min[c])/2)+this.min[c];
        }
    }
    
    public void freqAbsoluta(){
        this.freqA = new Integer[this.cont];
        for(int c=0; c<this.cont; c++){
            this.freqA[c] = 0;
        }
        for(int c=0; c<this.cont; c++){
            for(int n=0; n<num.getQtdNum(); n++){
                if((num.getNumeros(n)) >= this.min[c] && (num.getNumeros(n) < this.max[c])){
                    this.freqA[c]++;
                }
            }
        }
    }
    
    public void freqRelativa(){
        this.freqR = new Float[this.cont];
        for(int c=0; c<cont; c++){
            this.freqR[c] = (float)freqA[c]/num.getQtdNum();
        }
    }
    
    public void freqPercentual(){
        this.freqP = new Float[this.cont];
        for(int c=0; c<this.cont; c++){
            this.freqP[c] = freqR[c]*100;
        }
    }
    
    public void calcFrequencias(){
        this.minMax();
        this.pontoMedio();
        this.freqAbsoluta();
        this.freqRelativa();
        this.freqPercentual();
        for(int c=0; c<cont; c++){
            System.out.println((c+1) + " Min: " + min[c] + " Ponto Medio: " + pMedio[c] + " Max: " + max[c] + " A: " + freqA[c] + " R: " + freqR[c] + " P: " + freqP[c]);
        }
    }
    
    public float getMin(int posic){
        return this.min[posic];
    }
    
    public float getPontoMedio(int posic){
        return this.pMedio[posic];
    }
    
    public float getMax(int posic){
        return this.max[posic];
    }
    
    public int getFreqA(int posic){
        return this.freqA[posic];
    }
    
    public float getFreqR(int posic){
        return this.freqR[posic];
    }
    
    public float getFreqP(int posic){
        return this.freqP[posic];
    }
}
