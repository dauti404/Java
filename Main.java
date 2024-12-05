import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Augusto", 20241109, "Ciência da Computação", "Programação");

        ArrayList<Double> nota = new ArrayList<>();
        nota.add(5.0);
        nota.add(4.5);
        nota.add(7.4);

        nota.iterator();
        Iterator<Double> iterator = nota.iterator();
        Double soma = 0d;    
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        a1.setMedia(soma);

        a1.imprimir();

        int j = 1;
        for(Double n: nota) {
            System.out.printf("Nota %d: %,.2f\n ", j, n);
            j++;
        }

        a1.situacao();
    }
}
