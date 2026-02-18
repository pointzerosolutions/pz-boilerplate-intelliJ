# AI Policy

## Governance
- Only a human may approve policy changes.
- Agents must not relax this file autonomously.
- If a showstopper blocks progress (auth, permissions, service limits, missing prerequisites), escalate immediately to the human owner with exact blocker details and smallest unblock action required.

## Source of Truth
- Version: `VERSION`
- Plan: `docs/project-plan.md`
- Plan progress: `docs/project-plan-progress.csv`
- Issues log: `docs/issues-log.csv`
- Session log: `SESSION_CHANGELOG.md`

## Standard Cycle
1. Issues-log preflight.
2. Implement change.
3. Run targeted checks.
4. Run `./gradlew qualityGate` for substantial changes.
5. Update docs/changelog/manifests.

## Build Modes
- Default build: `./gradlew build`
- Production build (no test compilation/execution): `./gradlew prodBuild`

## Versioning and Rollback
- Canonical version lives in `VERSION`.
- Use `versionBump` to change version.
- Use `createRollbackCheckpoint` before high-risk changes.
- Use `rollbackCheckpoint` dry-run by default; apply only with explicit flag.

## Issues Log Discipline
- If touched files overlap issue `components`, reference issue IDs in changelog entries.
- If output is accepted but known imperfect, log a low/medium issue before handoff.

## Process Evolution Mechanism
- New process discovered in any project becomes candidate standard.
- After explicit human approval, backport it into `pz-boilerplate-intelliJ`.
- Record each adoption in `docs/process-evolution-log.md`.
- Future projects should start from latest skeleton state.
