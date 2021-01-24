package sample.Interprete;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import static sample.Interprete.TipoToken.*;

public class Compilador {
    private TextArea consola;
    private VBox pane;
    private HBox panetradu;

    public Compilador(TextArea tx, VBox pane, HBox panetradu) {
        this.consola = tx;
        this.pane=pane;
        this.panetradu=panetradu;
    }

    public boolean compilar(String renglon) {
        boolean errores = false;
        if (renglon.contains("print")) {
            int i1 = renglon.indexOf('(');
            int i2 = renglon.length() - 1;
            String texto = renglon.substring(i1, i2);
            this.consola.appendText("\n" + texto);
        }else if(renglon.contains("declarar")){
            String[] arreglo=renglon.split(" ");
            if (!validar(arreglo[1].trim())) {
                String tipoToken = "";
                if (arreglo[3].equals("A")) {
                    tipoToken = A;
                } else {
                    tipoToken = a;
                }
                Token token = new Token(tipoToken, ".-",arreglo[1].trim());
                arrayToken.add(token);
                System.out.println(arreglo[1]);
                System.out.println(arreglo[3]);
            } else {
                this.consola.appendText("\n la variable con el nombre" + arreglo[1] + "ya esta declarada");
            }

        }else if(renglon.contains("traducir")){
            int i1 = renglon.indexOf('(')+1 ;
            int i2 = renglon.length() - 1;
            String texto = renglon.substring(i1, i2).trim();
            if(validar(texto)){
                Token t1=buscarToken(texto);
                System.out.println(t1.getNombre());
                System.out.println(t1.getTipo());
                System.out.println(t1.getValor());
                Label label=new Label("Traduciendo la letra A = "+t1.getValor());
                pane.getChildren().add(label);
            }else {
                this.consola.appendText("\n la palabra" + texto + "no esta declarada");
            }
            this.consola.appendText("\n" + texto);
        }else if(renglon.contains("reproducir")){
            int i1 = renglon.indexOf('(')+1 ;
            int i2 = renglon.length() - 1;
            String texto = renglon.substring(i1, i2).trim();
            if(validar(texto)){
                Token t1=buscarToken(texto);
                System.out.println(t1.getNombre());
                System.out.println(t1.getTipo());
                System.out.println(t1.getValor());
                Label label=new Label("Reproduciendo sonido del codigo = "+t1.getValor());
                pane.getChildren().add(label);
            }else {
                this.consola.appendText("\n la palabra" + texto + "no esta declarada");
            }
            this.consola.appendText("\n" + texto);
        }
        else if(renglon.contains("mostrar")){
            int i1 = renglon.indexOf('(')+1 ;
            int i2 = renglon.length() - 1;
            String texto = renglon.substring(i1, i2).trim();
            if(validar(texto)){
                Token t1=buscarToken(texto);
                System.out.println(t1.getNombre());
                System.out.println(t1.getTipo());
                System.out.println(t1.getValor());
                Label label=new Label("Mostrando codigo " +t1.getValor()+ "de la letra = "+t1.getTipo());
                pane.getChildren().add(label);
            }else {
                this.consola.appendText("\n la palabra" + texto + "no esta declarada");
            }
            this.consola.appendText("\n" + texto);
        }
        else if(renglon.contains("enviar")) {
            int i1 = renglon.indexOf('(') + 1;
            int i2 = renglon.length() - 1;
            String texto = renglon.substring(i1, i2).trim();
            if (validar(texto)) {
                Token t1 = buscarToken(texto);
                System.out.println(t1.getNombre());
                System.out.println(t1.getTipo());
                System.out.println(t1.getValor());
                Label label = new Label("Enviando codigo " + t1.getValor());
                pane.getChildren().add(label);
            } else {
                this.consola.appendText("\n la palabra" + texto + "no esta declarada");
            }
            this.consola.appendText("\n" + texto);
        }
        else if(renglon.contains("compartir")) {
            int i1 = renglon.indexOf('(') + 1;
            int i2 = renglon.length() - 1;
            String texto = renglon.substring(i1, i2).trim();
            if (validar(texto)) {
                Token t1 = buscarToken(texto);
                System.out.println(t1.getNombre());
                System.out.println(t1.getTipo());
                System.out.println(t1.getValor());
                Label label = new Label("Compartiendo codigo " + t1.getValor() + " de la letra = " +t1.getTipo());
                pane.getChildren().add(label);
            } else {
                this.consola.appendText("\n la palabra" + texto + "no esta declarada");
            }
            this.consola.appendText("\n" + texto);
        }
        return errores;
    }
    public boolean validar(String nombre) {
        boolean existe = false;
        for (int x = 0; x < arrayToken.size(); x++) {
            if (arrayToken.get(x).getNombre().equals(nombre)) {
                existe = true;
            }
        }
        return existe;
    }
    public Token buscarToken(String nombre) {
        Token existe = null;
        for (int x = 0; x < arrayToken.size(); x++) {
            if (arrayToken.get(x).getNombre().equals(nombre)) {
                return arrayToken.get(x);
            }
        }
        return existe;
    }
}

