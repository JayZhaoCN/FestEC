package com.zhaojiabao.latte.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.zhaojiabao.latte.app.Latte;

/**
 * @author zhaojiabao (zhaojiabao@huami.com)
 */

public class DimenUtil {
    public static int getScreenWidth() {
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
