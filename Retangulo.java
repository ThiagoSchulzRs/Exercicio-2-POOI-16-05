package HerancaExercicio2;

//Classe base
abstract class Retangulo {
    protected String text;

    public Retangulo(String text) {
        this.text = text;
    }

    public abstract void draw();
}
