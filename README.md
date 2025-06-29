# S1T4_Testing

Aquesta tasca utilitza les següents tecnologies:

- **Java Development Kit (JDK):** 21
- **Maven** com a eina de construcció
- **JUnit:** Versió 5.13.2 (usant BOM `junit-bom` amb `junit-jupiter`)
- **AssertJ:** Versió 3.27.3


# Nivell 1: JUnit

## Exercici 1

Crea una classe Java que gestioni una col·lecció de llibres en una biblioteca. La classe ha de permetre:

- Afegir llibres.
- Recuperar la llista de llibres.
- Obtenir un llibre específic per la seva posició.
- Afegir un llibre en una posició específica.
- Eliminar un llibre per títol.

### Funcionalitats a implementar:

- Afegir llibres a la col·lecció.
- Recuperar la llista completa de llibres.
- Obtenir el títol d’un llibre donada una posició.
- Afegir un llibre en una posició específica.
- Eliminar un llibre per títol.

### Proves amb JUnit:

- Verificar que la llista de llibres no és nul·la després de crear un nou objecte.
- Confirmar que la llista té una mida esperada després d'inserir diversos llibres.
- Assegurar que la llista conté un llibre específic en la seva posició correcta.
- Verificar que no hi ha títols de llibres duplicats a la llista.
- Comprovar que es pot recuperar el títol d’un llibre donada una posició específica.
- Assegurar que afegir un llibre modifica correctament la llista.
- Confirmar que eliminar un llibre disminueix la mida de la llista.
- Verificar que la llista roman ordenada alfabèticament després d’afegir o eliminar un llibre.

## Exercici 2

- Crea una classe anomenada `CalculoDni` que calculi la lletra del DNI en rebre el número com a paràmetre.
- Crea una classe JUnit que verifiqui el seu correcte funcionament, parametritzant-la per validar el càlcul amb 10 números de DNI predefinits.

## Exercici 3

- Crea una classe amb un mètode que llanci una `ArrayIndexOutOfBoundsException`.
- Verifica el seu correcte funcionament amb un test JUnit.

---

# Nivell 2: AssertJ

Crea les classes Java i/o els tests corresponents per demostrar els següents casos:

## Exercici 1

- Una asserció que demostri que el valor de dos objectes sencers és igual.
- Una altra asserció que indiqui que no ho és.

## Exercici 2

- Una asserció que demostri que la referència a un objecte és la mateixa que una altra.
- Una altra que indiqui que és diferent.

## Exercici 3

- Una asserció que indiqui que dos arrays d'enters són idèntics.

## Exercici 4

- Crea un `ArrayList` amb diversos tipus d’objectes (crea també aquests objectes).
- Escriu una asserció per verificar l’ordre dels objectes en la llista segons han estat inserits.
- Verifica que la llista conté els objectes en qualsevol ordre.
- Verifica que un dels objectes s’ha afegit només una vegada.
- Deixa un dels objectes sense afegir i comprova que no és present a la llista.

## Exercici 5

- Crea un `Map` i verifica que conté una de les `key` que li has afegit.

## Exercici 6

- Provoca una `ArrayIndexOutOfBoundsException` en una classe qualsevol.
- Crea una asserció que validi que l'excepció és llançada quan correspon.

## Exercici 7

- Crea un objecte `Optional` buit.
- Escriu l’asserció correcta per verificar que està buit.





  
