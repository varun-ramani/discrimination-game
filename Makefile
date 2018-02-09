CC := g++
BINARY := disc.exe

all: bin/$(BINARY)

bin/$(BINARY): bin/main.o bin/game.o bin/level1.o bin/level2.o bin/level3.o
	g++ 
