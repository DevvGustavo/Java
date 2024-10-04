public class Vestuario extends Produto {
    
   private String tamanho;
   private String cor;

    public Vestuario (String codigo, double preco, String nome, String tamanho, String cor){
        
        super(codigo, preco, nome);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public void mostrar_dados() {

        super.mostrar_dados();
        System.out.println("Tamnho da roupa: " + tamanho);
        System.out.println("Cor da roupa: " + cor);
        
    }

}
