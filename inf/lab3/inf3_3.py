import re

def search_strings(string):
    regex = r"\w*[аюуяыэёеио]\w*"
    result = re.findall(r"\b"+regex+r"\b",string,re.I | re.M)
    result_str = []

    for i in result:
        c = re.findall(regex,re.sub(re.search(r"а|ю|у|я|ы|э|ё|е|и|о",i,re.I | re.M).group(0),"",i,re.I | re.M))
        if len(c) == 0:
            result_str.append(i)

    result_str.sort(key=len)

    for i in result_str:
        print(i)

print(338861%4)
test_str = ("Классное слово – обороноспособность,которое должно идти после слов: трава и молоко.\n",
    "Олово оловянный\n",
    "\n",
    "Колокол течет речь\n",
    "Висит\n",
    "Ерись несёт и ценизм\n")

for i in test_str:
    i = i.lower()
    search_strings(i)