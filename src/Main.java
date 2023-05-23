import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); 

        System.out.println("Entrer la dimension de la grille sur X");
        int tailleGrilleX = sc.nextInt();

        System.out.println("Entrer la dimension de la grille sur Y");
        int tailleGrilleY = sc.nextInt();

        Grille.setDimensionX(tailleGrilleX);
        Grille.setDimensionY(tailleGrilleY);

        sc.nextLine();
        System.out.println("Entrer la sequence d'instruction");
        String instruction = sc.nextLine();

        System.out.println("Entrer la position initiale sur l'axe des x");
        int posInitAxeX = sc.nextInt();
        System.out.println("Entrer la position initiale sur l'axe des y");
        int posInitAxeY = sc.nextInt();

        sc.nextLine();
        System.out.println("Entrer l'orientation initiale");
        String ortInit = sc.nextLine();


        Aspirateur asp = new Aspirateur(new Position(new Point(posInitAxeX,posInitAxeY),ortInit.charAt(0)));
        asp.execInstructions(instruction, Grille.getDimensionX(), Grille.getDimensionY());
        
        sc.close();
        System.out.println(asp.toString()); 
    }
}
