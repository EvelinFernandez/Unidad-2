package sample.Configs;

import java.util.regex.Pattern;

public class Configs {
    public static final String[] KEYWORDS = new String[] {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3",
            "4", "5", "6", "7", "8", "9", ".-", "-...", "-.-.", "-..",
            ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...",
            "-", "..-", "...-", ".--", "-..-", "-.--", "--.." ,
            "-----", ".----", "..---", "...--", ".....", "-....", "--...",
            "---..", "----.", "print", "declarar", "traducir", "reproducir", "mostrar",
            "enviar", "compartir"
    };

    public static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    public static final String PAREN_PATTERN = "\\(|\\)";
    public static final String BRACE_PATTERN = "\\{|\\}";
    public static final String BRACKET_PATTERN = "\\[|\\]";
    public static final String SEMICOLON_PATTERN = "\\;";
    public static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    public static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";

    public static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<PAREN>" + PAREN_PATTERN + ")"
                    + "|(?<BRACE>" + BRACE_PATTERN + ")"
                    + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
                    + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );

    public static final String sampleCode = String.join("\n", new String[] {
            "print(10)",
            "declarar .- como A",
            "traducir(.-)",
            "reproducir el sonido del codigo Morse(.-)",
            "mostrar(.-)",
            "enviar(.-)",
            "compartir(.-)",

    });
    public static  String [] expresiones={
            "declarar [\\.-]{1,} como (a|A)",
            "print[(][a-z0-9]{1,}[)]",
            "traducir[(][\\.-]{1,}[)]",
            "reproducir el sonido del codigo Morse[(][\\.-]{1,}[)]",
            "mostrar[(][\\.-]{1,}[)]",
            "enviar[(][\\.-]{1,}[)]",
            "compartir[(][\\.-]{1,}[)]"
    };
}
