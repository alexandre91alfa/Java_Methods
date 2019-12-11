import java.util.*;

public class Program {
    public static void main(String[] args) {
        try {
            List<IPerson> estudantes = new ArrayList();

            estudantes.add(new Estudante("Alexandre"));
            estudantes.add(new Estudante("Sara"));
            estudantes.add(new Estudante("Alexandre"));
            estudantes.add(new Estudante("Lana"));

            System.out.println(estudantes);
            //sort com interface comparator
            Collections.sort(estudantes);
            System.out.println(estudantes);

        } catch (Exception e) {
            throw new Error(e);
        }
    }


}
