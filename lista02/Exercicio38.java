package listas.lista02;
/*
 Leia uma data de nascimento de uma pessoa fornecida atraves de tres números inteiros: 
Dia, Mês e Ano. Teste a validade desta data para saber se esta é uma data válida. Teste 
se o dia fornecido e um dia válido: dia  > 0, dia ≤ 28 para o mes de fevereiro (29 se o 
ano for bissexto), dia ≤ 30 em abril, junho, setembro e novembro, dia ≤ 31 nos outros
meses. Teste a validade do mês: mês > 0 e mês < 13. Teste a validade do ano: ano ≤
ano atual (use uma constante definida com o valor igual a 2008). Imprimir: “data valida” ´
ou “data invalida” no final da execução do programa. 
 */
import java.util.Scanner;
public class Exercicio38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma data (no formato dd/mm/aaaa): ");
        String data = input.nextLine();
        input.close();
        
        String[] partesData = data.split("/");
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);
        
        boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
        int diasNoMes = 0;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasNoMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasNoMes = 30;
                break;
            case 2:
                diasNoMes = anoBissexto ? 29 : 28;
                break;
            default:
                System.out.println("Data inválida: mês inválido.");
                return;
        }
        
        if (dia < 1 || dia > diasNoMes) {
            System.out.println("Data inválida: dia inválido.");
            return;
        }

        if (ano > 2023){
            System.out.println("Data inválida: ano inválido.");
            return;
        }
        
        System.out.println("Data válida.");

        input.close();
    }
}
