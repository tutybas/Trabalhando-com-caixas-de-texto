package caixas.de.texrto;

import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args) {    
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");

        int idade;
        String A = JOptionPane.showInputDialog("Digite a sua idade:");
        idade = Integer.parseInt(A);
        // tive a liberdade de criar nomes paras os planos
        if(idade<=10){
            JOptionPane.showMessageDialog(null,"O plano infantil custa R$30,00","Plano infantil",0);
        }
        if(idade>10 && idade<=29){
            JOptionPane.showMessageDialog(null,"O plano junior custa R$60,00","Plano junior",0);
        }
        if(idade>29 && idade<=45){
            JOptionPane.showMessageDialog(null,"O plano meia idade custa R$120,00","Plano meia idade",0);
        }
        if(idade>45 && idade<=59){
            JOptionPane.showMessageDialog(null,"O plano senior R$150,00","Plano senior",0);
        }
        if(idade>59 && idade<=65){
            JOptionPane.showMessageDialog(null,"O plano senior plus custa R$250,00","Plano senior plus",0);
        }
        if(idade>65){
            JOptionPane.showMessageDialog(null,"O plano sejnior plus plus custa R$400,00","Plano senior plus plus",0);
        }
        
    }
}