    public class Cliente {
    // atributos dos clientes
        private String Nome;
        private String Numero;
        private int Idade;

        //construtor que vai usar para registrar os clientes
        public Cliente(String nome, String numero, int idade) {
            this.Nome = nome;
            this.Numero = numero;
            this.Idade = idade;
        }

//metodos para mexer nas variaveis dos clientes que são privadas (encapsulamento)
        public String getNome(){
            return Nome;
        }
        public void setNome(String nome){
            this.Nome = nome;
        }

       public String getNumero(){
            return Numero;
       }
       public void setNumero(String numero){
            this.Numero = numero;
       }

       public int getIdade(){
            return Idade;
       }
       public void setIdade(int idade){
            this.Idade = Idade;
       }
    }
