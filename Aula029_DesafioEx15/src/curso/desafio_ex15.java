package curso;

import java.util.Locale;
import java.util.Scanner;

public class desafio_ex15 {
    public static void main(String[] args) {
        // Configuração do Locale
        Locale.setDefault(Locale.US);
        
        // Objeto Scanner
        try (Scanner sc = new Scanner(System.in)) {
            // Variáveis
            double nota1, nota2, media;
            
            // Entrada de dados
            System.out.print("Nota 1: ");
            nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            nota2 = sc.nextDouble();
            
            // Cálculo
            media = (nota1 + nota2) / 2;
            
            // Saída de dados
            String conceito;
            String situacao;
            
            if (media >= 9.0) {
                conceito = "A";
                situacao = "Aprovado(a)";
            } else if (media >= 8.0) {
                conceito = "B";
                situacao = "Aprovado(a)";
            } else if (media >= 7.0) {
                conceito = "C";
                situacao = "Aprovado(a)";
            } else if (media >= 6.0) {
                conceito = "D";
                situacao = "Recuperação";
            } else {
                conceito = "E";
                situacao = "Reprovado(a)";
            }
            
            System.out.printf("Média: %.2f\nConceito: %s\nSituação: %s\n", media, conceito, situacao);
        }
    }
}


