package listas.lista02;
import java.util.Scanner;
/*
 Leia uma data e determine se ela e valida. Ou seja, verifique se o mês está entre 1 e 12, 
e se o dia existe naquele mês. Note que Fevereiro tem 29 dias em anos bissextos, e 28 
dias em anos nao bissextos. 
 */
public class Exercicio35 {
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
        
        System.out.println("Data válida.");

        input.close();
    }
    }

