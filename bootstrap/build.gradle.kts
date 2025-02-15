dependencies {
  compileOnly("com.google.auto.value:auto-value-annotations")
  annotationProcessor("com.google.auto.value:auto-value")

  // slf4j is included in the otel javaagent, no need to add it here too
  compileOnly("org.slf4j:slf4j-api")
  // required to access OpenTelemetryAgent
  compileOnly("io.opentelemetry.javaagent:opentelemetry-javaagent-bootstrap")

  // add micrometer to the bootstrap classloader so that it's available in instrumentations
  implementation("io.micrometer:micrometer-core")

  testImplementation("org.slf4j:slf4j-api")
}

tasks {
  compileJava {
    options.release.set(8)
  }
}
