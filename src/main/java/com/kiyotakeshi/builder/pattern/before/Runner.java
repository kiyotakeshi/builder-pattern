package com.kiyotakeshi.builder.pattern.before;

import com.kiyotakeshi.builder.pattern.common.renderer.color.DefaultColorRenderer;
import com.kiyotakeshi.builder.pattern.common.renderer.color.RedColorRenderer;
import com.kiyotakeshi.builder.pattern.common.renderer.style.renderer.DefaultFontStyleRenderer;
import com.kiyotakeshi.builder.pattern.common.renderer.weight.BoldFontWeightRenderer;
import com.kiyotakeshi.builder.pattern.common.renderer.weight.DefaultFontWeightRenderer;

public class Runner {

    public static void main(String[] args) {
        var textRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new DefaultColorRenderer(), new DefaultFontWeightRenderer());
        textRenderer.render("Default Rendering");

        var redRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new RedColorRenderer(), new DefaultFontWeightRenderer());
        redRenderer.render("Red Color Rendering");

        var boldRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new DefaultColorRenderer(), new BoldFontWeightRenderer());
        boldRenderer.render("Bold Rendering");
    }
}
