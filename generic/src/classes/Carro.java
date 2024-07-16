package classes;

public abstract class Carro {

    private String cor;
    private Integer anoCarro;

    public Carro() {
    }

    public Carro(String cor, Integer anoCarro) {
        this.cor = cor;
        this.anoCarro = anoCarro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(Integer anoCarro) {
        this.anoCarro = anoCarro;
    }

    @Override
    public String toString() {
        return "Modelo: " + this.getClass().getSimpleName() +
                ", Cor: " + cor +
                ", Ano: " + anoCarro;
    }
}
