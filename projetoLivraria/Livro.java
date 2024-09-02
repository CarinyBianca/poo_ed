package projetoLivraria;

public class Livro{
    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;

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