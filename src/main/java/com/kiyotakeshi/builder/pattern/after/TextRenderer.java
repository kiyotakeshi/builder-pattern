package com.kiyotakeshi.builder.pattern.after;

import com.kiyotakeshi.builder.pattern.common.renderer.Renderer;
import com.kiyotakeshi.builder.pattern.common.renderer.color.DefaultColorRenderer;
import com.kiyotakeshi.builder.pattern.common.renderer.color.FontColorRenderer;
import com.kiyotakeshi.builder.pattern.common.renderer.style.renderer.DefaultFontStyleRenderer;
import com.kiyotakeshi.builder.pattern.common.renderer.style.renderer.FontStyleRenderer;
import com.kiyotakeshi.builder.pattern.common.renderer.weight.DefaultFontWeightRenderer;
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

    static class TextRendererBuilder {
        private FontStyleRenderer fontStyleRenderer = new DefaultFontStyleRenderer();
        private FontColorRenderer fontColorRenderer = new DefaultColorRenderer();
        private FontWeightRenderer fontWeightRenderer = new DefaultFontWeightRenderer();

        public TextRendererBuilder withFontStyleRenderer(FontStyleRenderer style){
            this.fontStyleRenderer = style;
            return this;
        }

        public TextRendererBuilder withFontColorRenderer(FontColorRenderer color){
            this.fontColorRenderer = color;
            return this;
        }

        public TextRendererBuilder withFontWeightRenderer(FontWeightRenderer weight){
            this.fontWeightRenderer = weight;
            return this;
        }

        public TextRenderer build(){
            return new TextRenderer(fontStyleRenderer, fontColorRenderer, fontWeightRenderer);
        }
    }
}
