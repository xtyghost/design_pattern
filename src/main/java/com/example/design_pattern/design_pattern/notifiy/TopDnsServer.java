package com.example.design_pattern.design_pattern.notifiy;

/**
 * @author xutong
 */
public class TopDnsServer extends DnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("全球顶级dns服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return true;
    }
}
