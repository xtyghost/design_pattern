package com.example.design_pattern.design_pattern.notifiy;

/**
 * @author xutong
 */
public class ChinaTopDnsServer extends DnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("中国顶级dns服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".cn");
    }
}
