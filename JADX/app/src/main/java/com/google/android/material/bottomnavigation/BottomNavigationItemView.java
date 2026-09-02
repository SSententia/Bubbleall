package com.google.android.material.bottomnavigation;

import android.content.Context;
import com.google.android.material.C1218R;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: loaded from: classes2.dex */
public class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    protected int getItemLayoutResId() {
        return C1218R.layout.design_bottom_navigation_item;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    protected int getItemDefaultMarginResId() {
        return C1218R.dimen.design_bottom_navigation_margin;
    }
}
