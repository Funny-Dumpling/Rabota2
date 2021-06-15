package com.company;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("D:\\23\\LabText.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String name;
        String line;
        System.out.println("Print File " + f.getName() + "? Press key y or n");
        name = br.readLine();
        if (name.equals("y")) {
            while ((line = fin.readLine()) != null) {
                String[] words = line.split("//.*|(\"(?:\\\\[^\"]|\\\\\"|.)*?\")|(?s)/\\*.*?\\*/");
                for (String text: words){
                    System.out.println(text);
                }
            }
        }
        else {
            System.out.println("Restart program.");
        }
    }
}

