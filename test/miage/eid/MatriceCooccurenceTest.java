/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.eid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maxime
 */
public class MatriceCooccurenceTest {

    @Test
    public void testAjoutTicketCaisse() throws Exception {
        MatriceCooccurence matrice = new MatriceCooccurence();

        // Initialisation
        assertThat(matrice.getValeurs().size(), is(0));
        assertThat(matrice.getListeProduits().size(), is(0));

        // Ajout d'un ticket de caisse
        ArrayList<String> ticketCaisse = new ArrayList<>(Arrays.asList("Lait", "Eau", "Jouet"));
        matrice.ajouterTicketCaisse(ticketCaisse);

        // Liste des produits après ajout
        assertThat(matrice.getListeProduits().size(), is(3));
        assertThat(matrice.getListeProduits(), hasItems("Lait", "Eau", "Jouet"));
        // Liste des couples après ajout
        assertThat(matrice.getValeurs().size(), is(6));
        CoupleProduits[] couples = {
            new CoupleProduits("Lait", "Lait"),
            new CoupleProduits("Eau", "Eau"),
            new CoupleProduits("Jouet", "Jouet"),
            new CoupleProduits("Lait", "Eau"),
            new CoupleProduits("Lait", "Jouet"),
            new CoupleProduits("Eau", "Jouet")
        };
        for(CoupleProduits couple : couples) {
            assertTrue(matrice.getValeurs().containsKey(couple));
            assertThat(matrice.getValeurs().get(couple), is(1));
        }
        
        // Ajout d'un deuxième ticket de caisse
        // TODO
    }

}
