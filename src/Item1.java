public class Item1 {

    int INDICE = 13, SOMA = 0, K = 0;
 
    public static void main(String[] args) {
        Item1 soma = new Item1();
        soma.Somatorio();
         soma.imprimir(soma.SOMA);
        
    }

    public void Somatorio() {
        while (K < INDICE) {
            K++;
            SOMA = SOMA + K;
        }
    }

    public void imprimir(int SOMA) {
        System.out.println(SOMA);
    }
}