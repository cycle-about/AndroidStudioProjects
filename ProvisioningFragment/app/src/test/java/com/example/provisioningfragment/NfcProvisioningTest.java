package com.example.provisioningfragment;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class NfcProvisioningTest {

    private Map<String, String> mProvisioningValues;
    private NfcProvisioningFragment fragment = new NfcProvisioningFragment();
    private NfcEvent nfcEvent = new NfcEvent();

    @Test
    public void testCase1() {
        mProvisioningValues = null;
        Assertions.assertNull(fragment.createNdefMessage(nfcEvent));
    }

    @Test
    public void testCase2() {
        mProvisioningValues = new HashMap<>();
        mProvisioningValues.put("", "testValue");
        Assertions.assertThrows(IOException.class, () -> {
            fragment.createNdefMessage(nfcEvent);
        });
    }
}
