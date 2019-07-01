package com.lanou.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Element;
import javax.tools.FileObject;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileManager.Location;

public class Practice2 {

    private static final String NUll = null;

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("LICENSE.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("haha.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while((line = br.readLine()) != NUll){
            list.add(line);
        }
        for(int i = list.size() - 1;i >= 0 ;i--){
            bw.write(list.get(i));
            bw.newLine();
        }
        br.close();
        bw.close();
    }

}
