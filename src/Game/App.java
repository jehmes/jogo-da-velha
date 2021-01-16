package Game;

import java.util.Scanner;

public class App {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int[][] matriz = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		int escolha;
		boolean n1 = false, n2 = false, n3 = false, n4 = false, n5 = false, n6 = false, n7 = false, n8 = false,
				n9 = false;
		boolean validador = false;
		int[] armazenaNumero = new int[10];
		int contador = 0;
		int contador1 = 0;
		boolean ganhador = false;

		System.out.println("Digite o valor de 1 a 9 que corresponde a posição no jogo");
		System.out.println(" ");
		System.out.println("Escolha o número");
		System.out.println(" ");
		System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
		System.out.println("------------------");
		System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
		System.out.println("------------------");
		System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
		System.out.println(" ");

		for (; ganhador == false;) {
			validador = false; // AQUI RESETA TODA VEZ O VALIDADOR
			escolha = leia.nextInt();
			for (int x = 0; x < armazenaNumero.length; x++) { // ESSE FOR É PARA VERIFICAR SE ALGUM NUMERO DIGITADO É
																// IGUAL AOS ANTERIORES.
				if (armazenaNumero[x] == escolha) { // AQUI VERIFICA SE ALGUM NUMERO DIGITADO É IGUAL AOS ANTERIORES
					validador = true;
				}
			}
			if (validador == false) { // COMO O SISTEMA DE -1 E 1 É BASEADO EM PAR OU IMPAR, ESSA FUNÇÃO SERVE PARA
										// ACRESCENTAR SE O NUMERO DIGITA FOR DIFERENTE DE ALGUM ANTERIOR
				contador1++; // SE FOR DIFERENTE ELE ACRESCENTA E A ORDEM DE PAR E IMPAR N É PERDIDA
			}
			if (validador == false) {
				if (escolha == 1 && (contador1 % 2 == 0) && n1 == false) {
					contador++; // CONTADOR PARA ARMAZENAR OS NUMEROS JA DIGITADOS NA MATRIZ armazenaNumero
					armazenaNumero[contador] = escolha; // AQUI ARMAZENA O NUMERO DIGITADO EM UM ESPAÇO DA MATRIZ
					matriz[2][0] = -1;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n1 = true;
				}
				
				else if (escolha == 1 && (contador1 % 2 != 0 && n1 == false)) {
					matriz[2][0] = 1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n1 = true;
				}
				
				else if (escolha == 2 && (contador1 % 2 == 0 && n2 == false)) {
					matriz[2][1] = -1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n2 = true;
				}
				
				else if (escolha == 2 && (contador1 % 2 != 0 && n2 == false)) {
					matriz[2][1] = 1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n2 = true;
				} 
				
				else if (escolha == 3 && (contador1 % 2 == 0 && n3 == false)) {
					matriz[2][2] = -1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n3 = true;
				}
				
				else if (escolha == 3 && (contador1 % 2 != 0 && n3 == false)) {
					matriz[2][2] = 1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n3 = true;
				} 
				
				else if (escolha == 4 && (contador1 % 2 == 0 && n4 == false)) {
					matriz[1][0] = -1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n4 = true;
				}
				
				else if (escolha == 4 && (contador1 % 2 != 0 && n4 == false)) {
					matriz[1][0] = 1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n4 = true;
				} 
				
				else if (escolha == 5 && (contador1 % 2 == 0 && n5 == false)) {
					matriz[1][1] = -1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n5 = true;
				}
				
				else if (escolha == 5 && (contador1 % 2 != 0 && n5 == false)) {
					matriz[1][1] = 1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n5 = true;
				} 
				
				else if (escolha == 6 && (contador1 % 2 == 0 && n6 == false)) {
					matriz[1][2] = -1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n6 = true;
				}
				
				else if (escolha == 6 && (contador1 % 2 != 0 && n6 == false)) {
					matriz[1][2] = 1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n6 = true;
				} 
				
				else if (escolha == 7 && (contador1 % 2 == 0 && n7 == false)) {
					matriz[0][0] = -1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n7 = true;
				}

				else if (escolha == 7 && (contador1 % 2 != 0 && n7 == false)) {
					matriz[0][0] = 1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n7 = true;
				} 
				
				else if (escolha == 8 && (contador1 % 2 == 0 && n8 == false)) {
					matriz[0][1] = -1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n8 = true;
				}

				else if (escolha == 8 && (contador1 % 2 != 0 && n8 == false)) {
					matriz[0][1] = 1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n8 = true;
				} 
				
				else if (escolha == 9 && (contador1 % 2 == 0 && n9 == false)) {
					matriz[0][2] = -1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n9 = true;
				}

				else if (escolha == 9 && (contador1 % 2 != 0 && n9 == false)) {
					matriz[0][2] = 1;
					contador++;
					armazenaNumero[contador] = escolha;
					System.out.println("Escolha o número");
					System.out.println(" ");
					System.out.println(matriz[0][0] + "\t" + matriz[0][1] + "\t" + matriz[0][2]);
					System.out.println("------------------");
					System.out.println(matriz[1][0] + "\t" + matriz[1][1] + "\t" + matriz[1][2]);
					System.out.println("------------------");
					System.out.println(matriz[2][0] + "\t" + matriz[2][1] + "\t" + matriz[2][2]);
					System.out.println(" ");
					n9 = true;
				}
				
				if ((matriz[0][0] + matriz[1][1] + matriz[2][2] == 3)
						|| (matriz[0][0] + matriz[1][1] + matriz[2][2] == -3)
						|| (matriz[0][0] + matriz[1][0] + matriz[2][0] == 3)
						|| (matriz[0][0] + matriz[1][0] + matriz[2][0] == -3)
						|| (matriz[0][1] + matriz[2][1] + matriz[1][1] == 3)
						|| (matriz[0][1] + matriz[2][1] + matriz[1][1] == -3)
						|| (matriz[0][2] + matriz[1][2] + matriz[2][2] == 3)
						|| (matriz[0][2] + matriz[1][2] + matriz[2][2] == -3)
						|| (matriz[0][0] + matriz[0][1] + matriz[0][2] == 3)
						|| (matriz[0][0] + matriz[0][1] + matriz[0][2] == -3)
						|| (matriz[1][0] + matriz[1][1] + matriz[1][2] == 3)
						|| (matriz[1][0] + matriz[1][1] + matriz[1][2] == -3)
						|| (matriz[2][0] + matriz[2][1] + matriz[2][2] == 3)
						|| (matriz[2][0] + matriz[2][1] + matriz[2][2] == -3))

				{
					ganhador = true;
					System.out.println("Vencedor! Partida finalizada");
				} else if (contador == 9) {
					System.out.println("Empate! Partida finalizada");
					ganhador = true;
				}
			} else
				System.out.println("Escolha outro número");

		}

		leia.close();
	}

}
