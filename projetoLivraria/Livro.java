package projetoLivraria;

public class Livro{
    public Livro(double preco, String titulo){
    this.preco = preco;
    this.titulo = titulo;}
    
    public String titulo;
    public int numeroPaginas;
    public String genero;
    public int anoPublicacao;
    public double preco;
    public String autor;

    void cadastrar(){
        System.out.printf("cadastrar o Livro");
    }
    void vender(){
        System.out.println();
    }
    String trocar() {
        return "";
    }

        double calcFrete(String cep){
        double frete = 0;
        System.out.printf("Calculando o frete para o CEP" + cep);
        return frete;
    }
}