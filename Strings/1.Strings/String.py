# String creation
s = "Hello World"

# 1. Length
print("Length:", len(s))

# 2. Indexing
print("First char:", s[0])
print("Last char:", s[-1])

# 3. Slicing
print("Slice [0:5]:", s[0:5])
print("Slice [::-1] (reverse):", s[::-1])

# 4. Upper & lower
print("Upper:", s.upper())
print("Lower:", s.lower())

# 5. Capitalize
print("Capitalize:", s.capitalize())

# 6. Title case
print("Title:", s.title())

# 7. Strip / lstrip / rstrip
s2 = "   hello   "
print("Strip:", s2.strip())
print("Left strip:", s2.lstrip())
print("Right strip:", s2.rstrip())

# 8. Replace
print("Replace:", s.replace("World", "Python"))

# 9. Find
print("Find 'o':", s.find("o"))
print("Rfind 'o':", s.rfind("o"))

# 10. Count
print("Count 'l':", s.count("l"))

# 11. Startswith / endswith
print("Starts with Hello:", s.startswith("Hello"))
print("Ends with World:", s.endswith("World"))

# 12. Check functions
print("Is alpha:", "Hello".isalpha())
print("Is digit:", "123".isdigit())
print("Is alnum:", "abc123".isalnum())
print("Is lower:", "hello".islower())
print("Is upper:", "HELLO".isupper())
print("Is space:", "   ".isspace())

# 13. Split
words = s.split(" ")
print("Split:", words)

# 14. Join
joined = "-".join(words)
print("Join:", joined)

# 15. In operator
print("'World' in s:", "World" in s)

# 16. String comparison
print("hello" == "Hello")

# 17. Format
name = "Harish"
age = 20
print("Format:", "My name is {} and age is {}".format(name, age))
print(f"F-string: My name is {name} and age is {age}")

# 18. Encoding
encoded = s.encode()
print("Encoded:", encoded)

# 19. String immutability
x = "Hello"
x.replace("H", "J")
print("Immutability:", x)

# 20. Mutable alternative
from io import StringIO
st = StringIO("Hello")
st.write(" Python")
print("Mutable string:", st.getvalue())
