public class Bolo {

    // Variaveis de Instancia
    public String sabor;
    public int tamanho;
    public boolean cobertura;

    // Metodos
    public void exibirDetalhes() {
        System.out.println("sabor do bolo: " + sabor);
        System.out.println("tamanho do bolo: " + tamanho);
        System.out.println("Corbertura do bolo: " + cobertura);
    }
    // Adiciona cobertura no bolo
    public void adicionarCobertura(){
        cobertura = true;

    }
}

