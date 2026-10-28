# Expected hints

What maddi's IDE daemon computes for every declaration of this project, with the annotations in the order the
daemon sends them. *Hidden by default* marks a context default: the plugin's default inline-hints mode ("Hide
context defaults") leaves it out, while the gutter and "Show all" keep it. Declarations without any verdict are
not listed.

Produced on 2026-10-28 by running the daemon's analysis (maddi 0.9.6 development build) over `src/main/java`.
After an analyzer change, the differences from this file are the point of the exercise.

## `demo.eventual.Config`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Immutable(hc=true,after="host,port")`, `@FinalFields` |
| field host | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| field port | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| host() | `@NotModified`, `@Only(after="host")`, `@NotNull` *(hidden by default)* |
| init(String,int) | `@Mark("host,port")`, `@Modified` *(hidden by default)* |
| port() | `@NotModified`, `@Only(after="port")` |
| param h of init(String,int) | `@NotNull` *(hidden by default)* |

## `demo.eventual.Document`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Immutable(hc=true,after="text")`, `@FinalFields` |
| field text | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| commit(String) | `@Mark("text")`, `@Modified` *(hidden by default)* |
| edit(String) | `@Only(before="text")`, `@Modified` *(hidden by default)* |
| isCommitted() | `@NotModified`, `@TestMark("text")` |
| length() | `@NotModified(after="text")`, `@Modified` *(hidden by default)* |
| param s of commit(String) | `@NotNull` *(hidden by default)* |
| param s of edit(String) | `@NotNull` *(hidden by default)* |

## `demo.guard.WrongContainer`

| Declaration | Hints |
|---|---|
| (type) | `@Immutable(hc=true)`, `@Independent` |
| fill(List) | `@NotModified` *(hidden by default)* |
| param target of fill(List) | `@Independent` *(hidden by default)*, `@Modified`, `@NotNull` *(hidden by default)* |

## `demo.guard.WrongImmutable`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@FinalFields` |
| field items | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| add(String) | `@Modified` *(hidden by default)* |
| param s of add(String) | `@NotNull` *(hidden by default)* |

## `demo.immutable.Circle`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| area() | `@NotModified` *(hidden by default)* |

## `demo.immutable.Color`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| next() | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |

## `demo.immutable.LazyName`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| field name | `@Final`, `@NotNull` *(hidden by default)* |
| name() | `@Modified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| reads() | `@NotModified`, `@GetSet("reads")` |
| param name of constructor(String) | `@NotNull` *(hidden by default)* |

## `demo.immutable.Pair`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer(hc=true)` |
| field first | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)* |
| field second | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)* |
| first() | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@GetSet("first")` |
| second() | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@GetSet("second")` |
| swap() | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param first of constructor(Object,Object) | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)* |
| param second of constructor(Object,Object) | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)* |

## `demo.immutable.Point`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| manhattan() | `@NotModified` *(hidden by default)* |
| translate(int,int) | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |

## `demo.immutable.Shape`

| Declaration | Hints |
|---|---|
| (type) | `@Independent` |
| area() | `@NotModified` *(hidden by default)* |

## `demo.immutable.Snapshot`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer(hc=true)` |
| field lines | `@Immutable(hc=true)`, `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| count() | `@NotModified` *(hidden by default)* |
| lines() | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@GetSet("lines")`, `@NotNull` *(hidden by default)* |
| param lines of constructor(List) | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |

## `demo.immutable.Tags`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@FinalFields` |
| field owner | `@NotNull` *(hidden by default)* |
| field tags | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| count() | `@NotModified` |
| tag(String) | `@Modified` *(hidden by default)* |
| param owner of constructor(String) | `@NotNull` *(hidden by default)* |
| param tag of tag(String) | `@Nullable` |

## `demo.independence.Box`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent(hc=true)`, `@Mutable` *(hidden by default)* |
| field content | `@Independent(hc=true)`, `@NotModified` *(hidden by default)*, `@Nullable` |
| get() | `@Independent(hc=true)`, `@NotModified`, `@GetSet("content")`, `@Nullable` |
| set(Object) | `@GetSet("content")`, `@Modified` *(hidden by default)* |
| param content of set(Object) | `@NotModified` *(hidden by default)* |

## `demo.independence.Inventory`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@FinalFields`, `@Dependent` *(hidden by default)* |
| field items | `@Modified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| add(String) | `@Modified` *(hidden by default)* |
| copy() | `@Independent`, `@NotModified`, `@NotNull` *(hidden by default)* |
| exposed() | `@NotModified`, `@GetSet("items")`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| view() | `@UnmodifiableView`, `@NotModified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param item of add(String) | `@NotNull` *(hidden by default)* |

## `demo.independence.Wrapper`

| Declaration | Hints |
|---|---|
| (type) | `@FinalFields`, `@Dependent` *(hidden by default)* |
| field list | `@Modified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| append(String) | `@Modified` *(hidden by default)* |
| list() | `@NotModified`, `@GetSet("list")`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param list of constructor(List) | `@Modified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param s of append(String) | `@NotNull` *(hidden by default)* |

## `demo.method.Checks`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| orDefault(String,String) | `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| requireNonNull(Object,String) | `@Identity`, `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)* |
| requirePositive(int) | `@Identity`, `@NotModified` *(hidden by default)* |
| param dflt of orDefault(String,String) | `@NotNull` *(hidden by default)* |
| param s of orDefault(String,String) | `@Nullable` |
| param t of requireNonNull(Object,String) | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)* |
| param what of requireNonNull(Object,String) | `@Nullable` |

## `demo.method.Person`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| field name | `@Nullable` |
| getAge() | `@NotModified`, `@GetSet("age")` |
| getName() | `@NotModified`, `@GetSet("name")`, `@Nullable` |
| setAge(int) | `@GetSet("age")`, `@Modified` *(hidden by default)* |
| setName(String) | `@GetSet("name")`, `@Modified` *(hidden by default)* |
| param name of setName(String) | `@Nullable` |

## `demo.method.Ranges`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| span(int,int) | `@NotModified` *(hidden by default)* |

## `demo.method.Sentence`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@FinalFields` |
| field sb | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| build() | `@NotModified`, `@NotNull` *(hidden by default)* |
| period() | `@Fluent`, `@Independent` *(hidden by default)*, `@Modified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| word(String) | `@Fluent`, `@Independent` *(hidden by default)*, `@Modified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param w of word(String) | `@Nullable` |

## `demo.modification.Bag`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@FinalFields` |
| field items | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| add(String) | `@Modified` *(hidden by default)* |
| contains(String) | `@NotModified` |
| size() | `@NotModified` |
| param item of add(String) | `@NotNull` *(hidden by default)* |
| param item of contains(String) | `@NotNull` *(hidden by default)* |

## `demo.modification.Counter`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| inc() | `@Modified` *(hidden by default)* |
| reset() | `@Modified` *(hidden by default)* |
| value() | `@NotModified`, `@GetSet("count")` |

## `demo.modification.Elements`

| Declaration | Hints |
|---|---|
| (type) | `@FinalFields`, `@Dependent` *(hidden by default)* |
| field items | `@Modified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| addOwn(Item) | `@Modified` *(hidden by default)* |
| addTo(List,Item) | `@NotModified` |
| touchAll(List) | `@NotModified` |
| touchOwn() | `@Modified(hc=true)` |
| param item of addOwn(Item) | `@NotModified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param item of addTo(List,Item) | `@Independent`, `@NotModified`, `@Nullable` |
| param list of addTo(List,Item) | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| param list of touchAll(List) | `@Independent`, `@Modified(hc=true)`, `@NotNull` *(hidden by default)* |

## `demo.modification.Item`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| touch() | `@Modified` *(hidden by default)* |
| touched() | `@NotModified`, `@GetSet("touched")` |

## `demo.modification.ListTools`

| Declaration | Hints |
|---|---|
| (type) | `@Immutable` |
| addTwice(List,String) | `@NotModified` *(hidden by default)* |
| first(List) | `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| sortInPlace(List) | `@NotModified` *(hidden by default)* |
| param list of addTwice(List,String) | `@Independent` *(hidden by default)*, `@Modified`, `@NotNull` *(hidden by default)* |
| param list of first(List) | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param list of sortInPlace(List) | `@Independent` *(hidden by default)*, `@Modified`, `@NotNull` *(hidden by default)* |
| param s of addTwice(List,String) | `@Nullable` |

## `demo.modification.Registry`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@FinalFields`, `@Dependent` *(hidden by default)* |
| field ids | `@Modified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| clear() | `@Modified` *(hidden by default)* |
| lookup(String) | `@Independent`, `@NotModified`, `@Nullable` |
| register(String,int) | `@Modified` *(hidden by default)* |
| param name of lookup(String) | `@NotNull` *(hidden by default)* |
| param name of register(String,int) | `@NotNull` *(hidden by default)* |

## `demo.nullability.Lookup`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer(hc=true)` |
| field entries | `@Immutable(hc=true)`, `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| describe(String) | `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| find(String) | `@NotModified` *(hidden by default)*, `@Nullable` |
| findOrEmpty(String) | `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| name(String) | `@NotModified` *(hidden by default)* |
| param entries of constructor(Map) | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param key of find(String) | `@NotNull` *(hidden by default)* |
| param key of findOrEmpty(String) | `@NotNull` *(hidden by default)* |
| param s of describe(String) | `@Nullable` |
| param s of name(String) | `@NotNull` *(hidden by default)* |

## `demo.rare.Audit`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| field buffer | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| add(int) | `@Modified` *(hidden by default)* |
| log(String) | `@Modified` *(hidden by default)* |
| twice(int) | `@NotModified` |
| param s of log(String) | `@NotNull` *(hidden by default)* |

## `demo.rare.Clock`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| field INSTANCE | `@Independent`, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| tick() | `@Modified` *(hidden by default)* |

## `demo.rare.Report`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@FinalFields` |
| field sb | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| build() | `@NotModified`, `@NotNull` *(hidden by default)* |
| line(String) | `@Fluent`, `@Independent` *(hidden by default)*, `@Modified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param s of line(String) | `@Nullable` |

## `demo.rare.Settings`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| raise() | `@NotModified` |

## `demo.rare.SettingsClient`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer(hc=true)`, `@Independent` |
| bump() | `@StaticSideEffects`, `@NotModified` *(hidden by default)* |
| compute(int) | `@NotModified` *(hidden by default)* |
| configure() | `@StaticSideEffects`, `@NotModified` *(hidden by default)* |

## `demo.rare.Strings`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| isPalindrome(String) | `@NotModified` *(hidden by default)* |
| repeat(String,int) | `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| reverse(String) | `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param s of isPalindrome(String) | `@NotNull` *(hidden by default)* |
| param s of repeat(String,int) | `@NotNull` *(hidden by default)* |
| param s of reverse(String) | `@NotNull` *(hidden by default)* |

## `demo.rare.Worker`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| done() | `@NotModified`, `@GetSet("done")` |
| pause() | `@NotModified` |
| work() | `@Modified` *(hidden by default)* |

## Guard findings

- `guard/WrongContainer.java:13`: parameter 'target' of demo.guard.WrongContainer.fill(java.util.List) is modified, violating the @Container contract on demo.guard.WrongContainer
- `guard/WrongImmutable.java:17`: Method 'add' modifies field 'items' ('items.add(...)'), violating rule 1 (all fields @NotModified) of the @Immutable contract on demo.guard.WrongImmutable
