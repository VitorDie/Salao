package salaoDataProcess.transactions;

import salaoDataOutput.ComandaDB;
import salaoDataOutput.ComandaMapDB;
import salaoDataProcess.modeloDeDados.Atendimentos;
import salaoDataProcess.modeloDeDados.Cliente;
import salaoDataProcess.modeloDeDados.Comanda;

import java.time.LocalDateTime;

public class Agendar implements Transaction {
    ComandaDB db = ComandaMapDB.getInstance();

    private Integer id;
    private LocalDateTime data;
    private Cliente cliente;
    private Atendimentos atendimentos;

    public Agendar(Integer id, LocalDateTime data, Cliente cliente, Atendimentos atendimentos) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.atendimentos = atendimentos;
    }

    @Override
    public void execute() {
        Comanda comanda = new Comanda(data, cliente, null, atendimentos);
        db.inserirComanda(id, comanda);
    }
}
