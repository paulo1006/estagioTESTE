 import java.util.Scanner;
public class Item5 {
    public static void main(String[] args) {
         Item5 lista = new Item5();
         lista.lerString();
         

          }

   public void lerString(){
  Scanner scan = new Scanner(System.in);
   System.out.println("quantidade de strings");
   int qtd = scan.nextInt();
   String[] lista = new String[qtd];

   System.out.println("entre com uma string");
   for(int i=0;i<qtd;i++){
    
       String entrada= scan.next();
       lista[i]=entrada;
       
 
   }      
   System.out.println("      ");
     for(int k=qtd-1;k>=0;k--){
    System.out.println(lista[k]);
   }
  
    
   }

   
}

 
   
 
        
  
        

 

 