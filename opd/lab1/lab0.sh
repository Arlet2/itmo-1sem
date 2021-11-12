#!/bin/sh

#1
mkdir aggron3
touch ferroseed3
touch hariyama8
mkdir krabby8
touch kricketot6
mkdir sudowoodo1

cd aggron3
touch tranguill
mkdir gorebyss
touch empoleon
cd ..

cd krabby8
touch hitmontop
touch toxicroak
mkdir croagunk
touch squirtle
touch pelipper
mkdir metang
cd ..

cd sudowoodo1
touch growlithe
touch magmortar
touch unfezant
touch larvitar
mkdir patrat
mkdir clamperl
cd ..

cd aggron3
echo "Ходы  Heat Wave Roost Sky Attack Sleep Talk Snore Tailwind
Uproar">tranguill
echo "Способности  Growl Bubble Swords Dance Peck Metal
Claw Bubblebeam Swagger Fury Attack Brine Aqua Jet Whirlpool Mist
Drill Peck Hydro Pump">empoleon
cd ..

echo "Живет  Cave
Moutnain">ferroseed3

echo "Способности  Sand-Attack Arm Thrust Vital Throw
Fake Out Whirlwind Knock Off Smellingsalt Belly Drum Force Palm
Seismic Toss Wake-Up Slap Endure Close Combat Reversal Heavy
Slam">hariyama8

cd krabby8
echo "Развитые способности  Steadfast">hitmontop
echo "Способности
Mud-Slap Poison Sting Taunt Pursuit Faint Attack Revenge Swagger Mude
Bomb Sucker Punch Venoshock Nasty Plot Poison Jab Sludge Bomb
Flatter">toxicroak
echo "satk=5 sdef=6 spd=4">squirtle
echo "Способности Torrent
Mach Speed Keen Eye Frisk">pelipper
cd ..

echo "Живет  Forest
Grassland">kricketot6

cd sudowoodo1
echo "satk=7 sdef=5 spd=6">growlithe
echo "Ходы  Body Slam
Counter Cove Double-Edge Dual Chop Dynamicpunch Fire Punch Focus
Punch Heat Wave Helping Hand Iron Tail Low Kick Mega Kick Mega Punch
Mud-Slap Rock Climb Seismic Toss Sleep Talk Smogǂ Snore Thunderpunchǂ
Uproar">magmortar
echo "Возможности  Overland=6 Surface=1 Sky=10 Jump=4
Power4=0 Intelligence=4 Guster=0">unfezant
echo "Развитые способности  Sand
Veil">larvitar
cd ..

#2
chmod ugo+rwx aggron3
chmod g-r aggron3

cd aggron3
chmod 666 tranguill
chmod 337 gorebyss
chmod 006 empoleon
cd ..

chmod 006 ferroseed3

chmod 000 hariyama8
chmod ug+r hariyama8

chmod 512 krabby8

cd krabby8
chmod 664 hitmontop
chmod 666 toxicroak
chmod ugo+rwx croagunk
chmod 444 squirtle

chmod ug=r pelipper
chmod o-rwx pelipper
chmod 307 metang

cd ..

chmod ugo-rwx kricketot6
chmod u+rw kricketot6
chmod g+w kricketot6

chmod u+rwx sudowoodo1
chmod g=rw sudowoodo1
chmod o=r sudowoodo1

cd sudowoodo1

chmod ugo-rwx growlithe
chmod u=rw growlithe
chmod o+r growlithe

chmod 000 magmortar
chmod ug+w magmortar
chmod u+r magmortar

chmod ug=r unfezant
chmod u+w unfezant
chmod o-rwx unfezant

chmod ugo-rwx larvitar
chmod u+r larvitar

chmod ugo+rwx patrat

chmod 511 clamperl

cd ..

#3
#.1 скопировать файл kricketot6 в директорию lab0/aggron3/gorebyss
cp kricketot6 aggron3/gorebyss/
#.2 cоздать символическую ссылку для файла hariyama8 с именем lab0/aggron3/empoleonhariyama
ln -s hariyama8 aggron3/empoleonhariyama
#.3 скопировать рекурсивно директорию aggron3 в директорию lab0/aggron3/gorebyss
chmod 737 aggron3/gorebyss
chmod u+r aggron3/empoleon
cp -r -P aggron3 aggron3/gorebyss
chmod 337 aggron3/gorebyss
chmod u-r aggron3/empoleon
#.4 скопировать содержимое файла kricketot6 в новый файл lab0/sudowoodo1/larvitarkricketot
cat kricketot6>sudowoodo1/larvitarkricketot
#.5 cоздать жесткую ссылку для файла ferroseed3 с именем lab0/krabby8/hitmontopferroseed
chmod u+r ferroseed3
chmod u+w krabby8
ln ferroseed3 krabby8/hitmontopferroseed
chmod u-r ferroseed3
chmod u-w krabby8
#.6 объеденить содержимое файлов lab0/sudowoodo1/larvitar, lab0/krabby8/toxicroak, в новый файл lab0/hariyama8_58
cat sudowoodo1/larvitar krabby8/toxicroak > hariyama8_58
#.7 создать символическую ссылку c именем Copy_56 на директорию krabby8 в каталоге lab0
ln -s krabby8 Copy_56

#4

#.1 Подсчитать количество символов содержимого файла hariyama8, результат записать в файл в директории /tmp, ошибки доступа перенаправить в файл в директории /tmp
mkdir tmp
wc -m hariyama8 1>tmp/info 2>tmp/errors
#.2 Вывести два последних элемента рекурсивного списка имен и атрибутов файлов в директории lab0, начинающихся на символ 'm', список отсортировать по возрастанию даты доступа к файлу, ошибки доступа не подавлять и не перенаправлять
ls -Ru | grep "^m" | tail -2
#.3 Вывести содержимое файлов: tranquill, empoleon, оставить только строки, заканчивающиеся на 'r', добавить вывод ошибок доступа в стандартный поток вывода
cat aggron3/tranguill aggron3/empoleon 2>&1 | grep "r$"
#.4 Вывести два первых элемента рекурсивного списка имен и атрибутов файлов в директории lab0, содержащих строку "fe", список отсортировать по возрастанию даты доступа к файлу, подавить вывод ошибок доступа
ls -Ru 2>/dev/null | grep "fe" | head -2
#.5 Подсчитать количество символов содержимого файлов в директории sudowoodo1, отсортировать вывод по уменьшению количества, ошибки доступа перенаправить в файл в директории /tmp
wc -m sudowoodo1/* 2>tmp/errors | sort -r
#.6 Рекурсивно вывести содержимое файлов с номерами строк из директории lab0, имя которых заканчивается на '3', строки отсортировать по имени z->a, ошибки доступа не подавлять и не перенаправлять
chmod u+r `ls -d **/* * | grep "3$"`
cat -n `ls -d **/* * | grep "3$"` | sort -r
#5
#.1 Удалить файл hariyama8
rm -f hariyama8
#.2 Удалить файл lab0/sudowoodo1/growlithe
rm sudowoodo1/growlithe
#.3 удалить символические ссылки lab0/aggron3/empoleonhariya*
rm aggron3/empoleonhariyama
#.4 удалить жесткие ссылки lab0/krabby8/hitmontopferrose*
chmod u+w krabby8
rm -f krabby8/hitmontopferroseed
#.5 Удалить директорию krabby8
rm -rf krabby8
#.6 Удалить директорию lab0/aggron3/gorebyss
chmod u+r aggron3/gorebyss
rm -rf aggron3/gorebyss