This module demonstrates, that CheckerFramework processes lambda parameters in incorrect way applying to them invalid types

Output of CheckerFramework build is below. For common information please refer [README.md for project](../README.md)

```
> Task :example1:compileJava
/home/eirnym/t/example1/src/main/java/example1/SubClass.java:5: error: [lambda.param.type.incompatible] incompatible parameter types in lambda expression.
        super(x -> x);
              ^
  found   : @Initialized @NonNull Function<ModelA[ extends @Initialized @Nullable Object super @Initialized @NonNull Void], Value[ extends @Initialized @Nullable Object super @Initialized @Nullable Void]>
  required: @Initialized @NonNull Function<ModelA[ extends @Initialized @Nullable Object super @Initialized @NonNull Void], Value[ extends @Initialized @Nullable Object super @Initialized @NonNull Void]>
/home/eirnym/t/example1/src/main/java/example1/SubClass.java:5: error: [return.type.incompatible] incompatible types in return.
        super(x -> x);
                   ^
  type of expression: @Initialized @NonNull Function<ModelA[ extends @Initialized @Nullable Object super @Initialized @NonNull Void], Value[ extends @Initialized @Nullable Object super @Initialized @NonNull Void]>
  method return type: @Initialized @NonNull Function<ModelA[ extends @Initialized @Nullable Object super @Initialized @NonNull Void], Value[ extends @Initialized @Nullable Object super @Initialized @Nullable Void]>
2 errors
```
