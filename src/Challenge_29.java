class Color {
    int channelRed;
    int channelGreen;
    int channelBlue;
    Color (int channelRed, int channelGreen, int channelBlue){
        this.channelRed = channelRed;
        this.channelGreen = channelGreen;
        this.channelBlue = channelBlue;
    }
    final static Color white = new Color(255,255,255);
    final static Color black = new Color(0,0,0);
    final static Color red = new Color(255,0,0);
    final static Color orange = new Color(255,165,0);
    final static Color yellow = new Color(255,255,0);
    final static Color green = new Color(0,128,0);
    final static Color blue = new Color(0,0,255);
    final static Color purple = new Color(128,0,128);
}

public class Challenge_29 {
    public static void main(String[] args) {
        Color customColor = new Color(1,1,1);
        Color predefinedColor = Color.white;
        System.out.println("(" + customColor.channelRed + ", " + customColor.channelGreen + ", " + customColor.channelBlue + ")");
        System.out.println("(" + predefinedColor.channelRed + ", " + predefinedColor.channelGreen + ", " + predefinedColor.channelBlue + ")");
    }
}
