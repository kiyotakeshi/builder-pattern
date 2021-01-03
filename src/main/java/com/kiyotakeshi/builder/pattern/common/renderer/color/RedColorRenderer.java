package com.kiyotakeshi.builder.pattern.common.renderer.color;

public class RedColorRenderer implements FontColorRenderer {

    @Override
    public String render(String text) {
            return "<red-color>" + text + "</red-color>";
    }
}
