# deportesunq-backend
Repositorio para el backend en Kotlin de la aplicación Deportes UNQ

Para correrlo localmente es necesario contar con una base postgres con usuario postgres y password toor (o cambiarlo en application.properties), y jvm8.

La versión de postgresql utilizada fue la 10.10 y se puede descargar desde los siguientes enlaces:

[Linux x86-64](https://www.enterprisedb.com/thank-you-downloading-postgresql?anid=1256719)

[Linux x86-32](https://www.enterprisedb.com/thank-you-downloading-postgresql?anid=1256718)

[MAC OS X](https://www.enterprisedb.com/thank-you-downloading-postgresql?anid=1256720)

[Windows x86-64](https://www.enterprisedb.com/thank-you-downloading-postgresql?anid=1256722)

[Windows x86-32](https://www.enterprisedb.com/thank-you-downloading-postgresql?anid=1256721)


Para iniciar el servidor ejecutar ./gradlew bootRun (el proceso corre en el puerto 8080 por defecto)

**Si estas en Windows se recomienda usar ./gradlew.bat bootRun, con el otro podría ser que no puedas terminar el proceso con ctrl+c
si te pasó esto abris una consola de comandos (inicio -> cmd) y tipeas lo siguiente
netstat -ano | findstr 8080 (o el puerto que le hubieras puesto)
y va a aparecerte algo de este estilo**

**TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       10032 <- PID**

**TCP    [::]:8080              [::]:0                 LISTENING       10032 <- PID**
  
**el último número es el PID que hay que matar con el siguiente comando
taskkill /F /PID 10032 (reemplazar 10032 por el ID de tu proceso)**


Si se quiere probar manualmente las llamadas, se recomienda usar curl, postman, etc.

---------
[Repo frontend](https://github.com/bcoronel-fusap/deportesunq-frontend-android)

