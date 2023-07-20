package com.computinglaboratory.javaansitextcolorizer;

import org.junit.jupiter.api.Test;

public class ColorizerTest {

    @Test
    public void coloringWholeOutputTest() {
        System.out.println(Colorizer.color("The whole output", Colorizer.Color.RED));
    }

    @Test
    public void coloringPartialOutputTest() {
        System.out.println("Coloring " + Colorizer.color("partial", Colorizer.Color.RED) + " output");
    }

    @Test
    public void usingDifferentRegularColorsTest() {
        System.out.println(
                  Colorizer.color("Black ", Colorizer.Color.BLACK)
                + Colorizer.color("red ", Colorizer.Color.RED)
                + Colorizer.color("green ", Colorizer.Color.GREEN)
                + Colorizer.color("yellow ", Colorizer.Color.YELLOW)
                + Colorizer.color("blue ", Colorizer.Color.BLUE)
                + Colorizer.color("magenta ", Colorizer.Color.MAGENTA)
                + Colorizer.color("cyan ", Colorizer.Color.CYAN)
                + Colorizer.color("white ", Colorizer.Color.WHITE)
                + "black");
    }

    @Test
    public void usingDifferentBrightColorsTest() {
        System.out.println(
                  Colorizer.color("Black ", Colorizer.Color.BLACK_BRIGHT)
                + Colorizer.color("red ", Colorizer.Color.RED_BRIGHT)
                + Colorizer.color("green ", Colorizer.Color.GREEN_BRIGHT)
                + Colorizer.color("yellow ", Colorizer.Color.YELLOW_BRIGHT)
                + Colorizer.color("blue ", Colorizer.Color.BLUE_BRIGHT)
                + Colorizer.color("magenta ", Colorizer.Color.MAGENTA_BRIGHT)
                + Colorizer.color("cyan ", Colorizer.Color.CYAN_BRIGHT)
                + Colorizer.color("white ", Colorizer.Color.WHITE_BRIGHT)
                + "black");
    }

    @Test
    public void usingDifferentBoldColorsTest() {
        System.out.println(
                  Colorizer.color("Black ", Colorizer.Color.BLACK_BOLD)
                + Colorizer.color("red ", Colorizer.Color.RED_BOLD)
                + Colorizer.color("green ", Colorizer.Color.GREEN_BOLD)
                + Colorizer.color("yellow ", Colorizer.Color.YELLOW_BOLD)
                + Colorizer.color("blue ", Colorizer.Color.BLUE_BOLD)
                + Colorizer.color("magenta ", Colorizer.Color.MAGENTA_BOLD)
                + Colorizer.color("cyan ", Colorizer.Color.CYAN_BOLD)
                + Colorizer.color("white ", Colorizer.Color.WHITE_BOLD)
                + "black");
    }

    @Test
    public void usingDifferentUnderlinedColorTest() {
        System.out.println(
                  Colorizer.color("Black ", Colorizer.Color.BLACK_UNDERLINED)
                + Colorizer.color("red ", Colorizer.Color.RED_UNDERLINED)
                + Colorizer.color("green ", Colorizer.Color.GREEN_UNDERLINED)
                + Colorizer.color("yellow ", Colorizer.Color.YELLOW_UNDERLINED)
                + Colorizer.color("blue ", Colorizer.Color.BLUE_UNDERLINED)
                + Colorizer.color("magenta ", Colorizer.Color.MAGENTA_UNDERLINED)
                + Colorizer.color("cyan ", Colorizer.Color.CYAN_UNDERLINED)
                + Colorizer.color("white ", Colorizer.Color.WHITE_UNDERLINED)
                + "black");
    }

    @Test
    public void coloringWholeOutputBackgroundTest() {
        System.out.println(Colorizer.color("The whole output background", Colorizer.BackgroundColor.RED));
    }

    @Test
    public void coloringWholeOutputBrightBackgroundTest() {
        System.out.println(Colorizer.color("The whole output background", Colorizer.BackgroundColor.RED));
    }
}
