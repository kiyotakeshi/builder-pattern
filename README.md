# Run

```shell
$ /usr/libexec/java_home -V                      
Matching Java Virtual Machines (3):
    14.0.2, x86_64:     "OpenJDK 14.0.2"        /Users/kiyotakeshi/Library/Java/JavaVirtualMachines/adopt-openjdk-14.0.2/Contents/Home
    11.0.8, x86_64:     "OpenJDK 11.0.8"        /Users/kiyotakeshi/Library/Java/JavaVirtualMachines/adopt-openjdk-11.0.8/Contents/Home
    1.8.0_265, x86_64:  "OpenJDK 8"     /Users/kiyotakeshi/Library/Java/JavaVirtualMachines/adopt-openjdk-1.8.0_265/Contents/Home

$ export JAVA_HOME=`/usr/libexec/java_home -v "11"`

$ java -version
openjdk version "11.0.8" 2020-07-14
OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.8+10)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.8+10, mixed mode)

$ mvn clean install

$ mvn exec:java
```