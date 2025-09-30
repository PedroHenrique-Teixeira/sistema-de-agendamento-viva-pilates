class Pilates extends Servico {
    //atributo adicional na aula de pilates
    private String nivel;
    //construtor do pilates com herança do serviço
public Pilates(String nivel) {
    super("pilates", 100.0, 50 );
    this.nivel = nivel;
}



    public String getNivel(){

    return nivel;
}
public void setNivel(String nivel) {
    this.nivel = nivel;
}
}

