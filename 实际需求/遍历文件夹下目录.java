package diguimulu;

import java.io.File;

public class mulu {
    public static void main(String[] args) {
        File srcfile = new File("/Volumes/笠桓/编程相关/2020Java/01 JavaSE基础");

        gf(srcfile);
    }


    public static void gf(File srcfile) {
        File[] fileArray = srcfile.listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                if (file.isDirectory()) {
                    gf(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}


