public class CreateMap {

    public Case[][] grille = new Case[10][10];

    public CreateMap(){

        for(int i=0; i<10; i++) {
            for (int j = 0; j < 10; j++) {

                Case case_vide = new Case();
                case_vide.setCase_state(0);
                grille[i][j]=case_vide;

            }
        }
    }

    public Case get_case(int x, int y){
        return grille[x][y];
    }

    public void show_map(int x, int y) {
       System.out.print(grille[x][y]);
    }
    //public void set_case()
}

// 1 créer la map, puis la remplir à zéro = grille complête sans bateaux
// 2 création et placement bateaux