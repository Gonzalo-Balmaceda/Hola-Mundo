# lista = Naty, Liliana, Osvaldo, Ariel

nombres = ["Naty", "Lily", "Osvaldo", "Ariel"]
print(nombres)

print(nombres[0:2]) # Muestra desde el indice 0 hasta el 1 pero no el 2

# ir desde el inicio de la lista al indice (sin incluirlo).
print(nombres[ :3]) # El compilador analiza que no colocamos ningun indice de partida asi que automaticamente lo toma como un '0'.

# Desde el indice indicado hasta el final.
print(nombres[1: ]) # Nos mostrara desde el indice indicado hasta el ultimo

# Modificamos un valor.
nombres[1] = "Liliana"
nombres[0] = "Natalia"
print(nombres)

# Iteramos para mostrar nombre por nombre.
for nombre in nombres:
    print(nombre)
else:
    print("No hay mas nombres para mostrar!")

# Mostramos cuantos elementos tiene un lista.
print(len(nombres)) # Utilizamos el metodo (len()) que recibira como parametro el nombre de la lista de la cual queramos saber su cantidad de elementos.

# Agregamos un nuevo elemento.
nombres.append("Gonzalo")
print(nombres)

# Agregamos un nuevo elemento pero en un indice en especifico.
nombres.insert(0, "Nicolas")
print(nombres)
nombres.insert(3, "Balmaceda")
print(nombres)

# Eliminamos un nombre de la lista.
nombres.remove("Nicolas")
print(nombres)

# Eliminamos el ultimo elemento.
nombres.pop()
print(nombres)

# Eliminamos un indice en especifico.
del nombres[2] # del = delete (eliminar)
print(nombres)

# Eliminar todos los elementos de la lista.
nombres.clear()
print(nombres)

# Eliminamos la lista.
del nombres
print(nombres) # Nos mostrara un error ya que no puedo mostrar la lista porque la eliminamos