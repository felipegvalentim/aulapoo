package ListaDeChamada;

import org.w3c.dom.CDATASection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("felipevalentim@live.com", "Felipe Valentim");
        Aluno aluno2 = new Aluno("joao.silva@db1.com.br", "João Silva");

        Professor professor = new Professor("maiko.cunha@db1.com.br", "Maiko Cunha");
        Materia materia = new Materia("POO","Abstração",10.5, professor, 3);

        Date dataId = new Date();
        List<Aluno> aluno = new ArrayList<Aluno>();
        Aula aula = new Aula(dataId, materia);

        System.out.println("Professor: " + professor);
        System.out.println("--------------------");
        System.out.println("Aluno01: " + aluno1);
        System.out.println("--------------------");
        System.out.println("Aluno02: " +aluno2);
        System.out.println("--------------------");
        System.out.println("Materia: "  + materia);
        System.out.println("--------------------");
        System.out.println("Aula: "  + aula);
    }
}
