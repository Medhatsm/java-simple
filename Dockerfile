FROM openjdk:11

COPY sl-build-scanner.jar sl-build-scanner.jar
COPY sltoken.txt sltoken.txt
COPY /src/main/java/com/tga/App.java App.java
COPY script.sh script.sh
RUN javac App.java
#RUN chmod +777 /tmp
#RUN touch /tmp/buildSessionId.txt
#RUN java -jar sl-build-scanner.jar -config -buildsessionidfile "/tmp" -tokenfile sltoken.txt -appname "myApp-medhat" -branchname "main" -buildname "5" -pi "*"
#RUN java -jar sl-build-scanner.jar -scan -tokenfile sltoken.txt -buildsessionidfile buildSessionId.txt -workspacepath "." -fi "*.class" -r
CMD ["./script.sh"]
