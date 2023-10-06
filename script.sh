#!/bin/sh +x

java -jar sl-build-scanner.jar -config -tokenfile sltoken.txt -appname "myApp-medhat" -branchname "main" -buildname "6" -pi ""
java -jar sl-build-scanner.jar -scan -tokenfile sltoken.txt -buildsessionidfile buildSessionId.txt -workspacepath "." -fi "*.class" -r


