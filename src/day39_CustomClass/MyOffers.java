package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo("Washington DC", true, 100000, true, "QA");
        offer2.setOfferInfo("San Francisco", true, 120000, true, "SDET");
        offer3.setOfferInfo("Los Angeles", true, 115000, true, "QA");
        offer4.setOfferInfo("Chicago", false, 100000, true, "SDET");
        offer5.setOfferInfo("Seattle", true, 130000, true, "QA");
        offer6.setOfferInfo("Phoenix", false, 110000, true, "BA");
        offer7.setOfferInfo("Tampa", false, 150000, true, "Developer");


        ArrayList<Offer> offersList = new ArrayList<>();
        offersList.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));


        //2.write a program that can only keep the offers from local area
        //offersList.removeIf(each -> !each.location.equals("Virginia") && !each.location.equals("Washington DC") && !each.location.equals("Maryland"));

        //3.write a program that can remove all the offers that are not SDET of QA
        //offersList.removeIf(each -> !each.jobTitle.equals("QA") && !each.jobTitle.equals("SDET"));


        // 4.write a program that can remove all the offers that are not WFH
        //offersList.removeIf(each -> each.WFH == false);

        //5.write a program that can remove all the offers that are not have benefits
        offersList.removeIf(each -> each.hasBenefits == false);

        for (Offer all : offersList) {
            all.getOfferInfo();
        }
    }
    }
