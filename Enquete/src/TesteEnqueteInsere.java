import java.time.LocalDate;

public class TesteEnqueteInsere {

    public static void main(String[] args) {
        EnqueteDao enqueteDao = new EnqueteDao();
        Enquete novaEnquete = new Enquete();

        novaEnquete.setNome("Qual seu filme favorito?");
        novaEnquete.setDescricao("Uma enquete para saber qual filme as pessoas mais gostam.");
        novaEnquete.setCriador("João Silva");
        novaEnquete.setDataCriacao(LocalDate.now());

        try {
            enqueteDao.insere(novaEnquete);
            System.out.println("Enquete inserida com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}