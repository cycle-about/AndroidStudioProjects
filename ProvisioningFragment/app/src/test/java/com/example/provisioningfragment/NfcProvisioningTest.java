package com.example.provisioningfragment;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class NfcProvisioningTest {

    private Map<String, String> mProvisioningValues;
    private NfcProvisioningFragment fragment = new NfcProvisioningFragment();
    private NfcEvent nfcEvent = new NfcEvent();

    @Test
    void testCase1() {
        mProvisioningValues = null;
        Assertions.assertNull(fragment.createNdefMessage(nfcEvent));
    }

    @Test
    void testCase2() {
       // infeasible test requirement
    }

    @Test
    void testCase3() {
        // infeasible test requirement
    }

    @Test
    void testCase5() {
        // infeasible test requirement
    }

    @Test
    void testCase7() {
        // infeasible test requirement
    }

    @Test
    void testCase12() {
        // infeasible test requirement
    }
}
