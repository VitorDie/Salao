import org.junit.Test;
import salaoDataOutput.ComandaDB;
import salaoDataOutput.SalaoDBFactory;
import salaoDataOutput.mapDB.SalaoMapDBFactory;

public class ComandaTest {
    SalaoDBFactory dbFactory = new SalaoMapDBFactory();
    ComandaDB database = dbFactory.makeComandaDB();
    @Test
    public void CriarComandaTest() {

    }
}
