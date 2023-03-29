package listas.lista01;
import java.util.Scanner;

/*
 Faca um programa que leia o horario (hora, minuto e segundo) de inicio e a duracao, em 
segundos, de uma experiencia biologica. O programa deve resultar com o novo horario 
(hora, minuto e segundo) do termino da mesma.
 */
public class Exercicio49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o horario do inicio da experiencia (hora): ");
        int horaInicio = sc.nextInt();

        System.out.println("Digite o horario do inicio da experiencia (minutos): ");
        int minutosInicio = sc.nextInt();

        System.out.println("Digite o horario do inicio da experiencia (segundos): ");
        int segundosInicio = sc.nextInt();

        System.out.println("Digite a duracao tempo em segundos: ");
        int tempoSegundos = sc.nextInt();

        int horaDuracao = tempoSegundos / 3600;
        int minutosDuracao = (tempoSegundos % 3600)/60;
        int segundosDuracao = tempoSegundos % 60;

        int horaFinal = horaInicio + horaDuracao;
        int minutosFinal = minutosInicio + minutosDuracao;
        int segundosFinal = segundosInicio + segundosDuracao;

        System.out.println("horario de inicio: " + horaInicio + "h" + minutosInicio + "m" + segundosInicio + "s." +
        "\nduracao da experiencia: " + horaDuracao + "h" + minutosDuracao + "m" + segundosDuracao + "s" +
        "\nhorario do termino:  " + horaFinal + "h" + minutosFinal + "m"
         + segundosFinal + "s");

        sc.close(); 
    }
}
