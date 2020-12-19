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
            "---..", "----.",
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
            /////////Conversion a MORSE

            "Convertir la letra A a Codigo Morse",
            "Convertir la letra B a Codigo Morse",
            "Convertir la letra C a Codigo Morse",
            "Convertir la letra D a Codigo Morse",
            "Convertir la letra E a Codigo Morse",
            "Convertir la letra F a Codigo Morse",
            "Convertir la letra G a Codigo Morse",
            "Convertir la letra H a Codigo Morse",
            "Convertir la letra I a Codigo Morse",
            "Convertir la letra J a Codigo Morse",
            "Convertir la letra K a Codigo Morse",
            "Convertir la letra L a Codigo Morse",
            "Convertir la letra M a Codigo Morse",
            "Convertir la letra N a Codigo Morse",
            "Convertir la letra O a Codigo Morse",
            "Convertir la letra P a Codigo Morse",
            "Convertir la letra Q a Codigo Morse",
            "Convertir la letra R a Codigo Morse",
            "Convertir la letra S a Codigo Morse",
            "Convertir la letra T a Codigo Morse",
            "Convertir la letra U a Codigo Morse",
            "Convertir la letra V a Codigo Morse",
            "Convertir la letra W a Codigo Morse",
            "Convertir la letra X a Codigo Morse",
            "Convertir la letra Y a Codigo Morse",
            "Convertir la letra Z a Codigo Morse",

            "Convertir la numero 0 a Codigo Morse",
            "Convertir la numero 1 a Codigo Morse",
            "Convertir la numero 2 a Codigo Morse",
            "Convertir la numero 3 a Codigo Morse",
            "Convertir la numero 4 a Codigo Morse",
            "Convertir la numero 5 a Codigo Morse",
            "Convertir la numero 6 a Codigo Morse",
            "Convertir la numero 7 a Codigo Morse",
            "Convertir la numero 8 a Codigo Morse",
            "Convertir la numero 9 a Codigo Morse",

            /////////Conversion al Idioma Español

            "Convertir la letra .- al Idioma Español",
            "Convertir la letra -... al Idioma Español",
            "Convertir la letra -.-. al Idioma Español",
            "Convertir la letra -.. al Idioma Español",
            "Convertir la letra . al Idioma Español",
            "Convertir la letra ..-. al Idioma Español",
            "Convertir la letra --. al Idioma Español",
            "Convertir la letra .... al Idioma Español",
            "Convertir la letra .. al Idioma Español",
            "Convertir la letra .--- al Idioma Español",
            "Convertir la letra -.- al Idioma Español",
            "Convertir la letra .-.. al Idioma Español",
            "Convertir la letra -- al Idioma Español",
            "Convertir la letra -. al Idioma Español",
            "Convertir la letra --- al Idioma Español",
            "Convertir la letra .--. al Idioma Español",
            "Convertir la letra --.- al Idioma Español",
            "Convertir la letra .-. al Idioma Español",
            "Convertir la letra ... al Idioma Español",
            "Convertir la letra - al Idioma Español",
            "Convertir la letra ..- al Idioma Español",
            "Convertir la letra ...- al Idioma Español",
            "Convertir la letra .-- al Idioma Español",
            "Convertir la letra -..- al Idioma Español",
            "Convertir la letra -.-- al Idioma Español",
            "Convertir la letra --.. al Idioma Español",

            "Convertir el numero  ----- al Idioma Español",
            "Convertir el numero  .---- al Idioma Español",
            "Convertir el numero  ..--- al Idioma Español",
            "Convertir el numero  ...-- al Idioma Español",
            "Convertir el numero  ....- al Idioma Español",
            "Convertir el numero  ..... al Idioma Español",
            "Convertir el numero  -.... al Idioma Español",
            "Convertir el numero  --... al Idioma Español",
            "Convertir el numero  ---.. al Idioma Español",
            "Convertir el numero  ----. al Idioma Español",
    });
    public static  String [] expresiones={
            /////////Expresiones a Codigo Morse

            "Declarar [aA]{1} como (.-) ",
            "Declarar [bB]{1} como (-...)",
            "Declarar [cC]{1} como (-.-.)",
            "Declarar [dD]{1} como (-..)",
            "Declarar [eE]{1} como (.)",
            "Declarar [fF]{1} como (..-.)",
            "Declarar [gG]{1} como (--.)",
            "Declarar [hH]{1} como (....)",
            "Declarar [iI]{1} como (..)",
            "Declarar [jJ]{1} como (.---)",
            "Declarar [kK]{1} como (-.-)",
            "Declarar [lL]{1} como (.-..)",
            "Declarar [mM]{1} como (--)",
            "Declarar [nN]{1} como (-.)",
            "Declarar [oO]{1} como (---)",
            "Declarar [pP]{1} como (.--.)",
            "Declarar [qQ]{1} como (--.-)",
            "Declarar [rR]{1} como (.-.)",
            "Declarar [sS]{1} como (...)",
            "Declarar [tT]{1} como (-)",
            "Declarar [uU]{1} como (..-)",
            "Declarar [vV]{1} como (...-)",
            "Declarar [wW]{1} como (.--)",
            "Declarar [xX]{1} como (-..-)",
            "Declarar [yY]{1} como (-.--)",
            "Declarar [zZ]{1} como (--..)",

            "Declarar [0]{1} como (-----)",
            "Declarar [1]{1} como (.----)",
            "Declarar [2]{1} como (..---)",
            "Declarar [3]{1} como (...--)",
            "Declarar [4]{1} como (....-)",
            "Declarar [5]{1} como (.....)",
            "Declarar [6]{1} como (-....)",
            "Declarar [7]{1} como (--...)",
            "Declarar [8]{1} como (---..)",
            "Declarar [9]{1} como (----.)",


            /////////Expresiones aL Idioma Español

            "Declarar [.-]{1} como  (A)",
            
            "Declarar [-...]{1} como (b|B)",
            "Declarar [-.-.]{1} como (c|C)",
            "Declarar [-..]{1} como (d|D)",
            "Declarar [.]{1} como (e|E)",
            "Declarar [..-.]{1} como (f|F)",
            "Declarar [--.]{1} como (g|G)",
            "Declarar [....]{1} como (h|H)",
            "Declarar [..]{1} como (i|I)",
            "Declarar [.---]{1} como (j|J)",
            "Declarar [-.-]{1} como (k|K)",
            "Declarar [.-..]{1} como (l|L)",
            "Declarar [--]{1} como (m|M)",
            "Declarar [-.]{1} como (n|N)",
            "Declarar [---]{1} como (o|O)",
            "Declarar [.--.]{1} como (p|P)",
            "Declarar [--.-]{1} como (q|Q)",
            "Declarar [.-.]{1} como (r|R)",
            "Declarar [...]{1} como (s|S)",
            "Declarar [-]{1} como (t|T)",
            "Declarar [..-]{1} como (u|U)",
            "Declarar [...-]{1} como (v|V)",
            "Declarar [.--]{1} como (w|W)",
            "Declarar [-..-]{1} como (x|X)",
            "Declarar [-.--]{1} como (y|Y)",
            "Declarar [--..]{1} como (z|Z)",

            "Declarar [-----]{1} como (0)",
            "Declarar [.----]{1} como (1)",
            "Declarar [..---]{1} como (2)",
            "Declarar [...--]{1} como (3)",
            "Declarar [....-]{1} como (4)",
            "Declarar [.....]{1} como (5)",
            "Declarar [-....]{1} como (6)",
            "Declarar [--...]{1} como (7)",
            "Declarar [---..]{1} como (8)",
            "Declarar [----.]{1} como (9)",


    };
}
