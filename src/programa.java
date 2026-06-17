import java.util.Scanner;
public class programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


    //botao direito pasta src new java class;
// digitar psvm e apertar tab;

        int a, b, soma;
        double nota;
        String nome;

    System.out.println("Hello World!");

        System.out.println("Digite o primeiro valor");
        a = ler.nextInt();

        System.out.println("Digite o segundo valor");
        b = ler.nextInt();
        ler.nextLine();

        soma = a + b;
        System.out.println("A soma dos valores é: " + soma);
        System.out.printf("A soma dos valores é: %d %n", soma);



        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.println("Digite sua nota");
        nota = ler.nextDouble();
        System.out.printf("Sua nota foi: %2f %n",nota);

        if (nota > 7){
            System.out.printf(" %s, você foi aprovado %n", nome);
        }
        else{
            System.out.println("reprovado");
        }
    }
}