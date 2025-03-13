public class Gerente extends Funcionario implements Autenticavel, Fornecedor, Departamento{

    @Override
    public void login() {
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public void realizarPedido() {
        throw new UnsupportedOperationException("Unimplemented method 'realizarPedido'");
    }

    @Override
    public void criarDepartamento() {
        throw new UnsupportedOperationException("Unimplemented method 'criarDepartamento'");
    }

    @Override
    public void cadastrarFuncionarios() {
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarFuncionarios'");
    }
    
}
