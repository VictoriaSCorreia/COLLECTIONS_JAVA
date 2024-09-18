package ordenacao.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<Livro>() {
            {
                add(new Livro("c", "dkjf", 1987));
                add(new Livro("b", "gjf", 1956));
                add(new Livro("a", "ajf", 1967));
            }
        };

        System.out.println("Livros após a ordenação natural (Ano): ");
		Collections.sort(livros);
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + " - " +
					livro.getAutor() + " - " +
					livro.getAno());
		}
    }
}
