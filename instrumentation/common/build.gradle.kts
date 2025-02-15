dependencies {
  compileOnly("org.slf4j:slf4j-api")
  compileOnly("io.opentelemetry.instrumentation:opentelemetry-instrumentation-api")
  compileOnly("io.opentelemetry:opentelemetry-api")

  testImplementation("org.slf4j:slf4j-api")
  testImplementation("io.opentelemetry.javaagent:opentelemetry-testing-common")
}
