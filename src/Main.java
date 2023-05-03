
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    
    public static void main(String[] args) {
        Disciplina algoritmos = new Disciplina(1001, "Algoritmos", 10);
        Disciplina programacao_1 = new Disciplina(1002, "Programação I", 10);
        Disciplina programacao_2 = new Disciplina(1003, "Programação II", 10);
        Disciplina linguagensFormais = new Disciplina(1004, "Linguagens Formais", 10);
        Disciplina arquitetura = new Disciplina(1005, "Arquitetura", 10);
        Disciplina inteligenciaArtificial = new Disciplina(1006, "Inteligengia Artificial", 10);
        
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(algoritmos);
        disciplinas.add(programacao_1);
        disciplinas.add(programacao_2);
        disciplinas.add(linguagensFormais);
        disciplinas.add(arquitetura);
        disciplinas.add(inteligenciaArtificial);
        
        
        Curso curso  = new Curso(1001, "Ciência da Computação", disciplinas);
        
        Aluno henrique = new Aluno(1001, "henrique", "101", curso);
        henrique.matricularDisciplina(arquitetura);
        
        
        
    }
    
}
