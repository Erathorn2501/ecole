import java.util.Random;

//Génération du code : clic droit sur une methode dont les variables sont déclarées, puis "generate"

public class Bateaux {

    //Variables contenant les valeurs caractéristiques du bateau
    private int size;
    private Direction dir;

    static int i;

    public Bateaux(int size, Direction dir) {
        this.size = size;
        this.dir = dir;
    }



    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }

}


