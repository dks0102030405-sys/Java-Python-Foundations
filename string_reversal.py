S = input("Enter a string: ")
S = S.upper()
a = ""

for i in range(len(S) - 1, -1, -1):
    a = a + S[i]

print("Original string: ", S)
print("Reversed string: ", a)
