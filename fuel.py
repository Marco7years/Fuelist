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
    
    def print_date(self):
        date = self.date_of_fuel
        
    
    def __str__(self):
        return f"Date: {self.date_of_fuel}\nLitres: {self.litres}\nPrice: {self.price}\nDistance: {self.distance}"

test_fuel = Fuel(None, 20.5, 18.7, 250)
print(test_fuel)
