# QuijoteLuiFirmador
Aplicación para firmar un archivo XML ( Comprobante Electrónico - SRI Ecuador)

Aplica para firmar facturas, comprobantes de retención, guías de remisión, notas
de crédito y notas de débito de Ecuador.


### Para compilar y generar el archivo QuijoteLuiFirmador-2.1.jar
```
ant

```
### Comando en terminal para subir al repositorio Maven Local (Linux\Mac)
```
mvn install:install-file -Dfile=./dist/QuijoteLuiFirmador-2.1.jar -DgroupId=com.quijotelui.firmador -DartifactId=QuijoteLuiFirmador -Dversion=2.1 -Dpackaging=jar
```
### Comando en terminal para subir al repositorio Maven Local (Windows)
```
cd .\dist\
mvn install:install-file "-Dfile=QuijoteLuiFirmador-2.1.jar" "-DgroupId=com.quijotelui.firmador" "-DartifactId=QuijoteLuiFirmador" "-Dversion=2.1" "-Dpackaging=jar"
```

#### Documentación
https://www.allku.expert/firmar-un-comprobante-electronico-segun-los-parametros-del-sri-en-ecuador/
