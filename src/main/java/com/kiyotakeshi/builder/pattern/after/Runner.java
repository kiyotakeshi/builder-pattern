package com.kiyotakeshi.builder.pattern.after;

import com.kiyotakeshi.builder.pattern.common.renderer.color.RedColorRenderer;
import com.kiyotakeshi.builder.pattern.common.renderer.weight.BoldFontWeightRenderer;

import static com.kiyotakeshi.builder.pattern.after.TextRenderer.*;

public class Runner {

    public static void main(String[] args) {
        TextRenderer textRenderer = new TextRendererBuilder().build();
        textRenderer.render("Default Rendering");

        TextRenderer redRenderer = new TextRendererBuilder()
                .withFontColorRenderer(new RedColorRenderer())
                .build();
        redRenderer.render("Red Color Rendering");

        TextRenderer boldRenderer = new TextRendererBuilder()
                .withFontWeightRenderer(new BoldFontWeightRenderer())
                .build();
        boldRenderer.render("Bold Rendering");
    }
}
