import java.util.Comparator;
import java.util.Objects;

public class Professor implements Comparator {

    private final String Nome;

    public Professor(final String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    @Override
    public int compare(Object o, Object t1) {
        return o.hashCode() - t1.hashCode();
    }

    @Override
    public String toString() {
        return "Nome='" + Nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(Nome, professor.Nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome);
    }
}
