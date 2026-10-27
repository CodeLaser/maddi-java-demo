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

As of 2026-10-27, so that a missing hint is not mistaken for a broken plugin:

- **Nullability:** `@Nullable` also appears on parameters that no call passes null to (`Bag.add`, `Sentence.word`,
  `Person.setName` and others). `Lookup` itself comes out as intended.
- **Contracts the analyzer reads but the IDE does not echo:** `@UtilityClass` (`ListTools`), `@Commutable`
  (`Ranges`), `@AllowsInterrupt` (`Worker`).
- **Not used by the analyzer at all:** `@Singleton` (`Clock`), `@ExtensionClass` (`Strings`), `@BeforeMark`;
  `@Docstring` is documentation, not analysis.
