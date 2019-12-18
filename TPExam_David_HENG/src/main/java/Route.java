import java.util.ArrayList;
import java.util.List;

public class Route {

    private List<Porte> portes = new ArrayList<Porte>();

    public Route(List<Porte> portes) {
        this.portes = portes;
    }

    public void addPorte(Porte new_Porte) {
        portes.add(new_Porte);
    }

    @Override
    public String toString() {
        return "Route{" +
                "portes=" + portes +
                '}';
    }
}
