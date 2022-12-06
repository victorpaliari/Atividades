import java.util.Scanner;

public class testandoAtividade {
    public static void main(String[] args) {

    int pin = 263258; 
    Scanner scanner = new Scanner (System.in);
    System.out.println ("Digite o PIN: ");
    int numero = scanner.nextInt();
    
    if (numero == pin) {

        System.out.println("PIN digitado corretamente!");
    }

    else {
        System.out.println("PIN incorreto!");
    }


    }
}

