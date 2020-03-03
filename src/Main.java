import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean prop = false;
        boolean dest = false;
        ArrayList<Conta> contas = new ArrayList<Conta>();
        int op = 10;
        while(op != 0){
            op = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "Digite sua opção \n" +
                                    "1 - Nova Conta\n" +
                                    "2 - Saldo\n" +
                                    "3 - Deposito\n"+
                                    "4 - Saque\n" +
                                    "5 - Transferência"+
                                    "0 - Sair"));
            if(op == 1){
                Conta c1 = new Conta();
                c1.nome = JOptionPane.showInputDialog(
                        "Digite o nome do propietário");
                contas.add(c1);
            }else if(op == 2){
                for(Conta conta: contas){
                    System.out.println("Nome" + conta.nome + "\nSaldo = " + conta.saldo);
                }
            }else if(op == 5){
                String proprietario = JOptionPane.showInputDialog("Digite o nome do proprietário");
                for (Conta conta : contas){
                    if (conta.nome.equals(proprietario)) {
                        prop = true;
                        String destinatario = JOptionPane.showInputDialog("Digite o nome do destinatário");
                        for (Conta contaDestinatario : contas){
                            if (contaDestinatario.nome.equals(destinatario)){
                                dest = true;
                                double valor = Double.parseDouble( JOptionPane.showInputDialog("Digite o valor da transferência"));
                                conta.saldo = conta.saldo - valor;
                                contaDestinatario.saldo = contaDestinatario.saldo + valor;
                            }
                        }
                    }
                    }
                if(prop == false){
                    JOptionPane.showMessageDialog(null, "Proprietário não existe");
                }
                if(dest == false){
                    JOptionPane.showMessageDialog(null, "Destinatário não existe");
                }


            }else if(op == 4){
                double valor = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                "Digite o valor do saque"));
                //c1.saque(valor);

            }
        }
    }
}