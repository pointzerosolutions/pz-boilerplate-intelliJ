# pz-boilerplate-intelliJ

Template project for IntelliJ/Gradle workflows with:
- plan-driven delivery
- issues-log governance
- versioning + rollback checkpoints
- production build path that avoids test compilation/execution

## Core Commands

```bash
./gradlew build
./gradlew qualityGate
./gradlew prodBuild
./gradlew documentationManifest
./gradlew -q versionInfo
VERSION_PART=patch ./gradlew versionBump
CHECKPOINT_LABEL="before-change" ./gradlew createRollbackCheckpoint
```

## Process Evolution

This skeleton is intended to evolve.

If a project adds a process that should become standard:
1. Human approves the process change.
2. Update project `AI-POLICY.md` and changelog.
3. Port that change into this skeleton (`pz-boilerplate-intelliJ`).
4. Add an entry to `docs/process-evolution-log.md` with date, source project, and rationale.

No process is considered de-facto standard until reflected here.
