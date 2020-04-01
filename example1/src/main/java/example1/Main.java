package example1;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.function.Function;

public class Main<ModelA, ModelB, Value> {
    private final Function<Function<ModelA, @Nullable Value>, Function<ModelB, @Nullable Value>> proxyFunction;

    public Main(Function<Function<ModelA, @Nullable Value>, Function<ModelB, @Nullable Value>> proxyFunction) {
        this.proxyFunction = proxyFunction;
    }
}
