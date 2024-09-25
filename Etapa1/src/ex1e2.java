import java.util.Scanner;
public class ex1e2 {
public static void main(String args[]) {
	
		// Declaração da classe Produto
		class Produto {
			String produto; // Atributos da classe Produto
			String marca;
			double pc;
			double pv;
			double lucro = 0;
			
            // Método para definir o preço de venda e calcular o lucro
			void precovenda(double valor) {
				this.pv = valor; // Atribui o valor para o preço de venda (pv)
				this.lucro = pv - pc; // Calcula o lucro
				
			}
			
			// Método para definir o preço de custo e calcular o lucro
			void precocusto(double valor) {
				this.pc = valor; // Atribui o valor para o preço de custo (pc)
				this.lucro = pv - pc; // Recalcula o lucro
			}
			
            // Construtor da classe recebendo o nome e a marca
			Produto(String produto, String marca){
				this.produto = produto; 
				this.marca = marca; 
				
			}
            // Método que exibe a descrição Produto
			String descricao(){
				return
				"Produto: " + this.produto + " \n" + // Exibe o Nome 
				"Marca: " + this.marca + " \n"+ // Exibe a Marca
				"Preço de Custo: R$ " + this.pc + " \n"+ // Exibe o Preço de Custo
				"Preço de Venda: R$ " + this.pv + " \n"+ // Exibe o Preço de Venda
				"Lucro: R$" + this.lucro +" \n"; // Exibe o Lucro
			}
			
		}
		
        // Criação de Scanners para receber os dados do Produto
		Scanner scannerprod = new Scanner(System.in);
		System.out.print("Digite o nome do Produto: ");
        String produto = scannerprod.nextLine(); // Recebe o Nome
		
        Scanner scannermarca = new Scanner(System.in);
        System.out.print("Digite a Marca: ");
		String marca = scannermarca.nextLine(); // Recebe a Marca
		
		Scanner scannerpc = new Scanner(System.in);
		System.out.print("Digite o Preço de Custo: ");
		double pc = scannerpc.nextDouble(); // Recebe o Preço de Custo
		
		Scanner scannerpv = new Scanner(System.in);
		System.out.print("Digite o preço de Venda: ");
		double pv = scannerpv.nextDouble(); // Recebe o Preço de Venda
		System.out.println("\n");
		
		Produto p1 = new Produto(produto, marca); // Adiciona um objeto com os dados puxados
		p1.precocusto(pc); // Define o Preço de Custo
		p1.precovenda(pv); // Define o Preço de Venda
			
		// Exibe todos os dados fornecidos dos produtos
		System.out.println(p1.descricao());
		System.out.println("\n \n");
	
	}
	
	}
