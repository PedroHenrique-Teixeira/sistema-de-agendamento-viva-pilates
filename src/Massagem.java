public class Massagem extends Servico {

    private String tecnica;
    //construtor da que é responsavel pela massagem, não coloquei String tipo porque o tipo é fixo
    public Massagem(String tecnica){
    super("massagem", 80.0, 50 );
    this.tecnica = tecnica;
    }
    // escrever e trocar o valor do atributo tecnica
public String getTecnica(){
        return tecnica;
}
public void setTecnica(String tecnica) {
    this.tecnica = tecnica;
    }
}
