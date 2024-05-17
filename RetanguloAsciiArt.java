package HerancaExercicio2;

//Retângulo com arte ASCII
class RetanguloAsciiArt extends Retangulo {

    public RetanguloAsciiArt(String text) {
        super(text);
    }

    @Override
    public void draw() {
        System.out.println("************");
        System.out.println("* " + text + " *");
        System.out.println("************");
    }
}