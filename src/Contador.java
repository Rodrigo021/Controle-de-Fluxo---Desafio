import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scan.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scan.nextInt();

        try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
           throw  new ParametrosInvalidosException();
        }

        int cont = parametroDois - parametroUm;
        for (int i = 0; i < cont; i++) {
            System.out.println(i);
        }
	}
}
