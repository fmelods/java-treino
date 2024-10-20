import java.time.LocalDate;

public class TesteEnqueteAltera {

    public static void main(String[] args) {
        EnqueteDao enqueteDao = new EnqueteDao();
        Enquete enqueteAlterada = new Enquete();

        enqueteAlterada.setId(1);
        enqueteAlterada.setNome("Qual sua série favorita?");
        enqueteAlterada.setDescricao("Atualizando a enquete para perguntar sobre séries.");
        enqueteAlterada.setCriador("João Silva");
        enqueteAlterada.setDataCriacao(LocalDate.of(2023, 9, 10));

        try {
            enqueteDao.altera(enqueteAlterada);
            System.out.println("Enquete alterada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
