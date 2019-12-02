import java.util.Random;

public class Bateaux {

    //Variables contenant les valeurs caractéristiques du bateau
    private int size;
    private String name;
    private Direction dir;


    //Construction du modèle par défaut
    public Bateaux(){
        size = 0;
        dir = Direction.NORTH;
        name = "inconnu";
    }

    public static void Bateaux(int size, String name, Direction dir){

        Random r = new Random();
        int valeur = 0 + r.nextInt(9 - 0);

        System.out.println("Création bateaux");
        System.out.println("Bateau taille " + size);



    }


}


