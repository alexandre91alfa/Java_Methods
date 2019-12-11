import java.time.LocalDate;
import java.util.Objects;

class Person {

    private LocalDate nascimento;

    Person(final int dia,final int mes,final int ano){
        this.nascimento = LocalDate.of(ano,mes,dia);
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nascimento, person.nascimento);

    }

}
