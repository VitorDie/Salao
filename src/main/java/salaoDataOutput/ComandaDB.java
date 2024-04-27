package salaoDataOutput;

import salaoDataProcess.modeloDeDados.Comanda;

public interface ComandaDB {
    public Comanda consultarComanda(Integer comandaId);
    public void inserirComanda(Integer comandaId, Comanda comanda);
}
