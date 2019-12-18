import java.util.Comparator;

public class OrdrePorteComparator implements Comparator<Porte> {


    public int compare(Porte numP1,Porte numP2){
    return numP1.getNumeroDePorte() - numP2.getNumeroDePorte();

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
