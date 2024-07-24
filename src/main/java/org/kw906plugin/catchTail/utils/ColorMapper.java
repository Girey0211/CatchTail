package org.kw906plugin.catchTail.utils;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Color;

import java.util.HashMap;

public class ColorMapper {

    private final HashMap<Integer, String> colorNameMap = new HashMap<>();
    private final HashMap<Integer, NamedTextColor> colorMap = new HashMap<>();
    private final HashMap<Integer, Color> colorCodeMap = new HashMap<>();

    public String getColorName(int id) {
        return colorNameMap.get(id);
    }

    public NamedTextColor getColor(int id) {
        return colorMap.get(id);
    }

    public Color getColorCode(int color) {
        return colorCodeMap.get(color);
    }

    public ColorMapper() {
        colorNameMap.put(0, "빨강");
        colorNameMap.put(1, "주황");
        colorNameMap.put(2, "노랑");
        colorNameMap.put(3, "초록");
        colorNameMap.put(4, "청록");
        colorNameMap.put(5, "파랑");
        colorNameMap.put(6, "남");
        colorNameMap.put(7, "보라");
        colorNameMap.put(8, "갈");
        colorNameMap.put(9, "검은");
        colorNameMap.put(10, "회백");
        colorNameMap.put(11, "흰");
        colorNameMap.put(12, "핑크");

        colorMap.put(0, NamedTextColor.RED);
        colorMap.put(1, NamedTextColor.GOLD);
        colorMap.put(2, NamedTextColor.YELLOW);
        colorMap.put(3, NamedTextColor.GREEN);
        colorMap.put(4, NamedTextColor.DARK_AQUA);
        colorMap.put(5, NamedTextColor.AQUA);
        colorMap.put(6, NamedTextColor.BLUE);
        colorMap.put(7, NamedTextColor.DARK_PURPLE);
        colorMap.put(8, NamedTextColor.DARK_RED);
        colorMap.put(9, NamedTextColor.BLACK);
        colorMap.put(10, NamedTextColor.GRAY);
        colorMap.put(11, NamedTextColor.WHITE);
        colorMap.put(12, NamedTextColor.LIGHT_PURPLE);

        colorCodeMap.put(0, Color.RED);
        colorCodeMap.put(1, Color.ORANGE);
        colorCodeMap.put(2, Color.YELLOW);
        colorCodeMap.put(3, Color.GREEN);
        colorCodeMap.put(4, Color.TEAL);
        colorCodeMap.put(5, Color.BLUE);
        colorCodeMap.put(6, Color.NAVY);
        colorCodeMap.put(7, Color.PURPLE);
        colorCodeMap.put(8, Color.MAROON);
        colorCodeMap.put(9, Color.BLACK);
        colorCodeMap.put(10, Color.GRAY);
        colorCodeMap.put(11, Color.WHITE);
        colorCodeMap.put(12, Color.FUCHSIA);
    }
}
