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
        

        System.out.println("QuijoteLui Firmador");
        XAdESBESSignature xadesBesFirma = new XAdESBESSignature();
        
        File archivo = new File("/app/Quijotelui/comprobante/generado/"
                + "2805201801100995697000120010990000000011234567816.xml");
        String urlOutArchivo = "/tmp";
        String PKCS12_RESOURCE = "/data/BCE";
        String PKCS12_PASSWORD;

        String nombreP12 = "certificado.p12";
        PKCS12_RESOURCE = PKCS12_RESOURCE + File.separatorChar + nombreP12;
        System.out.println("Archivo Firma P12: " + PKCS12_RESOURCE);
        
        PKCS12_PASSWORD = new String("clave_certificado");

        xadesBesFirma.firmar(archivo.getAbsolutePath(), archivo.getName(),
                urlOutArchivo, PKCS12_RESOURCE, PKCS12_PASSWORD);
    }
}
