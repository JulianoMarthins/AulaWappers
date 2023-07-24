package programa;


public class Main {
	public static void main(String[] args) {
		
;				
		/*
		 * 		Tudo em java, exceto as classes primitivas, são considerados objetos, porem, podemos utilização
		 * versões de um objeto que representa essas classes primitivas. Essas chamadas são conhecidas como
		 * 		WAPPERS
		 * 
		 * 		A tradução de wappers é algo em torno de empacotador, embrulhar. O conceito é extamente este, uma 
		 * classe que envolve, embrulha os metodos primitivos.
		 * 
		 * 		A chamada desses objetos é simplesmente o nome do metodo primitivo com sua primeira letra maiuscula, 
		 * com excessão ao int e char, que tem como chamada o comando Integer, na realidade, podemos observar que int é uma 
		 * abreviação da palavra Integer, utilizando sua três letras iniciais, assim como o char, que possui chamada
		 * de Character
		 * 
		 */

		
		Byte b = 100; // Chamada do objeto que representa o timpo primitivo byte
		Short s = 1000; // Chamada do objeto que representa o tipo primitivo short
		Integer i = 10000; // Chamada do objetivo que representa o tipo primitivo int
		Long l = 10000000000000L; // Chamada do objeto que representa o tipo primitivo long
		
		
		// Usa método de classe para pegar o valor armazedo na variavel b, que é um tipo primitivo byte
		System.out.println("Valor Byte = " + b.byteValue()); // Retorna no console o valor 100 do objeto Byte
		
		// Utilização de método de classe para pegar o valor armazedo na variavel s, que é um objeto do tipo Short
		System.out.println("Valor Short = " + s.toString()); // Comando toString retorna o valor da variavel s do typo Short
		System.out.println("Valor Integer = " + i);
		System.out.println("Valor Long = " + l);
		/* Podemos converter uma variavel do tipo String, desde que a mesma seja um texto com informações numéricas,
		 * para um numero inteiro com a utilização do comando -> Interger.parceInte(nome da variavel); <-
		*/ 
		
		String textoNumerico = "01164336045"; // CPF deve ser como string e convertido se necessário realizar calculos.
		System.out.println("CPF -> Valor String");
		// Quando convertido, se o primeiro número seja 0, ele será eliminado.
		Integer num = Integer.parseInt(textoNumerico); 
		System.out.println("CPF -> Texto númerico = " + num); // Retorna o número 1146336045
		
		// Podemos converter um valor String para Boolean com o comando Boolean.parseBoolean("true")
		Boolean bol = Boolean.parseBoolean("true"); // Retorna o valor true convertido para Boolean
		System.out.println("Valor Boolean = " + bol); // Valor lógico Booleano impresso no consone
		
		/* Podemos converter um valor boolean para String usando a chamada de um objeto da classe Boolean sendo este
		* codigo -> variavelBooleana.toString();
		*/
		
		/* Abaixo realizamos a conversão de boolean para String chamando o método toUperCase() para imprimir no console
		* o valor da variavel booleana em letras maíusculas
		*/
		System.out.println("Valor String = " + bol.toString().toLowerCase());
		
		
		// Falta o long
		
		Character c = '#';
		System.out.println("Valor Character = " + c.charValue());
		
		
		Float flo = 10.3f;
		System.out.println("Valor Float = " + flo);
		
		Double dou = 15.3;
		System.out.println("Valor Double = " + dou);
	
		
		
		/*
		 * 		Devemos nos atentar na possibilidade de perca de dados durante converção entre alguns tipos primitvos, 
		 *	Conversões de números com maior uso de Bytes da memória do computador para tipos menores haverá perca desses dados
		 *  adicionais que o tipo primitivo não ocupa o mesmo número de dados.
		 *  	Um exemplo disse é a conversão de um número Long para um número classificadamente inferior a ele como um 
		 *  int, short, byte, Assim como conversões de números float ou double pra int.
		 *  
		 *   	Digamos que instanciamos um valor double num = 10.8;
		 *   	Caso conversão para o uso do int seja realizada a nova variavel ficaria com o valor 10, perdendo a informação
		 *   	0.8.
		 *
		 */
		
	}

}
