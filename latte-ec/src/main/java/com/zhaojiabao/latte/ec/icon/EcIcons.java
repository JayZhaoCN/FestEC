package com.zhaojiabao.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * @author zhaojiabao 2017/9/11
 */

public enum EcIcons implements Icon {
    icon_sunny('\ue6b1');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
