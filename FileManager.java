package com.example.javalessons;

import java.io.*;

public class FileManager {

    public void copyFile(String firstFile, String secondFile) throws Exception {
        try (
                BufferedReader br = new BufferedReader(new FileReader(firstFile));
                PrintWriter pw = new PrintWriter(new FileWriter(secondFile))
        ) {
            int line;
            while ((line = br.read()) != -1) {
                pw.write(line);
            }
            System.out.println("All done");
        } catch (FileNotFoundException e) {
            System.out.println(firstFile + " not found");
        }

    }

    public void deleteFile(String fileToBeDeleted) {

        try {
            File file = new File(fileToBeDeleted);
            if (file.delete()) {
                System.out.println(file.getName() + " is deleted");
            } else {
                System.out.println("deletion failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}