package com.zhaojiabao.latte.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.zhaojiabao.latte.app.Latte;

/**
 * @author zhaojiabao (zhaojiabao@huami.com)
 */

public class DimenUtil {
    /**
     * 获取屏幕宽度(in pixels)
     */
    public static int getScreenWidth() {
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    /**
     * 获取屏幕高度(in pixels)
     */
    public static int getScreenHeight() {
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
