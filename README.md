# QuijoteLuiFirmador
Aplicación para firmar un archivo XML ( Comprobante Electrónico - SRI Ecuador)

Aplica para firmar facturas, comprobantes de retención, guías de remisión, notas
de crédito y notas de débito de Ecuador.


### Para compilar y generar el archivo QuijoteLuiFirmador-1.3.jar
```
$ ant

```
### Para subir al repositorio Maven Local
```
$ mvn install:install-file -Dfile=./dist/QuijoteLuiFirmador-1.3.jar -DgroupId=com.quijotelui.firmador -DartifactId=QuijoteLuiFirmador -Dversion=1.3 -Dpackaging=jar
```