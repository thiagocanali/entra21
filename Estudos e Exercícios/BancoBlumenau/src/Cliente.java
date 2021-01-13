import java.util.Scanner;

public class Cliente {
	
	public String nome = "Banco Blumenau";
	public String cpf = "00.123.456/0001-00";
	public String rg;
	public String DataNasc;
	public String endereco;
	public String telefone;
	
	
	public Cliente(String nome, String cpf, String rg, String DataNasc, String endereco, String telefone) {
		setnome(nome);
		setcpf(cpf);
		setrg(rg);
		setDataNasc(DataNasc);
		setendereco(endereco);
		settelefone(telefone);
	}
	
	Scanner sc = new Scanner(System.in);
	
	//métodos acessor
	
		public String getnome() {
			return nome;
		}
		
		public String getcpf() {
			return cpf;
		}
		
		public String getrg() {
			return rg;
		}
		
		public String getDataNasc() {
			return DataNasc;
		}
		
		public String getendereco() {
			return endereco;
		}
		
		public String getelefone() {
			return telefone;
		}
	
	//métodos mutator vai alterar
	
		public void setnome(String nome) {
			this.nome = nome;
		}
		
		public String setcpf(String cpf) {
			if (validacpf(cpf)) {
				this.cpf = cpf;
			}
			else {
				return "0010 - CPF inválido";
			}
			return "0000 - CPF inserido com sucesso";
		}
		
		
		public void setrg(String rg) {
			this.rg = rg;
		}
		
		public void setDataNasc(String DataNasc) {
			this.DataNasc = DataNasc;
		}
		
		public void setendereco(String endereco) {
			this.endereco = endereco;
		}
		
		public void settelefone(String telefone) {
			this.telefone = telefone;
		}
		
		private boolean validacpf(String cpf) {
			int digito1 = Integer.valueOf(cpf.substring(0, 0));
			int digito2 = Integer.valueOf(cpf.substring(1, 1));
			int digito3 = Integer.valueOf(cpf.substring(2, 2));
			int digito4 = Integer.valueOf(cpf.substring(4, 4));
			int digito5 = Integer.valueOf(cpf.substring(5, 5));
			int digito6 = Integer.valueOf(cpf.substring(6, 6));
			int digito7 = Integer.valueOf(cpf.substring(8, 8));
			int digito8 = Integer.valueOf(cpf.substring(9, 9));
			int digito9 = Integer.valueOf(cpf.substring(10, 10));
			int digitoV1 = Integer.valueOf(cpf.substring(12,12));
			int digitoV2 = Integer.valueOf(cpf.substring(13,13));
			
			
			int dgV1 = 11 - (((digito1 * 10) + (digito2 * 9) + (digito3 * 8) + (digito4 * 7) + (digito5 * 6) + (digito6 * 5) +
					(digito7 * 4) + (digito8 * 3) + (digito9 * 2)) % 11);
			
			int dgV2 =  11 - (((digito1 * 11) + (digito2 * 10) + (digito3 * 9) + (digito4 * 8) + (digito5 * 7) + (digito6 * 6) +
					(digito7 * 5) + (digito8 * 4) + (digito9 * 3) + (dgV1 * 2)) % 11);
			
			if (dgV2 >= 10) {
				dgV2 = 0;
			}
			
			if (dgV1 == digitoV1 && dgV2 == digitoV2) {
				return true;
			}
			
			return false;
			
		}
	
}