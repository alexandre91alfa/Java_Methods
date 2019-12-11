import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        try {
            List<Professor> estudantes = new ArrayList();

            estudantes.add(new Professor("Alexandre"));
            estudantes.add(new Professor("Sara"));
            estudantes.add(new Professor("Alexandre"));
            estudantes.add(new Professor("Lana"));

            System.out.println(estudantes);

            estudantes.sort((f,s) -> s.getNome().hashCode() - f.getNome().hashCode());

            System.out.println(estudantes);

        } catch (Exception e) {
            throw new Error(e);
        }
    }


}
