n = input()
n = n.split('.')
if n[len(n)-1].lower() == "py":
    print("yes")
else:
    print("no")
