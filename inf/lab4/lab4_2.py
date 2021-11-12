import yaml,json,time
t = time.time()
for i in range(10):
    with open("schedule.json","rt",encoding="UTF-8") as f:
        data = json.load(f)
    with open("schedule2.yml","w",encoding="UTF-8") as f:
        yaml.dump(data,f,allow_unicode=True)
print(float(time.time())-float(t))