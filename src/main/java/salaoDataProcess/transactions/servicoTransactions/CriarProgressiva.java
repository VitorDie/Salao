package salaoDataProcess.transactions.servicoTransactions;

import salaoDataOutput.ServicoDB;
import salaoDataProcess.modeloDeDados.Progressiva;
import salaoDataProcess.modeloDeDados.Servico;

public class CriarProgressiva extends CriarServico {
    private final Integer id;
    private final Double valor;

    public CriarProgressiva(Integer id, Double valor, ServicoDB database) {
        super(database);
        this.id = id;
        this.valor = valor;
    }

    @Override
    public void execute() {
        Servico servico = new Progressiva(valor);
        database.create(id, servico);
    }
}
