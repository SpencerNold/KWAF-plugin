plugins {
    java
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        create("KWAF-plugin") {
            id = "me.spencernold.kwaf-plugin"
            implementationClass = "TaskImplPlugin"
        }
    }
}