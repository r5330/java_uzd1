import java.util.Random;

public class Uzduotis1 {
    public static void main(String[] args) {
        System.out.println("-----Laimingo bilieto generavimas-----");

        Random random = new Random();
        int[] ticket = new int[6];
        int attempts = 0;


        while (true) {
            boolean[] unique = new boolean[10];

            for (int i = 0; i < ticket.length; i++) {
                int rnd;

                do {
                    rnd = random.nextInt(10);
                } while (unique[rnd]);

                ticket[i] = rnd;
                unique[rnd] = true;
                System.out.print(ticket[i]);
            }

            System.out.println();
            attempts++;

            if (ticket[0] + ticket[1] + ticket[2] == ticket[ticket.length-3] + ticket[ticket.length-2] + ticket[ticket.length-1]) {
                System.out.print("Laimingas bilietas buvo rastas: ");

                for (int i = 0; i < ticket.length; i++) {
                    System.out.print(ticket[i]);
                }

                System.out.println();
                System.out.println("Prireike "+attempts+" bandymu");
                break;
            }
        }
    }
}