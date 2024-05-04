package salaoDataProcess.modeloDeDados;

public class Progressiva extends Servico{
    public Progressiva(Double valor) {
        super.valor = valor;
    }

    @Override
    public String toString() {
        return "Progressiva";
    }
}
