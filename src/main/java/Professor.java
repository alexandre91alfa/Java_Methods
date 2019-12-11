import java.util.Comparator;

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
}
