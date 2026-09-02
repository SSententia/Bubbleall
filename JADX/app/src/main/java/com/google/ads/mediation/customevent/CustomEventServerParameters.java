package com.google.ads.mediation.customevent;

import androidx.window.embedding.EmbeddingCompat;
import com.google.ads.mediation.MediationServerParameters;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CustomEventServerParameters extends MediationServerParameters {

    @MediationServerParameters.Parameter(name = "class_name", required = EmbeddingCompat.DEBUG)
    public String className;

    @MediationServerParameters.Parameter(name = "label", required = EmbeddingCompat.DEBUG)
    public String label;

    @MediationServerParameters.Parameter(name = "parameter", required = false)
    public String parameter = null;
}
