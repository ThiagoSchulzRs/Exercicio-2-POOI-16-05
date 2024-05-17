package HerancaExercicio2;

//Retângulo com bordas arredondadas
class RetanguloBordasArredondadas extends Retangulo {

    public RetanguloBordasArredondadas(String text) {
        super(text);
    }

    @Override
    public void draw() {
        System.out.println("╭──────────╮");
        System.out.println("│ " + text + " │");
        System.out.println("╰──────────╯");
    }
}
