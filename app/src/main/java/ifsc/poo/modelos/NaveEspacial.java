package ifsc.poo.modelos;


public abstract class NaveEspacial {
    private static int count;

    static{
        count = 0;
    }

    private int id;
    protected int velocidadeAtual;
    protected boolean emVoo;

    public NaveEspacial() {
        this.id = count++;
        this.velocidadeAtual = 0;
        this.emVoo = false;
    }


    public abstract void acelerar(int i);

    public abstract void frear(int i);

    public void decolar(){
        System.out.println("Nave decolando!");
        this.emVoo = true;
    }

    public void pousar(){
        System.out.println("Nave pousando!");
        this.emVoo = false;
        this.velocidadeAtual = 0;
    }

    public int getId() {
        return id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public boolean getemVoo(){
        return emVoo;
    }
}