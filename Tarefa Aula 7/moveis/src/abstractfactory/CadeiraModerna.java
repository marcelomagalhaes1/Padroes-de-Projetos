package abstractfactory;

public class CadeiraModerna implements Cadeira {
    @Override
    public void sentar() {
        System.out.println("Sentando em uma cadeira moderna com design ergonômico");
    }
}