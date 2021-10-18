# creditCard
Hola buen dia este es un ejercicio desarrollado con Spring Boot con algunas de las sesiones con las que pude estar y las pocas que logre ver. Implemente la mayor parte de funcionalidad
que pude desarrollar, dentro de esta app estaba planeado utiliza mongo como gestor de bd, por problemas tecnicos no se pudo concretar dado un error con un @Autowire, el codigo lo podemos encontrar en users.

Dejo algunos paths implementados de la practica asi como un archivo json para la configuracion de postman y la prueba de la aplicacion desarrollada.

Utilice algunos metodos como Encode y UUID, para la creacion segura de cierta informacion.

Dado el JSON que recibimos se observo que no se podria parsear con un metodo por lo cual tuve que modificar el json recibido a uno nuevo.

Dentro de esto cree una funcionalidad que nos permite obtener JSON desde cualquier URL

Se quedo en desarrollo la configuracion de la herramienta swagger para la prueba de la aplicacion

## URL

http://localhost:8080/user/testUser

http://localhost:8080/json

http://localhost:8080/location?state=CDMX&cp=55850&gps=0,0

http://localhost:8080/user?id=2

http://localhost:8080/user

http://localhost:8080/user/creditCard?age=22&salary=200&preferences=VIAJES,CONCIERTOS

http://localhost:8080/creditCard

http://localhost:8080/creditCard/1

http://localhost:8080/creditCard/

http://localhost:8080/creditCard/


