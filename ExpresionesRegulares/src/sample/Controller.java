package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    @FXML
    TextField txtTexto;
    @FXML
    ListView listaEjer;
    @FXML
    Label lblResultado;

    @FXML
    protected void initialize() {
        listaEjer.getItems().addAll("Ejercicio 1", "Ejercicio 2", "Validar password",
//////////////////////////////////PRACTICA 1-----------
                "Validar palabra que no comience con DB", "Validar palabra que termine con COUNT",
                "Validar palabra que haya escrito DOS nombres", "Validar una MAC Address",
                "Validar palabra que comience y termine en MAYUSCULAS",
                "Validar numero BINARIO de 8 digitos",
                "Validar palabra que se haya escrito correctamente un numero HEXADECIMAL",
                "Validar que una operacion de 1 DIGITO",
                "Validar que se ingrese correctamente el numero de control del ITSNCG",
                "Validar que se ingrese correctamente el numero de CURP",
/////////////////////PRACTICA 2--------------
                "Validar que se ingrese X cantidad de PESOS",
                "Validar el numero de una TARJETA de Credito",
                "Validar una etiqueta HTML", "Validar un color HEXADECIMAL",
                "Validar un LINK", "Validar el QUERY insert into de SQL",
                "Validar sentencia if de X variable con X condicion",
                "Validar que se haya escrito una FRASE con salto de linea ",
                "Validar que se haya escrito una URL con un video de Youtube ",
/////////////////////PRACTICA 3----------------
                "Validar un NOMBRE de USUARIO ", "Validar dos  NOMBRES y separarlo con un -",
                "Validar un CORREO ELECTRONICO", "Validar OPERACION de JAVA",
                "Validar CODIGO de colores HTML", "Validar una HORA", "Validar una OPERACION NUMERICA");
//////////////////////////////EVALUACION----------------
    }

    public void procesar(ActionEvent event) {
        int seleccion = listaEjer.getSelectionModel().getSelectedIndex();
        String texto = txtTexto.getText();
        String expresion = "";
        switch (seleccion) {
            case 0: {
                expresion = "^[^_][^p]([a-zA-Z0-9]{3,})[q|w]$";
                break;
            }
            case 1: {
                expresion = "\\\\n+([a-zA-Z]{1,})";
                break;
            }
            case 2: {
                expresion = "^-([a-zA-Z0-5]{5,10})";
                break;
            }
/////////////////////////////////////////////////PRACTICA 1--------------
            case 3: {
                expresion = "^[^db]([a-zA-Z]{2,})";
                break;
            }
            case 4: {
                expresion = "(^[a-zA-Z]{2,})[count]$";
                break;
            }
            case 5: {
                expresion = "([a-zA-Z]{6,})[ ]([a-zA-Z]{6,})";
                break;
            }
            case 6: {
                expresion = "([0-9]{1,})[.]([0-9]{1,})[.]([0-9]{1,})[.]([0-9]{1,}+)";
                break;
            }
            case 7: {
                expresion = "(^[A-Z]{1})([a-zA-Z]{1,})([a-zA-Z]{1}$)";
                break;
            }
            case 8: {
                expresion = "(^[0-1]{8})";
                break;
            }
            case 9: {
                expresion = "([a-fA-F0-9]{16})";
                break;
            }
            case 10: {
                expresion = "(^[0-9]{1})[-|+|*|/|^]([0-9]{1})";
                break;
            }
            case 11: {
                expresion = "(^[0-9]{2})([CG|cg]{2})([0-9]{4})";
                break;
            }
            case 12: {
                expresion = "(^[A-Z]{4})([0-9]{6})([A-Z]{6})([0-9]{3})";
                break;
            }
            ////////////////////////////////////// PRACTICA 2--------------
            case 13: {
                expresion = "\\$([0-9]{1,5})[.]([0-9]{2})";
                break;
            }
            case 14: {
                expresion = "(^[0-9]{4})[ ]([0-9]{4})[ ]([0-9]{4})[ ]([0-9]{4})";
                break;
            }
            case 15: {
                expresion = "\\<p class=([a-z]{3,}) [>] ([a-z]{3,}[</p]$ )";
                break;
            }
            case 16: {
                expresion = "\\#([a-zA-Z0-9]{6})";
                break;
            }
            case 18: {
                expresion = "^http://([a-zA-Z0-9]{3,}[.com]$)";
                break;
            }
            case 19: {
                expresion = "^INSERT INTO([a-zA-Z0-9]{3,}[.com]$)";
                break;
            }
            case 20: {
                expresion = "";
                break;
            }
            case 21: {
                expresion = "";
                break;
            }
            case 22: {
                expresion = "^https://www.youtube.com/([a-zA-Z0-9/=-?&.]{3,})";
                break;
            }
////////////////////////////////////////////////////PRACTICA 3------------
            case 23: {
                expresion = "^[a-z0-9_-]{3,16}";
                break;
            }
            case 24: {
                expresion = "^[a-z0-9-]+$";
                break;
            }
            case 25: {
                expresion = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
                break;
            }
            case 26: {
                expresion = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}";
                break;
            }
            case 27: {
                expresion = "[Rr][Gg][Bb][(](((([\\\\d]{1,3})[1,]{0,1})[\\\\s]*){3})[)]";
                break;
            }
            case 28: {
                expresion = "^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
                break;
            }
            case 29: {
                expresion = "^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$";
                break;
            }
            
        }
        Pattern patron = Pattern.compile(expresion);
        Matcher matcher = patron.matcher(texto);
        if (matcher.matches()) {
            lblResultado.setText("SI CUMPLE");
        } else {
            lblResultado.setText("NO CUMPLE");
        }
    }
}

