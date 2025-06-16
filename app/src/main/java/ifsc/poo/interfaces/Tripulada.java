package ifsc.poo.interfaces;

import ifsc.poo.modelos.NaveEspacial;

public interface Tripulada {
    public static final int MAXIMO_TRIPULANTES = 10;

    default void controleManual(NaveEspacial Nave){
        if(Nave.getVelocidadeAtual() == 0){
            System.out.println("Iniciando controle Manual!");
        }else{
            System.out.println("A nave deve estar completamente parada para ser feito o controle manual!");
        }
    }

}
