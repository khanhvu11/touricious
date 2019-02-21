package de.hdm_stuttgart.mi.Threads;

import de.hdm_stuttgart.mi.Manager.LocalOfferManager;

public class UpdateThread implements Runnable {
    LocalOfferManager localOfferManager = new LocalOfferManager();

    @Override
    public void run() {
        localOfferManager.removeExpiredOffer();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
