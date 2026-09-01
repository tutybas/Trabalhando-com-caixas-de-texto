package caixas.de.texrto;

import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args) {
        int idade;
        String A = JOptionPane.showInputDialog("Digite a sua idade:");
        idade = Integer.parseInt(A);
        if(idade<16){
            JOptionPane.showMessageDialog(null,"voce não é um leitor","Tipo de Eleitor",0);
        }
        else if(idade>=18 && idade<65){
            JOptionPane.showMessageDialog(null,"voce é um leitor obrigatório","Tipo de Eleitor",0);    
            }   
        else{
            JOptionPane.showMessageDialog(null,"voce é um leitor facultativo","Tipo de Eleitor",0);
        }
    }

}
