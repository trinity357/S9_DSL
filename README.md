# DSL Arduino project 

## Team :family: 
- Thomas CANAVA
- Loïc GARDAIRE 
- Johann MORTARA 

## Launching the examples
### MPS
**`external`**

The examples are in the sandbox of the project.
To launch them you must open the `external` folder with mps, then you must right-click on the language and click on `Rebuild Language 'ArduinoMl'`.

Once done you can right-click on a scenario and and click on `Preview Generated Text` to view the arduino code generated by the *DSL*.

### Groovy
**`internal`**

**:warning: you must have groovy, java >=1.8 and maven installed**

First you must run `build.sh` to build the project.

Then in the `GroovuinoML` folder you can launch a script using `run.sh`.

for example:
```./run.sh scripts/Simple.dsl```

A script outputs the arduino code in a `result.ino` file next to the `run.sh`