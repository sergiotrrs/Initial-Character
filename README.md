# Especificación del Programa Java: Verificador de Carácter Inicial

## Objetivo

El objetivo de este programa en Java es desarrollar una función que verifique el primer carácter de una cadena y devuelva una etiqueta según el tipo de carácter. Las etiquetas posibles son:

- "number" si el primer carácter es un número.
- "mayus" si el primer carácter es una letra mayúscula.
- "minus" si el primer carácter es una letra minúscula.
- "other" si el primer carácter es un carácter especial o cualquier otro carácter que no pertenezca a las categorías anteriores.

## Requisitos

1. Crear una función llamada `checkInitialCharacter` que tome una cadena de texto como parámetro y devuelva una de las etiquetas mencionadas anteriormente según el primer carácter de la cadena.

2. Implementar la lógica necesaria para determinar el tipo de carácter y seleccionar la etiqueta adecuada.

3. Crear un programa principal en Java que solicite al usuario una cadena y llame a la función `checkInitialCharacter` para obtener la etiqueta correspondiente.

4. Mostrar la etiqueta en la pantalla como resultado.

## Ejemplos

- Si el usuario ingresa la cadena "123abc", el programa debe mostrar "number" ya que el primer carácter es un número.

- Si el usuario ingresa la cadena "Hola", el programa debe mostrar "mayus" ya que el primer carácter es una letra mayúscula.

- Si el usuario ingresa la cadena "java", el programa debe mostrar "minus" ya que el primer carácter es una letra minúscula.

- Si el usuario ingresa la cadena "@caracter", el programa debe mostrar "other" ya que el primer carácter es un carácter especial.

- Si el usuario ingresa una cadena vacía, el programa puede mostrar un mensaje indicando que la cadena está vacía.

## Observaciones

- La función debe ser capaz de manejar cadenas de cualquier longitud y caracteres de cualquier tipo al verificar el primer carácter.

- Se recomienda utilizar funciones de Java para la manipulación de cadenas y la determinación del tipo de carácter.

- El programa debe ser interactivo y permitir al usuario ingresar cadenas para su verificación.

Este programa proporcionará una herramienta útil para clasificar el primer carácter de una cadena en categorías específicas, lo que puede ser útil en aplicaciones relacionadas con el procesamiento de texto y la lógica condicional.
