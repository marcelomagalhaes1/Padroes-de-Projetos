public class Cliente extends Pessoa implements Autenticavel{

    @Override
    public void login() {
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public void inserirNome() {
        System.out.println("Nome: " + nome);
        throw new UnsupportedOperationException("Unimplemented method 'inserirNome'");
    }

    @Override
    public void inserirEndereco() {
        System.out.println("Endereço: " + end);
        throw new UnsupportedOperationException("Unimplemented method 'inserirEndereco'");
    }
    
}
