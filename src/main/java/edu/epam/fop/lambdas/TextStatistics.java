package edu.epam.fop.lambdas;

import edu.epam.fop.lambdas.Token.Type;
import java.util.Set;

public final class TextStatistics {

  private TextStatistics() {
    throw new UnsupportedOperationException();
  }

  public static TokenStatisticsCalculator<Token, Long> countTokens() {
    return null;
  }

  public static TokenStatisticsCalculator<Token, Long> countKnownTokensWithMaxLimit(int maxLimit) {
    return null;
  }

  public static TokenStatisticsCalculator<Token, Boolean> findUnknownTokensOfTypes(Set<Type> types) {
    return null;
  }

  public static TokenStatisticsCalculator<Token, Integer> combinedSearch(int maxLimit, Set<Type> types) {
    return null;
  }

}
