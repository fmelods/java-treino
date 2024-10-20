public class TesteEnqueteDeleta {

    public static void main(String[] args) {
        EnqueteDao enqueteDao = new EnqueteDao();

        long idParaDeletar = 1;  // ID da enquete a ser deletada

        try {
            enqueteDao.deleta(idParaDeletar);
            System.out.println("Enquete deletada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
