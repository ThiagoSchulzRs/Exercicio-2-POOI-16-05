package HerancaExercicio2;

//Retângulo colorido
class RetanguloColorido extends Retangulo {

    public RetanguloColorido(String text) {
        super(text);
    }

    @Override
    public void draw() {
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_RED + "############" + ANSI_RESET);
        System.out.println(ANSI_RED + "# " + text + " #" + ANSI_RESET);
        System.out.println(ANSI_RED + "############" + ANSI_RESET);
    }
}