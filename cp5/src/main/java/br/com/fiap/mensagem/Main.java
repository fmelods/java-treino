package br.com.fiap.mensagem;

import br.com.fiap.mensagem.dao.MensagemDAO;
import br.com.fiap.mensagem.model.Mensagem;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Escolha a operação: 1 - Incluir Mensagem | 2 - Alterar Mensagem");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            if (opcao == 1) {
                incluirMensagem(sc);
            } else if (opcao == 2) {
                alterarMensagem(sc);
            } else {
                System.out.println("Opção inválida.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void incluirMensagem(Scanner sc) {
        try {
            System.out.println("Digite o ID da mensagem:");
            long id = sc.nextLong();
            sc.nextLine(); // Consumir a quebra de linha

            System.out.println("Digite o assunto:");
            String assunto = sc.nextLine();

            System.out.println("Digite o destinatário:");
            String destinatario = sc.nextLine();

            System.out.println("Digite o remetente:");
            String remetente = sc.nextLine();

            System.out.println("Digite o conteúdo:");
            String conteudo = sc.nextLine();

            System.out.println("Digite o status (0 - não lida, 1 - lida, 2 - armazenada):");
            int status = sc.nextInt();

            LocalDate data = LocalDate.now();

            Mensagem mensagem = new Mensagem(id, assunto, destinatario, remetente, data, conteudo, status);
            MensagemDAO dao = new MensagemDAO();
            dao.inclui(mensagem);

            System.out.println("Mensagem incluída com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao incluir mensagem: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void alterarMensagem(Scanner sc) {
        try {
            System.out.println("Digite o ID da mensagem a ser alterada:");
            long id = sc.nextLong();
            sc.nextLine(); // Consumir a quebra de linha

            System.out.println("Digite o novo assunto:");
            String assunto = sc.nextLine();

            System.out.println("Digite o novo destinatário:");
            String destinatario = sc.nextLine();

            System.out.println("Digite o novo remetente:");
            String remetente = sc.nextLine();

            System.out.println("Digite o novo conteúdo:");
            String conteudo = sc.nextLine();

            System.out.println("Digite o novo status (0 - não lida, 1 - lida, 2 - armazenada):");
            int status = sc.nextInt();

            LocalDate data = LocalDate.now();

            Mensagem mensagem = new Mensagem(id, assunto, destinatario, remetente, data, conteudo, status);
            MensagemDAO dao = new MensagemDAO();
            dao.altera(mensagem);

            System.out.println("Mensagem alterada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao alterar mensagem: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
