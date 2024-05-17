/*
Desenvolva objetos que sejam capazes de desenhar um retângulo com um texto. 
O retângulo pode conter diferentes tipos de decoração (bordas arrendondadas, linhas duplas, ascii art, colorido, etc). 
Porém cada objeto deve ser capaz de desenhar apenas um tipo de retângulo.
*/

package HerancaExercicio2;

//Classe principal main para testar os retângulo
public class Main {
    public static void main(String[] args) {
        System.out.println("Retângulo com as pontas arredondadas: ");
        Retangulo bordaredonda = new RetanguloBordasArredondadas("        ");
        bordaredonda.draw();
        System.out.println("Retângulo com a borda dupla: ");
        Retangulo linhadupla = new RetanguloLinhasDuplas("        ");
        linhadupla.draw();
        System.out.println("Retângulo com a bordas AsciiArt: ");
        Retangulo asciiArt = new RetanguloAsciiArt("        ");
        asciiArt.draw();
        System.out.println("Retângulo com a borda colorida: ");
        Retangulo colorido = new RetanguloColorido("        ");
        colorido.draw();
        System.out.println("Retângulo simples: ");
        Retangulo simples = new RetanguloSimples("        ");
        simples.draw();
    }
}

