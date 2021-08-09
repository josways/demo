package com.example.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class WeatherTest {

    @Test
    public void aVoid() throws IOException {

        Document doc = Jsoup.connect("http://www.weather.com.cn/weather/101010100.shtml").get();
//        System.out.println(doc.data());
        Elements select = doc.select("body > div.con.today.clearfix > div.left.fl > div:nth-child(1)  > div.c7d > ul > li");

        for (String str :
                select.eachText()) {
            String[] strings = str.split(" ");
            System.out.print("日期：" + strings[0] + "\t");
            System.out.print("天气：" + strings[1] + "\t\t\t");
            System.out.print("温度：" + strings[2] + "\t");
            System.out.println("风力：" + strings[3]);
        }
    }
}
