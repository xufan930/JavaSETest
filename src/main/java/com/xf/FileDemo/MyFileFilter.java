package com.xf.FileDemo;

import java.io.File;
import java.io.FileFilter;

/**
 * @author : XU
 * @date : 2018/11/15 11:43
 */
public class MyFileFilter implements FileFilter {
    @Override
    public boolean accept(File f) {
        return !f.getName().endsWith(".txt");
    }

}
