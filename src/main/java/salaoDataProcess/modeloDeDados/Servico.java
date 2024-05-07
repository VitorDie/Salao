package salaoDataProcess.modeloDeDados;

public class Servico {
    protected Double valor;
    protected java.lang.String nome;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Servico(String nome, Double valor) {
        this.valor = valor;
        this.nome = nome;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
