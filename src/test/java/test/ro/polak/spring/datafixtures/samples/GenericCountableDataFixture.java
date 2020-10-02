package test.ro.polak.spring.datafixtures.samples;

import ro.polak.spring.datafixtures.DataFixture;
import ro.polak.spring.datafixtures.DataFixtureSet;

public class GenericCountableDataFixture implements DataFixture, CallCountable {

  private int callCount = 0;

  private final DataFixtureSet set;
  private final boolean shouldBeApplied;

  public GenericCountableDataFixture(final DataFixtureSet set) {
    this(set, true);
  }

  public GenericCountableDataFixture(final DataFixtureSet set, final boolean shouldBeApplied) {
    this.set = set;
    this.shouldBeApplied = shouldBeApplied;
  }

  @Override
  public DataFixtureSet getSet() {
    return set;
  }

  @Override
  public boolean shouldBeApplied() {
    return shouldBeApplied;
  }

  @Override
  public void apply() {
    callCount++;
  }

  @Override
  public int getCallCount() {
    return callCount;
  }
}
