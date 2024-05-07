import org.junit.Test;
import salaoDataOutput.AtendimentoDB;
import salaoDataOutput.ProfissionalDB;
import salaoDataOutput.SalaoDBFactory;
import salaoDataOutput.ServicoDB;
import salaoDataOutput.mapDB.SalaoMapDBFactory;
import salaoDataProcess.modeloDeDados.Profissional;
import salaoDataProcess.modeloDeDados.Servico;
import salaoDataProcess.transactions.atendimentoTransactions.AtendimentoTransaction;

public class AtendimentoTest {
    /* FAZER DEPOIS DE SERVICOTEST
    SalaoDBFactory dbFactory = new SalaoMapDBFactory();

    AtendimentoDB database = dbFactory.makeAtendimentoDB();
    ProfissionalDB profissionalDB = dbFactory.makeProfissionalDB();
    ServicoDB servicoDB = dbFactory.makeServicoDB();
    @Test
    public void adicionarAtendimentoTest() {
        Integer atendimentoId = 1;
        Profissional profissional = profissionalDB.read(1);
        Servico servico = servicoDB.read(1);

        AtendimentoTransaction adicionarAtendimento =
                AtendimentoTransactionFactory.makeAdicionarAtendimento(atendimentoId, profissional, servico, database);
    }

     */
}
