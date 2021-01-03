package com.kiyotakeshi.builder.pattern.common.renderer.style.renderer;

public class DefaultFontStyleRenderer implements FontStyleRenderer {

    @Override
    public String render(String text) {
        return "<default-style>" + text + "</default-style>";
    }
}
