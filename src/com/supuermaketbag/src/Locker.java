package com.supuermaketbag.src;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 11/5/13
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Locker {

    private Bag currentBag;

    public Ticket Store(Bag bag) {
        if(isFull())
            return null;
        this.currentBag = bag;
        return new Ticket();  //To change body of created methods use File | Settings | File Templates.
    }

    private boolean isFull() {
        return this.currentBag != null;
    }
}
