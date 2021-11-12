import re

print(338861%4)
regex = r"\b[^аиеёоуыэюя\s]*([аиеёоуыэюя])([^аиеёоуыэюя\s]*\1)*[^аиеёоуыэюя\s,\-\!\?\.]*\b"
def search_strings(string):
    result = re.finditer(regex,string,re.IGNORECASE)
    matches = []
    for i in result:
        matches.append(i.group(0))
    matches.sort(key=len)
    for i in matches:
        print(i)
test_str = ["Классное слово – обороноспособность,которое должно идти после слов: трава и молоко.\n",
    "Олово оловянный\n",
    "\n",
    "Колокол течет речь\n",
    "Висит\n",
    "Ерись несёт ценизм ва-банк\n"]
for i in test_str:
    search_strings(i)