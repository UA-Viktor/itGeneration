print("What is Bitcoin price today?")
bit = float(input())
print("How much $ do you have?")
dol = float(input())

if dol <= 0:
    print("You need more money")
else:
    coin = round(dol / bit, 7)
    result = str(coin)
    print("You can buy " + result + " BTC")