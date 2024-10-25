public class Main {
    public static void main(String[] args) {
        // Criar novo objeto
        Bolo bolo1 = new Bolo();

        // Adcionar valores ao bolo
        bolo1.cobertura = false;
        bolo1.tamanho = 20;
        bolo1.sabor = "chocolate";

        // Exibir os detalhes do bolo
        bolo1.exibirDetalhes();

        System.out.println();

        // alterar cobertura
        bolo1.adicionarCobertura();

        //exibir novos detalhes
        bolo1.exibirDetalhes();
    }
}
