package salaoDataProcess.transactions.servicoTransactions;

import salaoDataOutput.ServicoDB;
import salaoDataProcess.modeloDeDados.Servico;

public class ServicoTransactionFactory {
    public static CriarProgressiva makeCriarProgressiva(Integer id, Double valor, ServicoDB database){
        return new CriarProgressiva(id, valor, database);
    }

    public static ServicoTransaction makeCriarServico(Integer servicoId, String nome, Double valor, ServicoDB database) {
        return new CriarServico(servicoId, nome, valor, database);
    }
}
