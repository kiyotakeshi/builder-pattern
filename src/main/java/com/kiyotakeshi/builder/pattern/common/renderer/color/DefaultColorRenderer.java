package com.kiyotakeshi.builder.pattern.common.renderer.color;

public class DefaultColorRenderer implements FontColorRenderer{

    @Override
    public String render(String text) {
            return "<default-color>" + text + "</default-color>";
    }
}
