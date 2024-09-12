from pymongo.mongo_client import MongoClient

uri = "mongodb+srv://Marco7years:Martapuzzadicacca_98@fuelistcluster.j27nz.mongodb.net/?retryWrites=true&w=majority&appName=FuelistCluster"

# Create a new client and connect to the server
client = MongoClient(uri)
db = client['']

mydict = {'date_of_fuel': '',
          'litres': 18.5,
          'price': 20,
          'distance': 250}

print(client.insert_one(mydict))

# Send a ping to confirm a successful connection
try:
    client.admin.command('ping')
    print("Pinged your deployment. You successfully connected to MongoDB!")
except Exception as e:
    print(e)