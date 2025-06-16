package ifsc.poo.modelos;
//interface tripulada e blindada
//abstrata de nave espacial

import ifsc.poo.interfaces.Blindada;
import ifsc.poo.interfaces.Tripulada;


public class NaveExploradora extends NaveEspacial 
implements Tripulada, Blindada {
    private boolean holofontes;
    private int qtdTripulantes;
    private  int velocidadeMax = 20;
    private boolean blindagem;

    public NaveExploradora(int qtd) {
        super();
        this.holofontes = false;
        this.qtdTripulantes = qtd;
        this.blindagem = false;
    }

    @Override
    public void acelerar(int i) {
        if(i > 0){
            velocidadeAtual += i;

            if(velocidadeAtual > velocidadeMax){
                this.velocidadeAtual = velocidadeMax;
                System.out.println("Velocidade máxima de " + velocidadeMax + "Mm/h atingida!");
            }

            System.out.println("Aumentando velocidade em " + i + " Mm/h! Velocidade atual da nave: " + velocidadeAtual + " Mm/h");
        }else{
            System.out.println("Erro, velocidade negativa!");
        }
    }

    @Override
    public void frear(int i) {
        if(i > 0){
            velocidadeAtual -= i;

            if(velocidadeAtual == 0){
                pousar();
            }

            System.out.println("Dimunuindo a velocidade em " + i + " Mm/h! Velocidade atual da nave: " + velocidadeAtual + " Mm/h");
        }else{
            System.out.println("Erro, velocidade negativa!");
        }
    }

    @Override
    public boolean ativarBlindagem() {
        velocidadeMax = 14;
        this.blindagem = true;
        return true;
    }

}
