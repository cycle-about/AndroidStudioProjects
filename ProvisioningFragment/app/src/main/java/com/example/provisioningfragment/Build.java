package com.example.provisioningfragment;

public class Build {

    public Build(int sdkInt) {
        VERSION.SDK_INT = sdkInt;
    }

     static class VERSION {

        static int SDK_INT;
    }
}
