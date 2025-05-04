package abstractfactory;

public class FabricaClassica implements FabricaMoveis {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraClassica();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaClassica();
    }
    
    @Override
    public Sofa criarSofa() {
        return new SofaClassico();
    }
}