FROM maven:latest
RUN mkdir /qlchuyenbay-spring-jpa-api
WORKDIR /qlchuyenbay-spring-jpa-api
COPY . .
RUN mvn clean install
EXPOSE 8080
#port của sping-boot container
CMD ["mvn", "spring-boot:run"]



