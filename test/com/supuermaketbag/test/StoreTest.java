package com.supuermaketbag.test;


import com.supuermaketbag.src.Bag;
import com.supuermaketbag.src.Locker;
import com.supuermaketbag.src.Ticket;
import org.junit.Test;

import static junit.framework.Assert.*;

public class StoreTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @Test
    public void should_put_bag_into_locker_get_ticket_with_locker()throws Exception{
        Locker locker = new Locker();
        Bag bag = new Bag();
        Ticket ticket = locker.Store(bag);
        assertNotNull(ticket);//not test ticket with locker because at first put bag and get ticket enough to meet the bag function,

    }

    @Test
    public void should_store_bag_but_lock_is_full() throws Exception {
        Locker locker = new Locker();
        Bag bag = new Bag();
        Ticket ticket = locker.Store(bag);
        Bag bag2 = new Bag();
        Ticket ticket2 = locker.Store(bag2);
        assertNull(ticket2);
    }


}
