public class TestaFuncionario {

    public static void main(String[] args) {
        try {
            Funcionario f = new Funcionario();
            f.setNome("João da Silva");
            f.setTipo(Funcionario.Tipo.ADMINISTRATIVO);

            // Chama o método inclui para inserir o Funcionario e atribuir o ID gerado
            new FuncionarioDAO().inclui(f);

            // Exibe o ID gerado pelo banco de dados
            System.out.println("Funcionário inserido com ID: " + f.getId());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
