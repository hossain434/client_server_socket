package com.newrelic.codingchallenge;

import org.junit.Test;

public class SocketTestByClientInput {

    private static final Integer PORT = 4000;

    @Test
    public void forClient1_validateServerRespond () {
        ClientSetup client = new ClientSetup();
        client.startConnection("127.0.0.1", PORT);
        client.sendNumbers();
        client.stopConnection();
    }

    @Test
    public void forClient2_validateServerRespond() {
        ClientSetup client = new ClientSetup();
        client.startConnection("127.0.0.1", PORT);
        client.sendNumbers();
        client.stopConnection();
    }

    @Test
    public void forClient3_validateServerRespond() {
        ClientSetup client = new ClientSetup();
        client.startConnection("127.0.0.1", PORT);
        client.sendNumbers();
        client.stopConnection();
    }

    @Test
    public void forClient4_validateServerRespond() {
        ClientSetup client = new ClientSetup();
        client.startConnection("127.0.0.1", PORT);
        client.sendNumbers();
        client.stopConnection();
    }

    @Test
    public void forClient5_validateServerRespond() {
        ClientSetup client = new ClientSetup();
        client.startConnection("127.0.0.1", PORT);
        client.sendNumbers();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        client.stopConnection();
    }

    @Test
    public void forClient6_validateServerRespond() {
        ClientSetup client = new ClientSetup();
        client.startConnection("127.0.0.1", PORT);
        client.sendNumbers();
        client.stopConnection();
    }
}