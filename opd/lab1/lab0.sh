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
cp kricketot6 aggron3/gorebyss/
ln -s hariyama8 aggron3/empoleonhariyama

chmod 737 aggron3/gorebyss # helper
chmod u+r aggron3/empoleon # helper
cp -r -P aggron3 aggron3/gorebyss

chmod 337 aggron3/gorebyss # helper
chmod u-r aggron3/empoleon # helper

cat kricketot6>sudowoodo1/larvitarkricketot

chmod u+r ferroseed3 # helper
chmod u+w krabby8 # helper
ln ferroseed3 krabby8/hitmontopferroseed
chmod u-r ferroseed3 # helper
chmod u-w krabby8 # helper

cat sudowoodo1/larvitar krabby8/toxicroak > hariyama8_58
ln -s krabby8 Copy_56

#4

mkdir tmp
wc -m hariyama8 1>tmp/info 2>tmp/errors
ls -Ru | grep "^m" | tail -2
cat aggron3/tranguill aggron3/empoleon 2>&1 | grep "r$"
ls -Ru 2>/dev/null | grep "fe" | head -2
wc -m sudowoodo1/* 2>tmp/errors | sort -r
ls -Ru | grep "3$" | sort -r

#5
rm -f hariyama8
rm sudowoodo1/growlithe
rm aggron3/empoleonhariyama
chmod u+w krabby8 # helper
rm -f krabby8/hitmontopferroseed
rm -rf krabby8
chmod u+r aggron3/gorebyss # helper
rm -rf aggron3/gorebyss