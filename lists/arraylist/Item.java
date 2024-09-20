package lists.arraylist;

import java.util.Comparator;

public class Item implements Comparable<Item>{
      private String nome;
      private double preco;
      private int quant;
  
      public Item(String nome, double preco, int quant) {
          this.nome = nome;
          this.preco = preco;
          this.quant = quant;
      }
  
      public String getNome() {
          return nome;
      }
  
      public double getPreco() {
          return preco;
      }
  
      public int getQuant() {
          return quant;
      }
  
      @Override
      public String toString() {
          return "Item{" +
                  "nome='" + nome + '\'' +
                  ", preco=" + preco +
                  ", quant=" + quant +
                  '}';
      }

    @Override
    public int compareTo(Item i) {
        return nome.compareTo(i.nome);
    }
  }

// Classe para comparar Item por valor
class CompararValor implements Comparator<Item> {
	@Override
	public int compare(Item i1, Item i2) {
		return Double.compare(i1.getPreco(), i2.getPreco());
	}
}
// Classe para comparar Item por quantidade
class CompararQuant implements Comparator<Item> {
	@Override
	public int compare(Item i1, Item i2) {
		return Integer.compare(i1.getQuant(), i2.getQuant());
	}
}


