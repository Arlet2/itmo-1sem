import re
# Мой смайлик: 338861 -> ;</
print(str(338861%5) + " " + str(338861%4) + " " + str(338861%7))
print("My smile: ;</")
def calculate(string):
    print("Current string: "+string)
    #подсчёт с помощью регулярных выражений
    print("Regular: "+str(len(re.findall(";</",string))))
    #подсчёт с помощью средств python
    print("Simple: "+str(string.count(";</")))
my_string = input()
# строки для тестирования
test = [";<\\",
" ; < / ;< / ; </ ;</ /<;",
";<</ ;;</ ;<// ;<?",
"",
";</;</;</;</ ;</ "]
if my_string != "":
    test.append(my_string)
for s in test:
    calculate(s)
