package sintaxeVariavesFluxos;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 13;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (idade >= 18 || acompanhado == true) {
			System.out.println("Seja bem vindo");
		}else {
				System.out.println("Infelizmente não podem entrar");
			}
		}
	}




/*
 * || = ou
 * && = e
 */