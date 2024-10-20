import java.util.List;

public class TesteEnqueteRecupera {

    public static void main(String[] args) {
        EnqueteDao enqueteDao = new EnqueteDao();

        try {
            List<Enquete> enquetes = enqueteDao.recupera();
            for (Enquete enq : enquetes) {
                System.out.println("ID: " + enq.getId());
                System.out.println("Nome: " + enq.getNome());
                System.out.println("Descrição: " + enq.getDescricao());
                System.out.println("Criador: " + enq.getCriador());
                System.out.println("Data de Criação: " + enq.getDataCriacao());
                System.out.println("--------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
