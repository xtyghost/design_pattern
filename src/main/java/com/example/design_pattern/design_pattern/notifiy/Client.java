package com.example.design_pattern.design_pattern.notifiy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 触发链模式模式
 *
 * @author xutong
 */
public class Client {
    public static void main(String[] args) throws IOException {
        SHDnsServer shDnsServer = new SHDnsServer();
        ChinaTopDnsServer chinaTopDnsServer = new ChinaTopDnsServer();
        TopDnsServer topDnsServer = new TopDnsServer();
        chinaTopDnsServer.setUpperServer(topDnsServer);
        shDnsServer.setUpperServer(chinaTopDnsServer);
        System.out.println("===域名解析模拟器");
        while (true) {
            System.out.println("请输入域名（输入N推出）");
            String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if (line.equalsIgnoreCase("n")) {
                return;
            }
            Recorder recorder = new Recorder();
            recorder.setDomain(line);
            shDnsServer.update(null,recorder);
            System.out.println("---dns服务器分析结果--");
            System.out.println(recorder);
        }
    }
}
