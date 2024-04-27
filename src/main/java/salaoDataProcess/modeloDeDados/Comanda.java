package salaoDataProcess.modeloDeDados;

import java.time.LocalDateTime;

public class Comanda {
    private LocalDateTime data;
    private Cliente cliente;
    private Pagamento pagamento;
    private Atendimentos atendimentos;

    public Comanda(LocalDateTime data, Cliente cliente, Pagamento pagamento, Atendimentos atendimentos) {
        this.data = data;
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.atendimentos = atendimentos;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public Atendimentos getAtendimentos() {
        return atendimentos;
    }
}
