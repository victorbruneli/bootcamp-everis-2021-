
package Comparator;



public class Comparador implements Comparable<Comparador>{
    
     private final String nome;
     private final Integer idade;
        
    public Comparador(String nome, Integer idade) {
        
      this.nome = nome;
      this.idade = idade;
        
    }

        public String getNome(){return nome;}
        
        public Integer getIdade(){return idade;}

        @Override
        public String toString(){return nome + "--" + idade;}
        
        @Override
        public int compareTo(Comparador o){
            return this.getIdade() - o.getIdade();
        }
}
