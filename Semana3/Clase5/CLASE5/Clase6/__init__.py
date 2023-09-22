from Animal import Animal
from Perro import Perro

lucas = Animal("Lucas", "Perro", 7, 0.9)
print (lucas)

firulay = Perro("Firulay", "Criollo", 4, 0.78)
print(firulay)
firulay.__edad__= 9
print(firulay.__edad__)
