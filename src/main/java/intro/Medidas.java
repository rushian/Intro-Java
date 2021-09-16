// 1 - Pacote para o curso da Iterasys
package intro;

// 2 - Referencia as bibliotecas

//import java.util.Arrays;

import java.util.Locale;
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 Atributos - caracteristicas
    static int largura;
    static int comprimento;
    static String modo = "extenso";
    static String opcao;
    // 3.2 Metodos e funcoes
    public static void main (String [] args) {
        largura = 5;
        comprimento = 6;

        do{
            Scanner recebe = new Scanner(System.in);
            System.out.println("\nMENU");
            System.out.println("c - Metodo curto");
            System.out.println("e - Metodo extenso");
            System.out.println("i - If Simples");
            System.out.println("d - Contar até 10");
            System.out.println("s - SAIR");
            System.out.println("Digite a opção desejada");

            opcao = recebe.next().toLowerCase();

            switch (opcao) {
                case "s":
                    break;
                case "i":
                    System.out.println("Voce escolheu executar o metodo ifSimples");
                    ifSimples();
                    break;
                case "c":
                    System.out.println("Voce escolheu executar o metodo curto");
                    calcularAreaModoCurto(largura, comprimento);
                    break;
                case "e":
                    System.out.println("Voce escolheu executar o metodo extenso");
                    calcularAreaModoCurto(largura, comprimento);
                    break;
                case "d":
                    System.out.println("Contar até 10");
                    contarAte10();
                    break;
                default:
                    System.out.println("====================\nOpcao invalida\n====================");
                    break;
            }
        } while (!opcao.equals("s"));
        System.out.println("\n====================\nFIM DA EXECUCAO\n====================");
    }

    public static void ifSimples(){
        System.out.println("Executando ifSimples");
        if (modo == "curto"){
            calcularAreaModoCurto(largura, comprimento);
        }
        else{
            calcularAreaModoExtenso(largura, comprimento);
        }
    }

    public static void calcularAreaModoCurto(int largura, int comprimento){
        System.out.println("Calculo de areas Modo Curto");
        System.out.println("A área é de " + largura * comprimento +
                " m² ("+ largura +" x "+comprimento+")" );
    }

    public static void calcularAreaModoExtenso(int largura, int comprimento){
        System.out.println("Calculo de areas Modo Extenso");
        int resultado;
        resultado = largura * comprimento;
        System.out.println("A área é de " + resultado +
                " m² ("+ largura +" x "+comprimento+")" );
    }

    public static void contarAte10(){
        for (int i = 0;i <10;i++){
            if(i<9){
                System.out.print((i +1) + ", ");
            }else {
                System.out.print((i +1));
            }
        }
    }
}