public class Case {

    public int getCase_state() {
        return case_state;
    }

    public void setCase_state(int case_state) {
        this.case_state = case_state;
    }

    int case_state;

    Bateaux bateau;

    public Bateaux getBateau() {
        return bateau;
    }

    public void setBateau(Bateaux bateau) {
        this.bateau = bateau;
    }

    public Case (){

    }

    public String Case_state(){
        switch (case_state){
            case 0 : return "~"; // vague
            case 1 : return "^"; // bateau
            case 2 : return  "*"; // bateau touché
        }
        return null;
    }



}
