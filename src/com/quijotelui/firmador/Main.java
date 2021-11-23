package com.quijotelui.firmador;

import java.io.File;
import java.util.Scanner;
import java.io.Console;

/**
 *
 * @author jorgequiguango
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // Check number of arguments is correct
        if (args.length != 4) {
                System.out.println("Usage: java -jar firmador.jar <input file> <certificate file> <certificate password> <token type=[BCE, SEC_DATA, CONS_JUD]>");
                System.exit(1);
        }
        System.out.println("QuijoteLui Firmador");
        System.out.println("Java Version -> " + System.getProperty("java.version"));
        XAdESBESSignature xadesBesFirma = new XAdESBESSignature();
       
        File archivo = new File(args[0]);
        String PKCS12_RESOURCE = args[1];
        String PKCS12_PASSWORD = args[2];
        String TOKEN_TYPE = args[3];

        switch (TOKEN_TYPE) {
            case "BCE":
                xadesBesFirma.sign(archivo,  PKCS12_RESOURCE, PKCS12_PASSWORD, TokensAvailables.BCE_IKEY2032);
                break;
        case "SEC_DATA":
                xadesBesFirma.sign(archivo,PKCS12_RESOURCE,PKCS12_PASSWORD,TokensAvailables.SD_EPASS3000);
                break;
        case "CONS_JUD":
                xadesBesFirma.sign(archivo,PKCS12_RESOURCE,PKCS12_PASSWORD,TokensAvailables.KEY4_CONSEJO_JUDICATURA);
                break;
        default:
                System.out.println("Los Token disponibles son: BCE, SEC_DATA, CONS_JUD");
                break;
        }
    }
}
