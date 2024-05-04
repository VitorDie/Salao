package salaoDataProcess.transactions.servicoTransactions;

import salaoDataOutput.ServicoDB;

public abstract class CriarServico extends ServicoTransaction{
    protected CriarServico(ServicoDB database) {
        super(database);
    }
}
