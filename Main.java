import java.util.Scanner;
public class Main {
    /*
    1) Faça uma Tabuada, onde o usuário entre com o valor e o operador que deseja saber a tabuada. exemplo: usuario entra com o numero 5 e o sinal de +,
    irei mostrar na tela a tabuada da soma: 5 + 1 = 6, 5 + 2 = 7, 5 + 3 = 8... se o sinal for o * : 5 * 1 = 5, 5 * 2 = 10, 5 * 3 = 15...
Dica: vocês irão usar um if para saber o sinal e o laço for iniciando a variável contadora em 1 e passando o contador como multiplicador do numero recebido.

     */

    public static void Tabuada(int numero,String operador){
        switch (operador) {
            case "*":
                for(int i = 1; i <= 10;i++){
                    System.out.println(numero +" * "+ i +" = "+ (numero*i));
                }
                break;
            case "/":
                for(int i = 1; i <= 10;i++){
                    System.out.println(numero +" / "+ i +" = "+ (numero/i));
                }
                break;
            case "+":
                for(int i = 1; i <= 10;i++){
                    System.out.println(numero +" + "+ i +" = "+ (numero+i));
                }
                break;
            case "-":
                for(int i = 1; i <= 10;i++){
                    System.out.println(numero +" - "+ i +" = "+ (numero-i));
                }
                break;
        }
    }

    public static void main(String[] args) {
        Boolean run = true;

        while(run){
        System.out.println("\n\nAtividade SENAI 27/4/2022 - Atividade Tabuada - Curso: Desenvolvedor Java Vespertino");
        System.out.println("Deve ser feito uma tabuada onde o usuário insere o número e operador");
        System.out.println("Operadores: * (multiplicação), / (divisão), + (soma), - (subtração)\n\n");

        try{
            System.out.print("Digite um número inteiro: ");
            int numero = new Scanner(System.in).nextInt();

            System.out.print("Digite o operador: ");
            String operador = new Scanner(System.in).nextLine();

            if(operador.equals("*") || operador.equals("/") || operador.equals("+") || operador.equals("-")){
                Tabuada(numero,operador);
                System.out.println("\n\nFechar programa? \ns/sim = fecha programa\noutros digitos = não fecha programa");
                String fechar = new Scanner(System.in).nextLine();

                if(fechar.toUpperCase().equals("SIM") ||fechar.toUpperCase().equals("S")){
                    run = false;
                    break;
                }

            }else{
                System.out.println("\n\nDIGITE UM OPERADOR VÁLIDO!\n\n");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("\n\nDIGITE UM NÚMERO INTEIRO!\n\n");
        }
        }
    }
}
