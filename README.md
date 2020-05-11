# SparkTemplate
A simple **Java-Scala** mixed project **template** for **Apache Spark**
<p align="center">
<img src="images/spark-aws.png" alt="alt text" width="60%" height="37.5%">
</p>
You can simply download and import this project in your IDE (preferably in <a href="https://www.jetbrains.com/idea/">IntelliJ IDEA</a>), then edit your code and export your executable jar file.

Make sure you have installed **Scala plugin** and **sbt** in your IDE!

The settings in sbt.build file are fine to export an executable jar file for **Amazon EMR 5.29.0**

You can export the project in IntelliJ IDEA as follows:

"View" > "Tool window" > "sbt" > "SparkTemplate" > "SparkTemplate (root)" > "sbt tasks" > "assembly"

Your jar file will be located in target/scala-2.x
