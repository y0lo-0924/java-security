package com.y0lo;

import java.io.IOException;

public class CE02 {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("calc");
        Process process = pb.start();
        System.out.println(process);
    }
}
