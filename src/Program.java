import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos serão digitados ");
        int n = sc.nextInt();
        //3 vetores para armazenar nomes, primeiras notas e segundas notas
        String[] nomes = new String[n];
        double[] primeiras = new double[n];
        double[] segundas = new double[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "°" + " aluno ");
            nomes[i] = sc.next();
            primeiras[i] = sc.nextDouble();
            segundas[i] = sc.nextDouble();
        }
        //media, e alunos que estao aprovados
        double media = 0;
        System.out.println("Alunos aprovados ");
        for (int i = 0; i < n ; i++) {
            media = (primeiras[i] + segundas[i]) / 2;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
