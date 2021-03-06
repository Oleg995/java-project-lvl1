.DEFAULT_GOAL := build-run

setup:
	./gradlew wrapper --gradle-version 7.4

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

run-dist:
	./build/install/app/bin/app

run:
	./gradlew run

test:
	./gradlew test

report:
	./gradlew jacocoTestReport

lint:
	./gradlew checkstyleMain

update-deps:
	./gradlew useLatestVersions

check-updates:
	./gradlew dependencyUpdates

comp:
	./gradlew compileJava

build-run: build run

.PHONY: build

