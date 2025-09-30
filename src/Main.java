//list guardar agendamentos
//arraylist é a forma concreta do list
//Scanner tipo o leia no visualg
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista de funcionários (todos fazem Pilates e Massagem)
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Isadora", "Instrutor"));
        funcionarios.add(new Funcionario("Carla", "Instrutora"));

        // Lista de agendamentos
        List<Agendamento> agenda = new ArrayList<>();

        // Loop de formulário que so acaba quando encontra o break
        while (true) {
            System.out.println("\n=== Novo Agendamento ===");

            // Formulário do cliente
            System.out.print("Nome do cliente (ou 'sair' para encerrar): ");
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("sair")) break;

            System.out.print("Telefone: ");
            String telefone = sc.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            Cliente cliente = new Cliente(nome, telefone, idade);

            // Horário
            System.out.print("Digite o horário de sua preferenciaa: ");
            String horario = sc.nextLine();

            // Verifica quantos funcionários já estão ocupados nesse horário
            long ocupados = agenda.stream()
                    .filter(ag -> ag.getHorario().equals(horario))
                    .count();

            if (ocupados >= funcionarios.size()) {
                System.out.println(" Todos os instrutores estão ocupados nesse horário. Escolha outro.");
                continue;
            }

            // Escolha do serviço
            System.out.println("Escolha o serviço:");
            System.out.println("1 - Pilates (Preço: R$100, Duração: 50 min)");
            System.out.println("2 - Massagem (Preço: R$80, Duração: 50 min)");
            int opcao = Integer.parseInt(sc.nextLine());
//polimorfismo
            Servico servicoEscolhido;
            if (opcao == 1) {
                servicoEscolhido = new Pilates("Intermediário"); // preço fixo dentro da classe
            } else {
                servicoEscolhido = new Massagem("Relaxante"); // preço fixo dentro da classe
            }

            // Escolhe funcionário disponível (rodízio)
            Funcionario funcionarioEscolhido = null;
            for (Funcionario f : funcionarios) {
                boolean ocupado = agenda.stream()
                        .anyMatch(ag -> ag.getHorario().equals(horario) && ag.getFuncionario().equals(f));
                if (!ocupado) {
                    funcionarioEscolhido = f;
                    break;
                }
            }

            // Cria o agendamento
            Agendamento ag = new Agendamento(cliente, funcionarioEscolhido, servicoEscolhido, horario);
            agenda.add(ag);

            System.out.println(" Agendamento realizado com sucesso!");
        }

        // Mostra todos os agendamentos
        System.out.println("\n=== Agenda do dia ===");
        for (Agendamento ag : agenda) {
            System.out.println(ag.resumo());
        }

        sc.close();
    }
}
