package de.hdm_stuttgart.mi;

import de.hdm_stuttgart.mi.Exception.NoCityFoundException;
import de.hdm_stuttgart.mi.Model.Human.Local;
import de.hdm_stuttgart.mi.Model.Human.Tourist;
import de.hdm_stuttgart.mi.Model.Things.LocalOffer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test of {@link App}.
 */
public class AppTest {

    @Test
    public void findingOfferTest() throws NoCityFoundException {
        /**
         * First LocalOffer created
         */
        LocalOffer lo = new LocalOffer();
        lo.setCity("Frankfurt");
        lo.setName("Swimming");
        lo.setDescription("Swimmung under the sun");

        /**
         * Second LocalOffer created
         */
        LocalOffer lo1 = new LocalOffer();
        lo1.setCity("Muenchen");
        lo1.setName("Sky diving");
        lo1.setDescription("flying like a bird");

        /**
         * Third LocalOffer created
         */
        LocalOffer lo2 = new LocalOffer();
        lo2.setCity("Frankfurt");
        lo2.setName("Dancing");
        lo2.setDescription("Dancing with the star");

        /**
         * LocalOffers added to Source List
         */
        Local lm = new Local();
        lm.addToOfferList(lo);
        lm.addToOfferList(lo1);
        lm.addToOfferList(lo2);

        /**
         * Expected list of offers from Frankfurt
         */
        ArrayList<LocalOffer> result = new ArrayList<>();
        result.add(lo);
        result.add(lo2);

        /**
         * Expected list of offers from Muenchen
         */
        ArrayList<LocalOffer> result1 = new ArrayList<>();
        result1.add(lo1);

        Tourist tourist = new Tourist();

        Assert.assertEquals("Offers from Frankfurt",tourist.findingOffer("Frankfurt"),result);
        Assert.assertEquals("Offers from Muenchen",tourist.findingOffer("Muenchen"),result1);
        Assert.assertNotEquals(tourist.findingOffer("Frankfurt"),result1);

    }

}