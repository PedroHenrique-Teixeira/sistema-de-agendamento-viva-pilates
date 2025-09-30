public class Funcionario {
//atributos dos funcionarios da empresa
   private String nome;
   private String cargo;
//construtor dos funcionarios
   public Funcionario(String Nome, String Cargo){
       this.nome = Nome;
       this.cargo = Cargo;
   }
//para poder modificar e escrever os atributos dos funcionarios
   public String getNome(){

       return nome;
   }
   public void setNome(String Nome)
   {
       this.nome = Nome;
   }

   public String getCargo(){
       return cargo;
   }
   public void setCargo(String Cargo){

       this.cargo = Cargo;
   }

}
