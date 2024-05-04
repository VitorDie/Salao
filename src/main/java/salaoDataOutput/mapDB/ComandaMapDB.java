package salaoDataOutput.mapDB;

import salaoDataOutput.ComandaDB;
import salaoDataProcess.modeloDeDados.Comanda;

import java.util.HashMap;
import java.util.Map;

public class ComandaMapDB implements ComandaDB {
    private static ComandaMapDB _instace = null;
    public ComandaMapDB() {}

    public static ComandaMapDB getInstance() {
        if (_instace == null)
            _instace = new ComandaMapDB();

        return _instace;
    }

    Map<Integer, Comanda> db = new HashMap<>();

    @Override
    public Comanda consultarComanda(Integer comandaId) {
        return db.get(comandaId);
    }

    @Override
    public void inserirComanda(Integer comandaId, Comanda comanda) {
        db.put(comandaId, comanda);
    }
}
