import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAutoroute {
    private List<Route> routes = new ArrayList<Route>();
    private List<Tarif> tarifs = new ArrayList<Tarif>();

    public CompagnieAutoroute(List<Route> routes, List<Tarif> tarifs) {
        this.routes = routes;
        this.tarifs = tarifs;
    }

    public BigDecimal obtenirTarif(Porte Pentree, Porte Psortie){
    }

    private Tarif getTarifCalcule(Porte Pentree, Porte Psortie){
        for(int i = 0; i<tarifs.size();i++){
            getTarifExacte(Pentree(i),Psortie(i));
        }
    }

    private Tarif getTarifExacte(Porte Pentree,Porte Psortie){
        for(int i = 0; i<tarifs.size(); i++){
            if(tarifs.get(i).getEntree().equals(Pentree) && tarifs.get(i).getSortie().equals((Psortie))){
                return tarifs.get(i);
            }
        }
    }

    public void ajouterTarif(Tarif new_Tarif){
        tarifs.add(new_Tarif);

    }

    public void ajouterRoute(Route new_Route){
        routes.add(new_Route);
    }

}
