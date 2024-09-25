import java.time.LocalDate;

public class exercicio3 {
		
	// Declaração da classe Pessoa

	public static class Pessoa { 
		    String nome; // Declaração de Atributos
		    double altura;
		    LocalDate nascimento;
		    String email;
		    
        // Construtor da classe Pessoa que inicializa os atributos
		public Pessoa (String nome, double altura, LocalDate nascimento) {	
			this.nome=nome;
			this.altura=altura;
			this.nascimento=nascimento;
			this.email=fazerEmail();
			
		}
		
        // Método que formata o e-mail do usuário
		String fazerEmail() {
		        	 String[] partesNome = nome.split(" "); 
		 	        String primeiroNome = partesNome[0].toLowerCase(); // Pega o primeiro nome em letras minúsculas
		 	        String sobrenome = partesNome[partesNome.length - 1].toLowerCase(); // Pega o último sobrenome em letras minúsculas
	                return primeiroNome + "." + sobrenome + "@gmail.com"; // Une as Strings de nome e sobrenome para formar o e-mail	    	 	      
		}
		
        // Método para exibir todos os dados da Pessoa
		String descricao(){
					return
					"Nome: " + this.nome + " \n" + // Exibe o Nome
					"Altura: " + this.altura + " \n"+ // Exibe a Altura
					"Data de Nascimento: " + this.nascimento + " \n"+ // Exibe a Data de Nascimento
					"Email: " + this.email + " \n"; // Exibe o E-mail
		}
		    
				}
		
		public static void main(String[] args) {
			
            // Cria uma instância para preencher os dados da Pessoa
		     Pessoa pessoa1 = new Pessoa("João Silva", 1.75, LocalDate.of(1990, 5, 12));

	        // Exibe os dados
		     System.out.println(pessoa1.descricao());
		}

	}
	
	