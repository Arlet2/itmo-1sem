import time,re
def create_spaces(count) -> str:
    return ' '*count
def process_object(s) -> str:
    new_s = ""
    counter = -2 # отступ для глобального объекта
    skip = False
    for i in range(len(s)-1):
        if skip:
            skip = False
            continue
        # если не символ объекта, то записываем в новую строчку
        if s[i] != '{' and s[i] != '}' and s[i] != '\n' and s[i] != ']':
            new_s+=s[i]
        # создаем отступы при каждой новой строчке
        elif s[i] == '\n':
            new_s+='\n'+create_spaces(counter)
        # удаляем { добавляем отступ
        elif s[i] == '{':
            counter+=2
        # убираем отступ
        elif s[i] == '}':
            counter-=2
        # убираем запятые после списков
        elif s[i] == ']':
            new_s+=s[i]
            if s[i+1] == ',':
                skip = True

    return new_s
t = time.time()
for i in range(10):
    file = open("schedule3.yml","w",encoding='UTF-8')
    with open("schedule.json","rt",encoding="UTF-8") as f:
        s = f.read()
    s = re.sub(r"\"([\w\d]*)\"\s*:\s*\"([\w\d:\-\s,.\(\)]*)\",*",r"\1: \2",s) # пробелы
    s = re.sub(r"\s*([^\n]*\n)",r"\1",s) # ключи
    s = re.sub(r"\"([^\"]*)\"(:[\{\[])",r"\1\2",s) # ключи объектов и списков
    s = re.sub(r"\"([^\"]*)\":",r"\1:",s) # простые списки
    s = process_object(s) # обработка отступов у объектов
    s = re.sub(r"\n\s*\n",r"\n",s) # удаляем пустые строки
    s = re.sub(r"^\n",r"",s) # удаляем пустую строку в начале
    s = re.sub(r"\n\s{2},\n\s*([^\n]*\n)",r"\n- \1",s) # создание списка
    s = re.sub(r"\[\n\s{2}([^\n]*\n)",r"\n- \1",s) # создание начала списка
    s = re.sub(r"[^\w\d]]",r"",s) # удаление конца списка
    s = re.sub(r"\n\s+,",r"",s) # удаление лишних запятых
    file.write(s)
    file.close()

print(float(time.time())-float(t))