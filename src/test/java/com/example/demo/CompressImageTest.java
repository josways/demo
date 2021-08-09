package com.example.demo;

import cn.hutool.core.img.Img;
import cn.hutool.core.io.FileUtil;
import org.junit.jupiter.api.Test;

public class CompressImageTest {
    @Test
    public void aVoid() {
        Img.from(FileUtil.file("D:\\UserData\\Desktop\\新建位图图像.bmp"))
                .setQuality(0.8)//压缩比率
                .write(FileUtil.file("D:\\UserData\\Desktop\\新建位图图像.jpg"));
    }
}
