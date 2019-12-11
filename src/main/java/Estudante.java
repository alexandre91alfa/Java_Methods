import java.util.Objects;

public class Estudante implements IPerson<Estudante> {

    private  final String nome;

    public Estudante(final String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return"nome: " + nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return Objects.equals(nome, estudante.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int nomeHash() {
        return hashCode();
    }

    @Override
    public int compareTo(IPerson<Estudante> estudanteIPerson) {
        return estudanteIPerson.hashCode() - this.hashCode();
    }
}
