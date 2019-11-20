From openjdk:8
copy ./target/account-0.0.1-DEVELOP.jar account-0.0.1-DEVELOP.jar
CMD ["java","-jar","account-0.0.1-DEVELOP.jar"]
