package listas.lista02;
/*
 As tarifas de certo parque de estacionamento sao as seguintes: 
• 1a e 2a hora - R$ 1,00 cada
• 3a e 4a hora - R$ 1,40 cada
• 5a hora e seguintes - R$ 2,00 cada

O numero de horas a pagar é sempre inteiro e arredondado por excesso. Deste modo, 
quem estacionar durante 61 minutos pagará por duas horas, que é o mesmo que pagaria 
se tivesse permanecido 120 minutos. Os momentos de chegada ao parque e partida
deste sao apresentados na forma de pares de inteiros, representando horas e minutos. 
Por exemplo, o par 12 50 representara “dez para a uma da tarde”. Pretende-se criar um 
programa que, lidos pelo teclado os momentos de chegada e de partida, escreva na tela
o preço cobrado pelo estacionamento. Admite-se que a chegada e a partida se dao com 
intervalo nao superior a 24 horas. Portanto, se uma dada hora de chegada for superior 
a da partida, isso não é uma situação de erro, antes significará que a partida ocorreu no 
dia seguinte ao da chegada.
 */
import java.util.Scanner;
public class Exercicio37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a hora de chegada (hh mm): ");
        int horaChegada = input.nextInt();
        int minutoChegada = input.nextInt();

        System.out.print("Digite a hora de partida (hh mm): ");
        int horaPartida = input.nextInt();
        int minutoPartida = input.nextInt();

        // Tratamento de casos em que a partida ocorre no dia seguinte
        if (horaPartida < horaChegada) {
            horaPartida += 24;
        }

        int duracaoEmMinutos = (horaPartida - horaChegada) * 60 + (minutoPartida - minutoChegada);
        int duracaoEmHoras = (int) Math.ceil((double) duracaoEmMinutos / 60);

        double precoTotal = 0.0;

        // Cálculo do preço de acordo com as tarifas do estacionamento
        if (duracaoEmHoras <= 2) {
            precoTotal = duracaoEmHoras * 1.0;
        } else if (duracaoEmHoras <= 4) {
            precoTotal = 2.0 + (duracaoEmHoras - 2) * 1.4;
        } else {
            precoTotal = 4.8 + (duracaoEmHoras - 4) * 2.0;
        }

        System.out.printf("Preço total a ser pago: R$ %.2f", precoTotal);

        input.close();
    }
}

