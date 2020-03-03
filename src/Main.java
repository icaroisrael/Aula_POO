import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        int op = 10;
        while(op != 0){
            op = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "Digite sua opção \n" +
                                    "1 - Nova Conta\n" +
                                    "2 - Saldo\n" +
                                    "3 - depositp\n"+
                                    "4 - saque\n" +
                                    "0 - Sair"));
            if(op == 1){
                c1.nome = JOptionPane.showInputDialog(
                        "Digite o nome do propietário");
            }else if(op == 2){
                System.out.println(
                        "Nome = " + c1.nome +
                        "Saldo = " + c1.getSaldo());
            }else if(op == 3){
                double valor = Double.parseDouble(
                        JOptionPane.showInputDialog(
                       "Digite o valor do deposito"));
                c1.deposito(valor);
            }else if(op == 4){
                double valor = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                "Digite o valor do saque"));
                c1.saque(valor);

            }
        }
    }
}