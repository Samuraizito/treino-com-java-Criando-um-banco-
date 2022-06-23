
public class Testabank {
	public static void main(String[] args) {
		Cliente Bruno = new Cliente();

		Bruno.setNome("Bruno Malta");
		Bruno.setCpf("000.000.000-00");
		Bruno.setProfissao("tatuador");

		Conta contaBruno = new Conta(43, 661);
		contaBruno.deposita(1000);

		contaBruno.setTitular(Bruno);

		contaBruno.setAgencia(43);

		System.out.println(contaBruno.getTitular().getNome());
		System.out.println(contaBruno.getTitular());
		System.out.println(contaBruno.getSaldo());
		System.out.println(contaBruno.getAgencia());

		contaBruno.setNumero(661);
		System.out.println(contaBruno.getNumero());
		
		contaBruno.getTitular().setProfissao("programador");
		
		System.out.println(contaBruno.getTitular().getProfissao());
	
		
		

	}
}
