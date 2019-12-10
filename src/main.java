public class main {


    public static void main(String[] args) {

        //Coordinate coor_map;

        CreateMap map = new CreateMap(); // génération de la map
        Case case_bateau = new Case();

        // Etablissement des bateaux
        // Bateau_1 taille 5, coordonnées de départ 5,4 direction west;

        int axe_x_dep_bateau_1 = 2;
        int axe_y_dep_bateau_1 = 4;
        int size_bateau_1 = 5;

        Bateaux bateau_a_mettre = new Bateaux(5, Direction.WEST);

        //case_bateau.setBateau(bateau_a_mettre);
        //case_bateau.setCase_state(1);

        for(int l= axe_x_dep_bateau_1; l < (axe_x_dep_bateau_1 + size_bateau_1); l++) {
            map.get_case(l, axe_y_dep_bateau_1).setBateau(bateau_a_mettre);
            map.get_case(l, axe_y_dep_bateau_1).setCase_state(1);
            //System.out.println(map.get_case(5,4).Case_state());
        }

        // Bateau_2 taille 4, coordonnées de départ 8,2 direction east;

        int axe_x_dep_bateau_2 = 8;
        int axe_y_dep_bateau_2 = 2;
        int size_bateau_2 = 4;

        for(int k= axe_y_dep_bateau_2; k < (axe_y_dep_bateau_2 + size_bateau_2); k++) {
            map.get_case(axe_x_dep_bateau_2, k).setBateau(bateau_a_mettre);
            map.get_case(axe_x_dep_bateau_2, k).setCase_state(1);}

        // Bateau_3 taille 3, coordonnées de départ 7,6 direction east;

        int axe_x_dep_bateau_3 = 7;
        int axe_y_dep_bateau_3 = 6;
        int size_bateau_3 = 3;

        for(int k= axe_y_dep_bateau_3; k < (axe_y_dep_bateau_3 + size_bateau_3); k++) {
            map.get_case(axe_x_dep_bateau_3, k).setBateau(bateau_a_mettre);
            map.get_case(axe_x_dep_bateau_3, k).setCase_state(1);}

        // Bateau_4 taille 3, coordonnées de départ 6,9 direction north;

        int axe_x_dep_bateau_4 = 5;
        int axe_y_dep_bateau_4 = 8;
        int size_bateau_4 = 3;

        for(int k= axe_x_dep_bateau_4; k > (axe_x_dep_bateau_4 - size_bateau_4); k--) {
            map.get_case(k, axe_y_dep_bateau_4).setBateau(bateau_a_mettre);
            map.get_case(k, axe_y_dep_bateau_4).setCase_state(1);}

        // Bateau_5 taille 2, coordonnées de départ 0,0 direction east;

        int axe_x_dep_bateau_5 = 0;
        int axe_y_dep_bateau_5 = 0;
        int size_bateau_5 = 2;

        for(int k= axe_y_dep_bateau_5; k < (axe_y_dep_bateau_5 + size_bateau_5); k++) {
            map.get_case(axe_x_dep_bateau_5, k).setBateau(bateau_a_mettre);
            map.get_case(axe_x_dep_bateau_5, k).setCase_state(1);}

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (j!=9){
                    System.out.print(map.get_case(i, j).Case_state());
                }
                else
                {System.out.println(map.get_case(i, j).Case_state());}
            }
        }
        //System.out.println(map.get_case(5,4).Case_state());

    }

}
