import re
print(338861%6)
regex = r"\b\w*[аюуяыэёеио]{2}\w*\b(?=\W*(\b([аюуяыэёеио]*[^аюуяыэёеио\s][аюуяыэёеио]*){1,3}\b)|(\b[аюуяыэёеио]+\b))"

test_str = ("Кривошеее существо гуляет по парку\n"
    "Здравствууйте, амиго\n"
    "Аа регулааааа\n"
    "Проживающий в общежитии купил себе что-то\n"
    "\n"
    "Опр ааа рппп аааааа реуууасн\n")
my_string = input()
test_str += my_string + '\n'
# находит все вхождения в строке и возвращает итератор на коллекцию подходящих элементов
matches = re.finditer(regex, test_str, re.MULTILINE | re.IGNORECASE)
for match in matches:
    print (match.group())
