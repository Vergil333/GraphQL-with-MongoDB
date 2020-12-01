# GraphQL + MongoDB (demo project)
Finally I got some free time so let's try something new.
###Tech stack
- Kotlin
- Spring boot
- GraphQl
- MongoDB (I'm running it inside docker)
###Requirements
- set Environment variables
- create MongoDB
- Java 8 (to run project)
###Set Env variables
You can do this [on system level] or [in IntelliJ IDEA] editor.  
Variables are as follows:
- MONGO_USER_ADMIN=admin
- MONGO_PASS_ADMIN=simplePass
###Create MongoDB
Following cli command creates dockerized MongoDB using our environment variables:  
`docker run --name demo-mongodb -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=simplePass -p 27017:27017 -d mongo --port 27017`
_(Pass env variables as string if you set them inside your editor)_

[on system level]: https://www.schrodinger.com/kb/1842
[in IntelliJ IDEhttps://admin.darujukrev.czadmin/A]: https://www.jetbrains.com/help/objc/add-environment-variables-and-program-arguments.html