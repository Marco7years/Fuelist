from datetime import datetime

class Fuel:
    def __init__(self, date_of_fuel, litres, price, distance):
        if date_of_fuel is not None:
            if date_of_fuel.isinstance(str):
                self.date_of_fuel = datetime.strptime(date_of_fuel, '%d/%m/%Y')
        else:
            self.date_of_fuel = datetime.now()

        self.litres = litres
        self.price = price
        self.distance = distance
    
    def __str__(self):
        return f"Date: {self.date_of_fuel.day}/{self.date_of_fuel.month}/{self.date_of_fuel.year}\nLitres: {self.litres}\nPrice: {self.price}\nDistance: {self.distance}"