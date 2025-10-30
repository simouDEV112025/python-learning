temperature = float(input("temperature in celsuis C: "))
F = (temperature * 9/5) + 32
print(f"temperature in fahrenheit F: {F}")
if F > 100:
    print("vert hot")
elif F > 70:
    print("warm")
elif F > 50:
    print("cool")
else:
    print("cold")