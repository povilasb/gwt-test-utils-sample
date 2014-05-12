#
# This Makefile manually runs Junit tests with java command.
#

CLASSPATH = "lib/junit-4.11.jar:lib/hamcrest-core-1.3.jar:tmp/classes/test:lib/gwt-test-utils-0.47.jar:lib/javassist-3.15.0-GA.jar:lib/gwt-user-2.6.0.jar:lib/gwt-dev-2.6.0.jar:lib/slf4j-api-1.6.1.jar:tmp/classes/src:tmp/javaparser-1.0.8.jar"
CLASSPATH = "lib/*:tmp/classes/test"
TEST_CLASS = com.example.gwtTestUtils.client.PersonTest

all:
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore $(TEST_CLASS)
.PHONY: all
