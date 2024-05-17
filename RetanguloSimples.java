package HerancaExercicio2;

//Retângulo Simples
class RetanguloSimples extends Retangulo{

    public RetanguloSimples(String text) {
        super(text);
    }

    @Override
    public void draw() {
        System.out.println(" -----------");
        System.out.println("| " + text + " |");
        System.out.println(" -----------");
    }
}
