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
        
        
        Eletronica eletronica = new Eletronica(codigo, preco, nome);
        
        System.out.println("Produto possui garantia? ");
        String garantia = input.next().toLowerCase();
        eletronica.verificar_garantia(garantia);
        
        //-------------------------------------------------------------------------------------------------------------------------------------------
        // chamando o metodo verificação de desconto
        
        System.out.println("O produto possui desconto? ");
        String resposta = input.next().toLowerCase();
        eletronica.verificacao_de_desconto(resposta);
        

        


        input.close();
    }
}