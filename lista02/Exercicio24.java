package listas.lista02;
/*
 Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado
possui uma taxa diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%; MS
8%). Faca um programa em que o usuario entre com o valor e o estado destino do 
produto e o programa retorne o preco final do produto acrescido do imposto do estado
em que ele sera vendido. Se o estado digitado nao for valido, mostrar uma mensagem 
de erro.
 */
import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorProduto = input.nextDouble();

        input.nextLine();

        System.out.println("Digite o estado de destino do produto(MG, MS, SP, RJ): ");
        String estado = input.nextLine();

        switch (estado) {
            case "MG":
            case "Minas Gerais":
                double impostoMG = 0.07 * valorProduto;
                System.out.println("Valor final do produto com impostos: R$" + (valorProduto + impostoMG));
                break;
            case "MS":
            case "Mato Grosso do Sul":
                double impostoMS = 0.07 * valorProduto;
                System.out.println("Valor final do produto com impostos: R$" + (valorProduto + impostoMS));    
                break;
            case "SP":
            case "São Paulo":
                double impostoSP = 0.07 * valorProduto;
                System.out.println("Valor final do produto com impostos: R$" + (valorProduto + impostoSP));  
                break;
            case "RJ":
            case "Rio de Janeiro":
                double impostoRJ = 0.07 * valorProduto;
                System.out.println("Valor final do produto com impostos: R$" + (valorProduto + impostoRJ));           
                break;                         
            default:
                System.out.println("Digite um estado válido.");
                break;
        }

        input.close();
    }
}
