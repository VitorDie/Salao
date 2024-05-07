import org.junit.Assert;
import org.junit.Test;
import salaoDataOutput.ServicoDB;
import salaoDataOutput.mapDB.SalaoMapDBFactory;
import salaoDataOutput.mapDB.ServicoMapDB;
import salaoDataProcess.modeloDeDados.Servico;
import salaoDataProcess.transactions.servicoTransactions.CriarServico;
import salaoDataProcess.transactions.servicoTransactions.CriarProgressiva;
import salaoDataOutput.SalaoDBFactory;
import salaoDataProcess.transactions.servicoTransactions.ServicoTransaction;
import salaoDataProcess.transactions.servicoTransactions.ServicoTransactionFactory;

public class ServicoTest {
    SalaoDBFactory dbFactory = new SalaoMapDBFactory();
    ServicoDB database = dbFactory.makeServicoDB();

    @Test
    public void criarProgressivaTest(){
        Integer servicoId = 1;

        ServicoTransaction criarServico = ServicoTransactionFactory.makeCriarProgressiva(servicoId, 100.00, database);
        criarServico.execute();

        Servico servicoRecebido = database.read(servicoId);
        Double valorDoServico = servicoRecebido.getValor();
        Assert.assertEquals(100.00, (double)valorDoServico, .001);
    }

    @Test
    public void criarServicoTest() {
        Integer servicoId = 2;

        ServicoTransaction criarServico = ServicoTransactionFactory.makeCriarServico(servicoId, "raspar a cabeca", 2.0, database);
        criarServico.execute();

        Servico servicoRecebido = database.read(servicoId);

        Assert.assertEquals(servicoRecebido.getValor(), 2.0, .001);
        Assert.assertEquals(servicoRecebido.getNome(), "raspar a cabeca");
    }


}
