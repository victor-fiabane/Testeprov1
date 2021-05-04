/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeprov1;

import java.util.Scanner;

/**
 *
 * @author Sandro Fiabane
 */
public class TesteProv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*faça um algoritmo que receba o nome do vendedor e o salário-bruto.
        Calcule e mostre o salário liquido, sabendo-se que esse funcionário tem 
        um acréscimo de bônus de 5,5% sobre o salário-bruto e paga imposto de 
        renda  - (Se ele receber um salário liquido abaixo de R$ 3.500 descontar
        3,5% sobre o total caso contrário descontar 7,5% sobre o total .
        Mostre a folha de pagamento igual como aparece abaixo:
        Nome: <nome>
        Salario Bruto: R$ <??>
        Bônus: R$ <??>
        I.R: R$ <??>
        Salario Liquido: R$<??>*/
        
        Scanner teclado = new Scanner(System.in);
        double salLiq, salBrut, salBon, ir, salReal, salMeno;
        String nome;
        System.out.println("Qual o nome do funcionario?");
        nome = teclado.nextLine();
        System.out.println("Qual o salário-bruto do funcionario?");
        salBrut = teclado.nextDouble();
        salBon = salBrut * 0.055;
        salLiq = salBrut + salBon;
        if(salLiq<3.500){
            ir = 0.035;
            salMeno = salLiq * ir;
            salReal = salLiq - salMeno;
        }else{
            ir = 0.075;
            salMeno = salLiq * ir;
            salReal = salLiq - salMeno;
        }
        System.out.println("Nome: "+nome+
                " Salário Bruto: R$"+salBrut+
                " Bônus: R$"+salBon+
                " I.R: R$"+salMeno+
                " Salário Liquido: R$"+salLiq);
        
        
        
        
        
        
        
    

    

    
        
    
        
        
    }
    
}
