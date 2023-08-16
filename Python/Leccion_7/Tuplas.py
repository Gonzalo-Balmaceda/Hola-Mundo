# Definimos una tupla.
cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)

# Acceder a un elemento.
print(cocina[0]) # Para acceder a un elemento de una tupla se utiliza corchetes.

# Mostrar el ultimo elemento.
print(cocina[-1])

# Acceder a un rango.
print(cocina[0:1])

# Ejemplo
verduras = ("papa",) # Una tupla debe de tener la coma despues del elemento aunque sea uno solo, si no, solomente es un String.
print(verduras)

# Recorremos los elementos de la tupla.
"""for cocinar in cocina:
    print(cocinar, end=" ")""" # Nos muestra los elementos uno debajo del otro porque lo que sucedes en el print es '\n' que es un salto de linea.
    # Con el  end=" " hacemos que nos muestre los elementos uno al lado del otro.

# Para agregar un nuevo elemento debemos pasar la tupla a lista, agregar el elemento y luego volver a pasar la lista a tupla.
cocinaLista = list(cocina) # Pasamos la tupla a lista
cocinaLista[0] = "plato" # Ahora en la lista agregamos el elemento nuevo indicando en cual posicion queremos que se coloque.
cocina = tuple(cocinaLista) # y pasamos la lista a tupla y ya la tendremos con el nuevo elemento.
print(cocina)


