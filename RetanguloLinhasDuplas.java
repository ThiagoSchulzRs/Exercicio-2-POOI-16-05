package HerancaExercicio2;

//Retângulo com linhas duplas
class RetanguloLinhasDuplas extends Retangulo {

    public RetanguloLinhasDuplas(String text) {
        super(text);
    }

    @Override
    public void draw() {
        System.out.println("╔══════════╗");
        System.out.println("║ " + text + " ║");
        System.out.println("╚══════════╝");
    }
}
