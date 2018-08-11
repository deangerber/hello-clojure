# Clojure Project using CLI and Deps

A simple application that uses Clojure CLI and deps.edn.

## Requirements

The sample application has the following requirements.

* Java 10.0.2
* Clojure 1.9.0

## Usage

### From the command line

To run the sample application.

~~~ bash
clj -m hello.core
~~~

To execute the testcase.

~~~ bash
clj -A:test
~~~

### Using the included Makefile

To run the sample application.

~~~ bash
make run
~~~

To execute the testcase.

~~~ bash
make test
~~~

## References

* [Java](http://www.oracle.com/technetwork/java/index.html)
* [Clojure](https://clojure.org/index)
* [Clojure Deps and CLI Guide](https://clojure.org/guides/deps_and_cli)
* [Cognitect labs test-runner](https://github.com/cognitect-labs/test-runner)
