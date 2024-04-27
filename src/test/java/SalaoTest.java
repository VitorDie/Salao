import salaoDataOutput.ComandaDB;
import salaoDataOutput.ComandaMapDB;
import org.junit.Test;
import salaoDataProcess.modeloDeDados.Atendimento;
import salaoDataProcess.modeloDeDados.Atendimentos;
import salaoDataProcess.modeloDeDados.Profissional;
import salaoDataProcess.modeloDeDados.Progressiva;
import salaoDataProcess.transactions.Agendar;

import java.time.LocalDateTime;
import java.time.Month;


public class SalaoTest {

    ClienteDB comandaDb = ComandaMapDB.getInstance();

    @Test
    public void agendarComandaTest() {
        Integer idComanda = 1;
        LocalDateTime dt = LocalDateTime.of(2024, Month.MARCH, 3, 3, 3);
        Integer clienteId = 1;

        // Criar, e coloca no banco
        Atendimentos atendimentos = new Atendimentos();
        atendimentos.add(new Atendimento(new Profissional("Joao"), new Progressiva(200.00)));
        atendimentos.add(new Atendimento(new Profissional("Pedro"), new Progressiva(200.00)));
        atendimentos.add(new Atendimento(new Profissional("Tiago"), new Progressiva(200.00)));

        Agendar agendar = new Agendar(idComanda, dt, comandaDb.getCliente(clienteId), atendimentos);
        agendar.execute();
    }

}