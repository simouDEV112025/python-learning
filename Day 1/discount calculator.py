price = int(input("price: "))
if price > 100:
    print (price - price * 20 // 100)
elif price > 50:
    print (price - price * 10 // 100)
else:
    print ("no discount")