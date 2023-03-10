plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
}

tasks.named<Test>("test") {
    useJUnitPlatform()

    reports {
        junitXml.required.set(true)
        junitXml.mergeReruns.set(true)
    }
}
