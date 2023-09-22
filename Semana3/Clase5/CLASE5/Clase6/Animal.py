class Animal:
    nombre  = ""
    raza = ""
    edad = 0
    altura = 0.0
        
    def __init__(self, nombre, raza, edad, altura):
       
        self.nombre = nombre
        self.raza = raza
        self.edad = edad
        self.altura = altura

    def __str__(self) -> str:
        return    f"[nombre={self.nombre}, raza={self.raza}, edad={self.edad}, altura={self.altura}]" 
          