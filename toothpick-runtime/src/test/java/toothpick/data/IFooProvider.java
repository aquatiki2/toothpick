package toothpick.data;

import javax.inject.Inject;
import javax.inject.Provider;

public class IFooProvider implements Provider<IFoo> {
  @Inject public Bar bar;

  @Inject public IFooProvider() {
  }

  @Override public IFoo get() {
    return new Foo();
  }
}
