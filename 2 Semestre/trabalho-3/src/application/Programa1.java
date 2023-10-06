package application;

import entities.ContaBancaria;
import exception.SaldoInsuficienteException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;

        try{

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        conta = new ContaBancaria(saldoInicial);

        System.out.print("Digite o valor do saque: ");
        double valorSaque = scanner.nextDouble();


            conta.sacar(valorSaque);
            System.out.println("Saque realizado com sucesso!");
        }
        catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Erro: Digite apenas numeros!");
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            if (conta != null) {
                System.out.println("Saldo atual: " + conta.getSaldo());
            } else {
                System.out.println("Conta não foi inicializada.");
            }
        }

        scanner.close();
    }
}
