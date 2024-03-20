import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Criando objetos de Endereco, Matricula e Aluno
        LocalDate data = LocalDate.parse("2000-12-05");
        Endereco endereco = new Endereco("Rua ABC", "12345-678", "Cidade", "Estado");
        Matricula matricula = new Matricula("20240001");
        Aluno aluno = new Aluno("João", 20, "joao@example.com", endereco, matricula);

        // Exibindo informações do aluno
        System.out.println("Informações do Aluno:");
        System.out.println(aluno.getInformacoes());

        List<Materia> materias = new ArrayList<>();

        // Adicionando matérias à lista
        materias.add(new Materia("Matemática"));
        materias.add(new Materia("Português"));
        materias.add(new Materia("História"));
        materias.add(new Materia("Geografia"));
        materias.add(new Materia("Ciências"));

        // Exibindo as matérias
        System.out.println("Lista de Matérias:");
        for (Materia materia : materias) {
            System.out.println(materia.getNome());
        }
    }
}
