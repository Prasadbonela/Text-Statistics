# Text Statistics

The purpose of this task is to practice using `Map` functional methods.

Duration: _1 hour_.

## Description

In this task, your goal is  to implement `TextStatistics` methods,
which return `TokenStatisticsCalculator` implementations. Using `Map` methods like `put` or `replace` is forbidden.
So, you can use only `compute`, `merge`, `computeIfAbsent`, and `computeIfPresent` to change `Map` content.

The `TokenStatisticsCalculator` accepts `Map<K, V>` and `Iterator<K>`. The iterator provides tokens for processing,
and the map is used as input/output parameter and all the changes must be applied to it.

## Requirements

The `TextStatistics` class has 4 methods:

1. `countTokens`
   * Counts token's appearance in the iterator's sequence
   * The map must contain tokens as keys and the number how many times they appear in the sequence
2. `countKnownTokensWithMaxLimit`
   * Counts tokens which are already present in the map
   * If a token met more than defined by `maxLimit` times, then the corresponding value in the map must not be changed
3. `findUnknownTokensOfTypes`
   * Marks tokens which are not present in the map and has a specific type
   * If a token has type as defined by `types` argument, then the value must be set to `true`.
   * If a token does not meet the requirements, then it must not be added to the map
4. `combinedSearch`
   * Defines a specific code for tokens
   * If the map does not contain a token from the iterators sequence,
   then the token stores in the map with `-1` value.
   * If the map contains a token from the sequence, its type is one of the defined by `types` argument,
   and its count is less than `maxLimit`, then it stores with `0` value.
   * If the map contains a token and its type is one of the defined by `types` argument,
   but its count exceeds `maxLimit`, then it stores with `1` value.
   * If the map contains a token, its count less than `maxLimit`,
   but its type is not one of the `types`, then it stores with `2` value.
   * If the map contains a token, but its type is not one of the `types` and its count exceeds `maxLimit`,
   then it stores with `3` value.

## Examples

```java
Map<Token, Long> map = new HashMap<>();
List<Token> sequence = List.of(
    new Token("name"),
    new Token("name"),
    new Token("name"),
    new Token("surname"),
    new Token("surname"),
    new Token("age")
        );
TextStatistics.coundTokens().calculate(map, sequence.iterator());
assert map.get("name") == 3
assert map.get("surname") == 2
assert map.get("age") == 1
```
