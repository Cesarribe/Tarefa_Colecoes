import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Ordenar nomes gerais");
        System.out.println("2. Separar nomes masculinos e femininos");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada

        if (opcao == 1) {
            ordenarNomesGerais();
        } else if (opcao == 2) {
            separarNomesMasculinosEFemininos();
        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
        }
    }

    public static void ordenarNomesGerais() {
        List<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome das 5 pessoas, separe por vírgula:");
        String input = scanner.nextLine();
        String[] nomesArray = input.split(", ");

        Collections.addAll(nomes, nomesArray);

        Collections.sort(nomes);

        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void separarNomesMasculinosEFemininos() {
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome das 5 pessoas, para nomes masculinos digite "+"_M " + "no final, para nomes " +
                "femininos, digite " + "_F " +"no final ");
        for (int i = 0; i < 5; i++) {
            String nome = scanner.nextLine();
            if (nome.endsWith("_M")) {
                nomesMasculinos.add(nome);
            } else if (nome.endsWith("_F")) {
                nomesFemininos.add(nome);
            }
        }

        Collections.sort(nomesMasculinos);
        Collections.sort(nomesFemininos);

        System.out.println("\nNomes masculinos em ordem alfabética:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes femininos em ordem alfabética:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }
    }
}