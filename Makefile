run: compile
	@cd classes && java Tokenizer

compile:
	@javac -d classes source/*.java
