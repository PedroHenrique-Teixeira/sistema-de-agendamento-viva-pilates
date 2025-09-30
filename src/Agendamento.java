
     public class Agendamento {
    //um nome e para nomear o atributo e o outro é para saber qual classe vai amarzenar
         private Cliente cliente;
         private Funcionario funcionario;
         private Servico servico;
         private String horario;
//construtor do que vai no agendamento
         public Agendamento(Cliente cliente, Funcionario funcionario, Servico servico, String horario) {
             this.cliente = cliente;
             this.funcionario = funcionario;
             this.servico = servico;
             this.horario = horario;
         }

         public String getHorario() {
             return horario;
         }

         public Funcionario getFuncionario() {
             return funcionario;
         }

         // Resumo do agendamento
         public String resumo() {
             return "Cliente: " + cliente.getNome() +
                     " | Tel: " + cliente.getNumero() +
                     " | Idade: " + cliente.getIdade() + " anos" +
                     " | Serviço: " + servico.getTipo() +
                     " | Instrutor: " + funcionario.getNome() +
                     " | Horário: " + horario;
         }
     }

