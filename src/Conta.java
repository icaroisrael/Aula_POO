import javax.swing.*;

public class Conta {
    String nome;
    double saldo;

    public double getSaldo(){
        return saldo;
    }

    public void deposito(double dep){
        saldo = saldo + dep;
    }
    public void saque(double sac){
        if(saldo >= sac){
            saldo = saldo - sac;
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }


    }
}
