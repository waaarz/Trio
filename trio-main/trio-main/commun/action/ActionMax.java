package commun.action;

public class ActionMax extends Action {
    
    private static final long serialVersionUID = 1L; 

    private int idCible; 

    public ActionMax(int idJoueur, int idCible) {
        super(idJoueur);
        this.idCible = idCible;
    }

    public int getIdCible() {
        return idCible;
    }

    public void setIdCible(int idCible) {
        this.idCible = idCible;
    }
}