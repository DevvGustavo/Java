import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome do produto: ");
        String nome = input.next();
        
        System.out.println("Qual o código do produto?");
        String codigo = input.next();
        
        System.out.println("Preço do produto: ");
        double preco = input.nextDouble();
        
        System.out.println("Tempo de garantia do produto: ");
        int garantia = input.nextInt();
        
        Eletronica eletronica = new Eletronica(codigo, preco, nome, garantia);
        
        //-------------------------------------------------------------------------------------------------------------------------------------------
        // chamando o metodo verificação 

        System.out.println("O produto possui desconto? ");
        String resposta = input.next().toLowerCase();
        eletronica.verificacao(resposta);
        


        input.close();
    }
}
