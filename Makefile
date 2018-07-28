.PHONY: test

run:
	clj -m hello.core

test:
	clj -Atest
