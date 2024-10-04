public class Eletronica extends Produto {
    
    int garantia;

    public Eletronica(String codigo, double preco, String nome, int garantia) {

        super(codigo, preco, nome);
        this.garantia = garantia;
    }
    
    // irá verificar se a garantia da eletronica é em anos ou em meses
    public void verificar_garantia() {

        System.out.println("A garantia é em anos ou em mese? ");
        String resposta = input.next().toLowerCase();

        if (resposta.equals("meses")){
            
            super.mostrar_dados();
            System.out.println("Garantia: " + garantia + " meses");
        }
        else if (resposta.equals("anos")) {

            System.out.println("O" + getNome() + "possui" + garantia + " anos de garantia");

        }

    }
    // se notarem este código a baixo é igual o de cima, mas eu não sei resolver igual a atividade :(

    @Override
    public void mostrar_dados() {

        super.mostrar_dados();
        System.out.println("Garantia: " + garantia + " meses");
    }

    public void mostrar_dados(boolean tempo_de_garantia) {

        tempo_de_garantia = true;
        super.mostrar_dados();

        if (tempo_de_garantia == true){

            System.out.println("O" + getNome() + "possui" + garantia + " anos de garantia");
        }
            
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

}
