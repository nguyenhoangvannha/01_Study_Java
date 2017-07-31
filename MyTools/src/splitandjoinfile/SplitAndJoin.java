/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitandjoinfile;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class SplitAndJoin {
    public String splitByAmount(File file, String pathOut, int amount){
        long sourceSize = file.length(); //byte
        long subSize = sourceSize / (amount - 1);
        long subSizeLast = sourceSize % (amount - 1);
        String srcName = file.getName();
         
        RandomAccessFile accessFileIn;
        try {
            accessFileIn = new RandomAccessFile(file, "r");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SplitAndJoin.class.getName()).log(Level.SEVERE, null, ex);
            return "Error: " + ex.toString();
        }
        byte b[] = new byte[(int)subSize];
        RandomAccessFile accessFileOut ;
        for(int i = 0; i < (amount - 1); i++){
            try {
                accessFileIn.read(b);
                accessFileOut = new RandomAccessFile(pathOut + "\\" + srcName + ".part" + (i+1), "rw");
                accessFileOut.write(b);
                accessFileOut.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SplitAndJoin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SplitAndJoin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            accessFileIn.read(b, 0, (int) subSizeLast);
            accessFileOut = new RandomAccessFile(pathOut + "\\" + srcName + ".part" + amount, "rw");
            accessFileOut.write(b, 0, (int) subSizeLast);
            accessFileOut.close();
        } catch (IOException ex) {
            Logger.getLogger(SplitAndJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            accessFileIn.close();
        } catch (IOException ex) {
            Logger.getLogger(SplitAndJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Success";
    }
    public String splitBySize(File file, String pathOut, long size){
        
        return "Fuck";
    }
    public String join(File file, String pathOut){
        String pathIn = file.getParent();
        String nameIn = file.getName();
        String result[] = nameIn.split("\\.part\\d+");
        String name = result[0];
        
        int count = 1;
        File fIn = new File(pathIn + "\\" + name + ".part1");
        File fOut = new File(pathOut + "\\" + name);
        try {
            RandomAccessFile rafOut = new RandomAccessFile(fOut, "rw");
            do{
                try {
                    RandomAccessFile rafIn = new RandomAccessFile(fIn, "r");
                    int length = (int) file.length();
                    byte  b[] = new byte[length];
                    rafIn.read(b);
                    rafOut.write(b);
                    rafIn.close();

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(SplitAndJoin.class.getName()).log(Level.SEVERE, null, ex);
                }
                count ++;
                fIn = new File(pathIn + "\\" + name + ".part" + count);
            }while(fIn.exists());
            rafOut.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SplitAndJoin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SplitAndJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Success";
    }
}
