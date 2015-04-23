# ExcelPojos
Simple lib to read a xls file and load a list of java objects and vice-versa.
Was developed to have zero configuration and just for pojos.

## Who is it for?
- I want a simple lib to read/write my objects to xls file. (Apache POI under the hood)
- I want it zero configuration. (Uses reflection)
- I don't care if it has no flexibility and plugins or hooks.

## How to use it?
To read:
```java
Excel excel = new Excel("TestCaseData.xls");
List<Case> results = excel.read(myClass.class.getName(), sheetName);
excel.close();
```

To write:
```java
Excel excel = new Excel("Path to my file.xls");
excel.write(myList);
excel.close();
```


Example from [Excel test class (https://github.com/rafaelvanat/ExcelPojos/blob/master/src/tests/com/stinted/excel/test/ExcelTest.java)]

To install this in your maven, first succesfully build it your machine, then:
```
mvn install:install-file -Dfile=<path to  jar> -DgroupId="com.stinted.excel" 
-DartifactId="excelPojo" -Dversion="1.0-SNAPSHOT" -Dpackaging=jar
OR
mvn install:install-file -Dfile=<path to jar> -DpomFile=<path to POM>
```

Finally, add this to your pom:
```xml
<dependency>
	<groupId>com.stinted.excel</groupId>
	<version>1.0-SNAPSHOT</version>
	<artifactId>excelPojo</artifactId>
</dependency>
```

### License
ExcelPojos is [Apache 2.0 licensed](http://www.apache.org/licenses/LICENSE-2.0.html).
