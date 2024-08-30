package livraria;

public class Livro{
    String titulo;
    int numeroPaginas;
    double preco;

    void cadastrar(){
        System.out.println("cadastrar o Livro");
    }

    double calcFrete(String cep){
        double frete = 0;
        Sistem.out.println("Calculando o frete para o CEP" + cep);
        return frete;
    }
}