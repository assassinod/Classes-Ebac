import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite  nomes e sobrenomes e os separes dos demais por virgula:");
    String nomes = scan.nextLine();
    String[] nomeseparado = nomes.split(",");
        Arrays.sort(nomeseparado);

        System.out.println("Nomes em ordem alfabética:");

        for (String nome : nomeseparado) {
            System.out.println(nome);
        }
    }


    }

