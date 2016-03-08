/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.eid;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 *
 * @author Maxime BLAISE
 */
public class CoupleProduitsTest {
    
    @Test
    public void testEquals() throws Exception {
        // On créer deux couples avec les mêmes produits mais pas dans le même ordre
        CoupleProduits couple = new CoupleProduits("Lait", "Eau");
        CoupleProduits coupleReverse = new CoupleProduits("Eau", "Lait");
        
        assertThat(couple, equalTo(coupleReverse));
    }
}
