FROM gradle:jdk19-alpine
WORKDIR /app
COPY . /app/
RUN gradle build
CMD gradle run