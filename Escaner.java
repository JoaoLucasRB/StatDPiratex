
package projeto;

import java.util.Arrays;
import java.util.Scanner;

public class Escaner {
    private int qtdNum;
    private Float[] numeros;
    Scanner teclado = new Scanner(System.in);
    
    public Escaner(){
        System.out.println("Diga a quantidade de numeros: ");
        this.qtdNum = teclado.nextInt();
        this.numeros = new Float[this.qtdNum];
    }
    public void lerNumeros(){
        System.out.println("Diga os numeros agora: ");
        for(int x=0; x < this.numeros.length; x++){
            this.numeros[x] = teclado.nextFloat();

        }
        Arrays.sort(this.numeros);
    }
    
 
        

    public Float getNumeros(int posic) {
        return numeros[posic];
    }

    public void setNumeros(Float[] numeros) {
        this.numeros = numeros;
    }

    public int getQtdNum() {
        return qtdNum;
    }

    public void setQtdNum(int qtdNum) {
        this.qtdNum = qtdNum;
    }
    

}
