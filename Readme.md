#Inject service to static method

in actually, creating an util is inevitable. So, how to inject it.

## Step 1: create a component

`StaticContextInitializer` with

```java
    @Autowired
    ExampleService exampleService;
    @PostConstruct
    public void init() {
        StaticUtils.setMyConfig(exampleService);
    }
```

in `StaticUtils` we define a method and need to `@Component`

```java
    // injection service to static class
    private static ExampleService exampleService;
    public static void setMyConfig(ExampleService exampleService) {
        StaticUtils.exampleService = exampleService;
    }
```

    curl --location 'localhost:8080/getValue?type=1'
    curl --location 'localhost:8080/getValue?type=2'
    curl --location 'localhost:8080/getValue?type=3'
    curl --location 'localhost:8080/getValue?type=4'