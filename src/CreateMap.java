public class createMap {

    static int[][] grille = new int[10][10];

    int i;
    int j;

    for(i = 0; i < 10; i++) {
        for (j = 0; j < 10; j = j + 1) {

            grille[i][j]=0;

        }
    }

}

// 1 créer la map, puis la remplir à zéro = grille complête sans bateaux
// 2 création et placement bateaux