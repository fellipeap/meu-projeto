import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2;
        int op;

        System.out.println("----=====Opções====----");
        System.out.println("| 1 .......... ADIÇÃO |");
        System.out.println("| 2 ....... SUBTRAÇÃO |");
        System.out.print(" Opção: ");
        op = sc.nextInt();

        switch (op) {
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("\n Opção inválida.");
        }

    }
}