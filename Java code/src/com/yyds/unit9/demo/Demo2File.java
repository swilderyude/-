package com.yyds.unit9.demo;

import java.io.File;

public class Demo2File {
    public static void main(String[] args) throws Exception {
        File file1 = new File("unit9/dir1/dir2");
        // dir2之前的dir1并不存在，所以dir2创建失败
        file1.mkdir();
        File file2 = new File("unit9/test1/test2");
        // 该方法会把整个路径中所有不存在的文件夹全部创建
        file2.mkdirs();
        File file3 = new File("unit9/123.txt");
        // 创建文件
        file3.createNewFile();
        File file4 = new File("unit9/abc.txt");
        // 删除文件
        file4.delete();
        // 将123.txt移动到unit9/test1/test2下，并重命名为456.txt
        file3.renameTo(new File("unit9/test1/test2/456.txt"));
    }
}
