# error-handling-in-spring-boot
How to handle the invalid argument exception in Spring Boot Project
Before the error handling, any kind of argument will be saved to databases, which is not what we want.
After the proper error handling, we can see that, only valid argument data will be saved.

## Using Spring Boot Validation to validate the argument when the user signing up

![image](https://github.com/geekqq/error-handling-in-spring-boot/assets/53326015/49a8b2e7-f92b-4fb8-ac81-d38d925613cc)

## When get a specific user from database, return error when the user doesn't exsit.
![image](https://github.com/geekqq/error-handling-in-spring-boot/assets/53326015/6ea9b393-6ad4-47ff-a87b-7530300f5da6)

## Below is the error handling logic:
![image](https://github.com/geekqq/error-handling-in-spring-boot/assets/53326015/ecbdfe73-505a-4002-9e2e-63c62f88df28)
