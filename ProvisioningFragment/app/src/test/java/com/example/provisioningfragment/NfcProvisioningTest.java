package com.example.provisioningfragment;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class NfcProvisioningTest {

    private Map<String, String> mProvisioningValues;
    private NfcProvisioningFragment fragment = new NfcProvisioningFragment();
    private NfcEvent nfcEvent = new NfcEvent();

    @Test
    public void testCase1() {
        mProvisioningValues = null;
        Assert.assertNull(fragment.createNdefMessage(nfcEvent));
    }
}
