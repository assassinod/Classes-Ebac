import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> Nmasculino = new ArrayList<>();
        ArrayList<String> Nfeminino = new ArrayList<>();

        System.out.println("Digite Seu nome e se sexo separado por '-'.");
        String nome = scan.nextLine();
        String[] partes = nome.split(" ");

        for (String nome1 : partes) {
            String[] nomeespacado = nome1.split("-");
            if (nomeespacado.length == 2) {
                String nomeP = nomeespacado[0];
                String sexo = nomeespacado[1];

                if (sexo.equalsIgnoreCase("F")) {
                    Nfeminino.add(nomeP);
                } else if (sexo.equalsIgnoreCase("M")) {
                    Nmasculino.add(nomeP);
                } else {
                    System.out.println("Sexo inválido para o usuário: ");
                }
            }
        }

        System.out.println("Nomes masculinos:");
        for(String nomeM:Nmasculino){
            System.out.println(nomeM);
        }
        System.out.println("Nomes Femininos:");
        for(String nomeF:Nfeminino){
            System.out.println(nomeF);
        }





}
}

