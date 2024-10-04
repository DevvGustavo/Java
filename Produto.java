import java.util.Scanner;

public abstract class Produto {
    
    private String codigo;
    private double preco;
    private String nome;

    Scanner input = new Scanner(System.in);

    public Produto(String codigo, double preco, String nome){

        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public void mostrar_dados() {

        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }

    public double mostrar_dados(double valor_do_desconto) {

        double valor_final;

        valor_final = this.preco - valor_do_desconto;

        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + valor_final);

        return valor_final;
        
    }

    public void verificacao (String resposta) {

        if (resposta.equals("sim")){

            System.out.println("Quanto de desconto possui o produto? ");
            double valor_do_desconto = input.nextDouble();
            
            mostrar_dados(valor_do_desconto);
        }
        else if (resposta.equals("não")){
            
            mostrar_dados(); // mostrar os dados sem o desconto
        }
        else{

            System.out.println("Opção inválida");
            verificacao(resposta);
        }

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    
}
