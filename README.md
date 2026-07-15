# example-java-maven-multimodule

Bomly smoke-test fixture: a Maven reactor with a `pom`-packaging parent
and two modules — `core` (pinned vulnerable `commons-lang3 3.12.0`) and
`web` (depends on the `core` module plus pinned vulnerable
`jackson-databind 2.13.0`).

Pinned by tag for deterministic goldens — do not update dependencies.
