package principal;

public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Escaner n1 = new Escaner();
        Ampliark n2 = new Ampliark(n1);
        n1.lerNumeros();
        for(int x = 0; x < n1.getQtdNum();x++){
            System.out.print(n1.getNumeros(x)+" ");
        }
        n2.calcAmplitude();
        n2.calcKa();
        n2.calcLargura();
        System.out.println("\n"+n2.getAmplitude());
        System.out.println(n2.getKa());
        System.out.println(n2.getLargura());
    }
    
}
