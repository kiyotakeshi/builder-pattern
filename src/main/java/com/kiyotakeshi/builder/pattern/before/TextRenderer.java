package com.kiyotakeshi.builder.pattern.before;

import com.kiyotakeshi.builder.pattern.common.renderer.Renderer;
import com.kiyotakeshi.builder.pattern.common.renderer.color.FontColorRenderer;
import com.kiyotakeshi.builder.pattern.common.renderer.style.renderer.FontStyleRenderer;
import com.kiyotakeshi.builder.pattern.common.renderer.weight.FontWeightRenderer;

class TextRenderer {

    private final FontStyleRenderer fontStyleRenderer;
    private final FontColorRenderer fontColorRenderer;
    private final FontWeightRenderer fontWeightRenderer;

    public TextRenderer(FontStyleRenderer fontStyleRenderer, FontColorRenderer fontColorRenderer, FontWeightRenderer fontWeightRenderer) {
        this.fontStyleRenderer = fontStyleRenderer;
        this.fontColorRenderer = fontColorRenderer;
        this.fontWeightRenderer = fontWeightRenderer;
    }

    void render(String text){
        String renderedText = applyRendering(text, fontStyleRenderer, fontColorRenderer, fontWeightRenderer);
        System.out.println(renderedText);
    }

    // polymorphism
    // private void applyRendering(String text, FontStyleRenderer fontStyleRenderer, FontColorRenderer fontColorRenderer, FontWeightRenderer fontWeightRenderer) {
    private String applyRendering(String text, Renderer... renderers) {
        for (Renderer renderer:renderers){
            text = renderer.render(text);
        }
        return text;
    }
}
