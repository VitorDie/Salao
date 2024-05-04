import org.junit.Assert;
import org.junit.Test;
import salaoDataOutput.ServicoDB;
import salaoDataOutput.mapDB.SalaoMapDBFactory;
import salaoDataOutput.mapDB.ServicoMapDB;
import salaoDataProcess.modeloDeDados.Servico;
import salaoDataProcess.transactions.servicoTransactions.CriarServico;
import salaoDataProcess.transactions.servicoTransactions.CriarProgressiva;
import salaoDataOutput.SalaoDBFactory;

public class ServicoTest {
    SalaoMapDBFactory dbFactory = SalaoDBFactory.makeSalaoMapDBFactory();
    ServicoDB database = dbFactory.makeServicoDB();

    ServicoDB database = new ServicoMapDB();
    @Test
    public void criarServicoTest(){
        Integer servicoId = 1;

        CriarServico criarServico = new CriarProgressiva(servicoId, 100.00, database);
        criarServico.execute();

        Servico servicoRecebido = database.read(servicoId);
        Double valorDoServico = servicoRecebido.getValor();
        Assert.assertEquals(100.00, (double)valorDoServico, .001);
    }
}
