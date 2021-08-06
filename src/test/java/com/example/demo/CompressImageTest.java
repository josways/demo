package com.example.demo;

import cn.hutool.core.img.Img;
import cn.hutool.core.io.FileUtil;

public class CompressImageTest {
    public static void main(String[] args) {
        Img.from(FileUtil.file("D:\\UserData\\Desktop\\新建位图图像.bmp"))
                .setQuality(0.8)//压缩比率
                .write(FileUtil.file("D:\\UserData\\Desktop\\新建位图图像.jpg"));
    }
}
