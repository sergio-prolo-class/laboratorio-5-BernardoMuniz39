package ifsc.poo.interfaces;

import ifsc.poo.modelos.NaveEspacial;

public interface Autonoma {

    default void controlAutomatico(NaveEspacial Nave){
        if(Nave.getVelocidadeAtual() == 0){
            System.out.println("Iniciando controle automátco!");
        }else{
            System.out.println("A nave deve estar completamente parada para ser feito o controle manual!");
        }
    }
}
