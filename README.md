# maddi Java demo

A small Maven project for trying maddi's IDE plugins by hand: open it, run the analysis, and check that the
hints, the gutter icons and the tool window say what this project says they should.

Every class shows one or two of maddi's annotations, and its Javadoc says what to look for. The popular annotations
(`@NotModified`/`@Modified`, `@Immutable`, `@Container`, `@Independent`) recur throughout; the rare ones have a class
each. [EXPECTED-HINTS.md](EXPECTED-HINTS.md) lists, per declaration, exactly what the analysis computes.

The classes are adapted from the test batteries of `maddi-modification-analyzer` and `maddi-modification-link`.

## Opening it

- **IntelliJ IDEA:** *File → Open* on this directory, as a Maven project. Install the maddi plugin, set its JDK (25 or
  later) under *Settings → Tools → maddi*, then *Tools → Analyze with maddi*.
- **Eclipse** (2025-09 or later, with its Maven support, as in *Eclipse IDE for Java Developers*):
  1. *File → Import… → Maven → Existing Maven Projects*, root directory this one, tick `pom.xml`, *Finish*;
  2. install the maddi plugin (*Help → Install New Software…*), and have a JDK 25 or later under *Preferences →
     Java → Installed JREs*, or choose one under *Preferences → maddi*;
  3. turn on *Preferences → Java → Editor → Code Minings → Enable code minings*: Eclipse draws maddi's hints as code
     minings, which are off by default;
  4. right-click the project, *Analyze with maddi*. *Window → Show View → Other… → maddi → maddi Findings* shows the
     run and the two guard findings of `demo.guard`.
- Builds with `mvn compile` on JDK 21 or later. The only dependencies are `io.codelaser:maddi-annotation` and
  `io.codelaser:maddi-support` 0.9.5 from Maven Central, for the contracts and the eventually immutable classes.

## What is where

| Package | Classes | Shows |
|---|---|---|
| `demo.modification` | `Counter`, `Bag`, `ListTools`, `Item`, `Elements`, `Registry` | `@Modified` / `@NotModified` on methods, fields and parameters; `@Container`; `@Modified(hc=true)` where only the elements change |
| `demo.immutable` | `Point`, `Pair`, `Color`, `Snapshot`, `Tags`, `LazyName`, `Shape`, `Circle` | `@ImmutableContainer`, with and without hidden content; `@FinalFields`; `@Final`; a contract on an interface |
| `demo.independence` | `Inventory`, `Box`, `Wrapper` | `@Independent`, `@Independent(hc=true)`, `@Dependent`; `@UnmodifiableView` |
| `demo.method` | `Sentence`, `Checks`, `Person`, `Ranges` | `@Fluent`, `@Identity`, `@GetSet`, `@Commutable` |
| `demo.nullability` | `Lookup` | `@NotNull` / `@Nullable` |
| `demo.eventual` | `Config`, `Document` | `@Mark`, `@Only`, `@TestMark`, `@Immutable(after=...)`, `@NotModified(after=...)` |
| `demo.rare` | `Audit`, `Settings`, `SettingsClient`, `Report`, `Worker`, `Clock`, `Strings` | `@IgnoreModifications`, `@StaticSideEffects`, `@Finalizer`, `@AllowsInterrupt`, `@Singleton`, `@ExtensionClass`, `@UtilityClass` |
| `demo.guard` | `WrongImmutable`, `WrongContainer` | wrong contracts on purpose: two guard findings, with their why-chain |

## Annotations the IDE does not show today

As of 2026-10-27 (regenerated after the fixes of that day), so that a missing hint is not mistaken for a broken plugin:

- **Nullability:** a public parameter whose method accepts null without failing is `@Nullable`, even when no call
  passes null (maddi-mod#68): concatenated (`Tags.tag`), appended to a `StringBuilder` (`Sentence.word`,
  `Report.line`), tested for null (`Checks.orDefault`), or stored where null is already possible (`Person.setName`).
  A parameter stored into a field's list that holds no null stays `@NotNull` (`Bag.add`). `Lookup` itself comes out
  as intended.
- **Contracts the analyzer reads but the IDE does not echo:** `@UtilityClass` (`ListTools`), `@Commutable`
  (`Ranges`), `@AllowsInterrupt` (`Worker`).
- **Not used by the analyzer at all:** `@Singleton` (`Clock`), `@ExtensionClass` (`Strings`), `@BeforeMark`;
  `@Docstring` is documentation, not analysis.
