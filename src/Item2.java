import java.util.Scanner;
public class Item2 {
    public static void main(String[] args) {
        
        Item2 Fib = new Item2();
        Scanner scan = new Scanner(System.in);
        System.out.println("digite uma entrada");
      int   entrada=scan.nextInt();
        Fib.fib(entrada);
    }







public void fib(int entrada){
    boolean val=false;
    int a=1,b=0;
    int auxFib;
    for(int i = 0; i<entrada;i++){
        System.out.println(a);
        auxFib=a;
        a = a+b;
        b = auxFib;
        if (a==entrada) {
            val=true;
        }
         
    } if (val==true) {
        System.out.println("a entrada faz parte da lista");
    }
     
}

}
