
package projeto;

public class Ampliark {
    
    private Escaner num;
    private float amplitude;
    private float ka;
    private float largura;
    
    public Ampliark (Escaner num){
        this.num = num;
    }
    
    public float calcLargura(){
        float resultado = (this.amplitude/this.ka);
       return resultado;
    }
    
   public float calcAmplitude(){
       float resultado = num.getNumeros(num.getQtdNum())-num.getNumeros(0);
       return resultado;
   }
   
   public double calcKa(){
       double resultado = 1 + 3.33 * Math.log10(num.getQtdNum());
       return resultado;
   }
   
  
}
