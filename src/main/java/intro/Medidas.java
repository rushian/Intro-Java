// 1 - Pacote para o curso da Iterasys
package intro;

// 2 - Referencia as bibliotecas

//import java.util.Arrays;

// 3 - Classe
public class Medidas {
    // 3.1 Atributos - caracteristicas
    static int largura;
    static int comprimento;
    // 3.2 Metodos e funcoes
    public static void main (String [] args) {
        largura = 5;
        comprimento = 6;

        calcularAreaModoCurto(largura, comprimento);
        calcularAreaModoExtenso(largura, comprimento);
    }
    public static void calcularAreaModoCurto(int largura, int comprimento){
        System.out.println("Calculo de areas");
        System.out.println("A área é de " + largura * comprimento +
                " m² ("+ largura +" x "+comprimento+")" );
    }
    public static void calcularAreaModoExtenso(int largura, int comprimento){
        System.out.println("Calculo de areas");
        int resultado;
        resultado = largura * comprimento;
        System.out.println("A área é de " + resultado +
                " m² ("+ largura +" x "+comprimento+")" );
    }
}