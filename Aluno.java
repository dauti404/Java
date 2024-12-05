import java.util.ArrayList;
import java.util.Iterator;

class Aluno {
    String nome;
    int matricula;
    String curso; 
    String materia;
    double notas;
    double media;
    double mediaVerdade;

    public Aluno(String nome, int matricula, String curso, String materia) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso; 
        this.materia =  materia;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    
        mediaVerdade = media / 3; 
    }

    public void imprimir() {
        System.out.println("Nome:       " + nome);
        System.out.println("Matrícula:  " + matricula);
        System.out.println("Curso:      " + curso);
        System.out.println("Materia:      " + materia);
        System.out.println();
    }

    public void situacao() {
        System.out.printf("\nMedia:   %,.2f\n: ", mediaVerdade);
        if (mediaVerdade < 7 ) {
            System.out.println("Situação: Reprovado(a)");
        } 
        if (mediaVerdade >= 7) {
            System.out.println("Situação: Aprovado(a)");
        }
    }
}
