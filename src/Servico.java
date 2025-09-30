abstract class Servico {
    //atributos das aulas (herança)
   private String tipo;
   private double preco;
    private int duracao;
    //construtor das aulas
    public Servico( String tipo, double preco, int duracao){
        this.tipo = tipo;
        this.preco = preco;
        this.duracao = duracao;

    }
    //para acessar e modificar os atributos das aulas
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){

        this.tipo = tipo;
    }

    public double getPreco() {

        return preco;
    }
    public void setPreco(double preco){

        this.preco = preco;
    }

    public int getDuracao() {

        return duracao;
    }
    public void setDuracao(int duracao){

        this.duracao = duracao;
    }
}
