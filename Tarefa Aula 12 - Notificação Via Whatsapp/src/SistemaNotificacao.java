interface Notificacao {
    String enviar(String mensagem);
}

class NotificacaoSimples implements Notificacao {
    @Override
    public String enviar(String mensagem) {
        return "Notificação: " + mensagem;
    }
}

abstract class NotificacaoDecorator implements Notificacao {
    protected Notificacao notificacao;

    public NotificacaoDecorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public String enviar(String mensagem) {
        return notificacao.enviar(mensagem);
    }
}

class EmailDecorator extends NotificacaoDecorator {
    public EmailDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        return super.enviar(mensagem) + " + Email enviado";
    }
}

class SMSDecorator extends NotificacaoDecorator {
    public SMSDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        return super.enviar(mensagem) + " + SMS enviado";
    }
}

class SlackDecorator extends NotificacaoDecorator {
    public SlackDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        return super.enviar(mensagem) + " + Slack notificado";
    }
}

public class SistemaNotificacao {
    public static void configurarNotificacao(String prioridade, String mensagem) {
        Notificacao notificacao = new NotificacaoSimples();

        if (prioridade.equalsIgnoreCase("urgente")) {
            notificacao = new SMSDecorator(notificacao);
            notificacao = new EmailDecorator(notificacao);
            notificacao = new SlackDecorator(notificacao);
        } else {
            notificacao = new EmailDecorator(notificacao);
        }

        System.out.println("Prioridade " + prioridade + ": " + notificacao.enviar(mensagem));
    }

    public static void main(String[] args) {
        configurarNotificacao("urgente", "Servidor caiu!");
        configurarNotificacao("normal", "Backup concluído.");
    }
}
