package miage.eid;

import java.util.Objects;

/**
 *
 * @author Maxime BLAISE
 * @version 1.0
 */
public class CoupleProduits {

    /**
     * Nom du produit 1.
     */
    private final String nomProduits1;

    /**
     * Nom du produit 2.
     */
    private final String nomProduits2;

    /**
     * Crée un couple de produits.
     *
     * @param nomProduits1 Nom du produit 1
     * @param nomProduits2 Nom du produit 2
     */
    public CoupleProduits(String nomProduits1, String nomProduits2) {
        this.nomProduits1 = nomProduits1;
        this.nomProduits2 = nomProduits2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nomProduits1);
        hash = 59 * hash + Objects.hashCode(this.nomProduits2);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CoupleProduits other = (CoupleProduits) obj;
        return (other.nomProduits1.equals(this.nomProduits1) && other.nomProduits2.equals(this.nomProduits2))
                || (other.nomProduits1.equals(this.nomProduits2) && other.nomProduits2.equals(this.nomProduits1));
    }

    public String getNomProduits1() {
        return nomProduits1;
    }

    public String getNomProduits2() {
        return nomProduits2;
    }

}
