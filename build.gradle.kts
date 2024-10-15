plugins {
    id("java")

}

group = "com.labpqsdr"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:2.0.16")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-reload4j
//    testImplementation("org.slf4j:slf4j-reload4j:2.0.16")
// https://mvnrepository.com/artifact/ch.qos.logback/logback-classic
    testImplementation("ch.qos.logback:logback-classic:1.5.10")
}

tasks.test {
    useJUnitPlatform()
}