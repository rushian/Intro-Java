// 1 - Pacote para o curso da Iterasys
package intro;

// 2 - Referencia as bibliotecas


import java.util.Arrays;

// 3 - Classe
public class Medidas {
    // 3.1 Atributos - caracteristicas



    // 3.2 Metodos e funcoes
    public static void main (String [] args) {
        System.out.println("Calculo de areas");
        //Calculo de area
        int largura;
        int comprimento;

        largura = 5;
        comprimento = 6;

        calcularAreaModoCompacto(largura, comprimento);
    }
    public static void calcularAreaModoCompacto(int largura, int comprimento){
        System.out.println("A área é de " + largura * comprimento +
                " m² ("+ largura +" x "+comprimento+")" );
    }
}
