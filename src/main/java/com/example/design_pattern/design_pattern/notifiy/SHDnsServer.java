package com.example.design_pattern.design_pattern.notifiy;

/**
 * @author xutong
 */
public class SHDnsServer extends DnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("上海DNS服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".sh.cn");
    }
}
