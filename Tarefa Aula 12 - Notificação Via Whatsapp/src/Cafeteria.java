abstract class Bebida {
    public abstract String obterDescricao();
    public abstract double custo();
}

class Cafe extends Bebida {
    @Override
    public String obterDescricao() {
        return "Café simples";
    }

    @Override
    public double custo() {
        return 2.00;
    }
}

abstract class DecoradorBebida extends Bebida {
    protected Bebida bebida;

    public DecoradorBebida(Bebida bebida) {
        this.bebida = bebida;
    }
}

class Leite extends DecoradorBebida {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obterDescricao() {
        return bebida.obterDescricao() + " com leite";
    }

    @Override
    public double custo() {
        return bebida.custo() + 0.50;
    }
}

class Chocolate extends DecoradorBebida {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obterDescricao() {
        return bebida.obterDescricao() + " com chocolate";
    }

    @Override
    public double custo() {
        return bebida.custo() + 0.75;
    }
}

public class Cafeteria {
    public static void main(String[] args) {
        Bebida bebida = new Cafe();
        System.out.println(bebida.obterDescricao() + " - R$" + bebida.custo());

        bebida = new Leite(bebida);
        System.out.println(bebida.obterDescricao() + " - R$" + bebida.custo());

        bebida = new Chocolate(bebida);
        System.out.println(bebida.obterDescricao() + " - R$" + bebida.custo());
    }
}
