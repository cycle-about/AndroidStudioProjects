package com.example.provisioningfragment;

class NdefMessage {

    private final NdefRecord[] mRecords;

    NdefMessage(NdefRecord[] mRecords) {
        this.mRecords = mRecords;
    }
}
