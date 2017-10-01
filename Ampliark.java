
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
        this.setLargura(resultado);
    }
    
   public float calcAmplitude(){
       float resultado = num.getNumeros(num.getQtdNum())-num.getNumeros(0);
       this.setAmplitude(resultado);
   }
   
   public double calcKa(){
       double resultado = 1 + 3.33 * Math.log10(num.getQtdNum());
       this.setKa(resultado);
   }
   
   public void setAmplitude(float numero){
       this.amplitude = numero;
   }
   public void setLargura(float numero){
       this.largura = numero;
   }
   public void setKa(float numero){
       this.ka = numero;
   }
    
   public float getAmplitude(){
       return this.amplitude;
   }
   public float getLargura(){
       return this.largura;
   }
   public float getKa(){
       return this.kar;
}
