import java.util.Objects;

public class Porte {
    private int numeroDePorte;

    public int getNumeroDePorte() {
        return numeroDePorte;
    }

    public void setNumeroDePorte(int numeroDePorte) {
        this.numeroDePorte = numeroDePorte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Porte porte = (Porte) o;
        return numeroDePorte == porte.numeroDePorte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDePorte);
    }

    @Override
    public String toString() {
        return "Porte{" +
                "numeroDePorte=" + numeroDePorte +
                '}';
    }
}
