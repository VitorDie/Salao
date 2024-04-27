package salaoDataProcess.modeloDeDados;

public class Atendimento {
    private Profissional profissional;
    private Servico servico;

    public Atendimento(Profissional profissional, Servico servico) {
        this.profissional = profissional;
        this.servico = servico;
    }
}
