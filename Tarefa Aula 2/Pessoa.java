public abstract class Pessoa {
    String nome;
    String end;
    String cidade;
    Double cep;
    Double telefone;

    public abstract void inserirNome();
    
    public abstract void inserirEndereco();
        
    public void inserirCidade(){
        System.out.println("Digite sua Cidade: " + cidade);
    }
    public void inserirCep(){
        System.out.println("Insira o CEP: " + cep);
    }
    public void inserirTelefone(){
        System.out.println("Informe o seu número celular: " + telefone);
    }


}
