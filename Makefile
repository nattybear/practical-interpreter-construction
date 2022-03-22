run: compile
	cd classes && java Calculator

compile:
	javac -d classes source/*.java
