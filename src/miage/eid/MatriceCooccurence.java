package miage.eid;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Maxime BLAISE
 * @version 1.0
 */
public class MatriceCooccurence {

    /**
     * Toutes les valeurs nécessaires à la matrice.
     */
    private final HashMap<CoupleProduits, Integer> valeurs = new HashMap<>();
    
    private final ArrayList<String> listeProduits = new ArrayList<>();

    /**
     * Ajoute le contenu d'un ticket de caisse dans notre matrice.
     *
     * @param listeProduits Liste des produits du ticket de caisse
     */
    public void ajouterTicketCaisse(ArrayList<String> listeProduits) {

    }

    public HashMap<CoupleProduits, Integer> getValeurs() {
        return valeurs;
    }

    public ArrayList<String> getListeProduits() {
        return listeProduits;
    }
    
    
}
