import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        //botao direito pasta src new java class;
// digitar psvm e apertar tab;

        int a, b, soma, num;
        double nota, media;
        String nome;

        System.out.println("Hello World!");

        System.out.println("Digite o primeiro valor");
        a = ler.nextInt();
        if (a > 10 || a < 0) {
            System.out.println("Digite um valor entre 0 e 10");
            a = ler.nextInt();
        } else {

            System.out.println("Digite o segundo valor");
            b = ler.nextInt();
            ler.nextLine();
            if (b > 10 || b < 0) {
                System.out.println("Digite um valor entre 0 e 10");
                b = ler.nextInt();
            } else {
                soma = a + b;
                System.out.println("A soma dos valores é: " + soma);
                System.out.printf("A soma dos valores é: %d %n", soma);
                soma = soma / 2;

                System.out.println("Digite seu nome: ");
                nome = ler.nextLine();

                System.out.println("Digite sua nota de trabalho");
                nota = ler.nextDouble();


                media = ((nota + soma) / 2);

                System.out.printf("Sua media foi: %2f %n", media);

                if (media > 7) {
                    System.out.printf(" %s, você foi aprovado %n", nome);
                } else {
                    System.out.println("reprovado");
                }
                num = (int) media;

                switch (num) {
                    case 10:
                        System.out.println("Aluno nota 10");
                        break;
                    case 9:
                        System.out.println("Aluno mediano+");
                        break;
                    case 8:
                        System.out.println("Aluno mediano");
                        break;
                    case 7:
                        System.out.println("Aluno mediano");
                        break;
                    case 6:
                        System.out.println("Aluno abaixo da média");
                        break;
                }

            }
        }
    }
}