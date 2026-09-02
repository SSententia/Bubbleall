package com.squareup.okhttp.internal;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes2.dex */
public interface Network {
    public static final Network DEFAULT = new Network() { // from class: com.squareup.okhttp.internal.Network.1
        @Override // com.squareup.okhttp.internal.Network
        public InetAddress[] resolveInetAddresses(String str) throws UnknownHostException {
            if (str == null) {
                throw new UnknownHostException("host == null");
            }
            return InetAddress.getAllByName(str);
        }
    };

    InetAddress[] resolveInetAddresses(String str) throws UnknownHostException;
}
