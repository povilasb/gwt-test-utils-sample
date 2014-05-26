#
# This Makefile manually runs Junit tests with java command.
#

CLASSPATH = "lib/*:build/classes/test:build/classes/src:src"
TEST_CLASS = com.example.gwtTestUtils.client.PersonTest

all:
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore $(TEST_CLASS)
.PHONY: all
