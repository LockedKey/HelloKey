package com.jiker.keju;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    public class AppRunner {
        private static String receipt="";

        public static void main(String[] args) {
            readFile();
            System.out.print(receipt);
        }

        private static void readFile() {
            String fileName = AppRunner.class.getResource("/testData.txt").getPath();
            try {
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = br.readLine())!=null){
                    ReadPara readPara = new ReadPara(line);
                    Taxi taxi = new Taxi(readPara.getDistance(),readPara.getWaitTime());
                    receipt += taxi.getReceipt() + "\n";
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

