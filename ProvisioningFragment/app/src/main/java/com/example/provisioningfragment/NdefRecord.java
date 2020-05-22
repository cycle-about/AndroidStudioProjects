package com.example.provisioningfragment;

import java.io.IOException;

class NdefRecord {

    static NdefRecord createMime(String mimeType, byte[] mimeData) throws IOException {

        if (mimeData.length == 0) {
            throw new IOException();
        }

        return new NdefRecord();
    }
}
